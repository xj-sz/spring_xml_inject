package jx.nc.achilsh.demo20210204;

import jx.nc.achilsh.demo20210204.BeanXmlCall.DemoCall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class Demo20210204Application {

    public static void main ( String[] args ) {

        String xmlPath = "src/main/resources/spring-bean.xml";
        ApplicationContext ctx = new FileSystemXmlApplicationContext (xmlPath);
        DemoCall demo = (DemoCall)ctx.getBean("demoCall");
        demo.display ();

        DemoCall  otherdemo = (DemoCall)ctx.getBean("demoCallSet");

        otherdemo.arrDisplay();

        DemoCall setDemo = (DemoCall)ctx.getBean("autoSetter");
        setDemo.setDisplay ();


        SpringApplication.run ( Demo20210204Application.class , args );
    }

}
