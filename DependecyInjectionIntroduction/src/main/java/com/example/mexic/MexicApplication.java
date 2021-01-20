package com.example.mexic;

import com.example.mexic.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MexicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(MexicApplication.class, args);

        MyController myControllers = (MyController) ctx.getBean("myController");


        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        System.out.println("----Primary Bean");
        System.out.println(myControllers.sayHello());

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println("Property");

        System.out.println(propertyInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println("______________________________");

        System.out.println("Setter");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("______________");

        System.out.println("Constructor");

        ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");

        System.out.println(contructorInjectedController.getGreeting());
    }

}
