package com.example.MySpringBoot.IOC;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @program:MySpringBoot
 * @description:
 * @author: nevada
 * @create: 2020-04-22 16:08
 **/
public class URLResource implements Resource{

    private String configLocation;
    public URLResource(String configLocation){
        this.configLocation=configLocation;
    }
    @Override
    public InputStream getInputStream() throws Exception {
        URL url=this.getClass().getClassLoader().getResource(configLocation);
        URLConnection urlConnection=url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
