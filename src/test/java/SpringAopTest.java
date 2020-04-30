//import com.example.MySpringBoot.AOP.ProxyFactory;
import com.example.MySpringBoot.Model.HelloService;
import com.example.MySpringBoot.Model.HelloServiceImpl;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @program:MySpringBoot
 * @description: spring aop 功能的原生测试
 * @author: nevada
 * @create: 2020-04-22 17:22
 **/

public class SpringAopTest {
    @Test
    public void main(){
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) new ProxyFactory(helloService).getProxy();
        proxy.sayHelloWorld();
    }
}
