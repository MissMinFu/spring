package com.example.MySpringBoot.IOC;

import java.io.InputStream;

/**
 * @program:MySpringBoot
 * @description:
 * @author: nevada
 * @create: 2020-04-22 16:07
 **/
public interface Resource {
    InputStream getInputStream() throws Exception;
}
