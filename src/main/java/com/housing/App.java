package com.housing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Baraxlo baraxlo = (Baraxlo)context.getBean("baraxlo");
        System.out.println("1: "+baraxlo.toString());

        Catalog catalog = (Catalog)context.getBean("catalog");
        System.out.println("2: "+catalog.getBaraxlo().toString());

        Catalog2 catalog2 = (Catalog2)context.getBean("catalog2");
        System.out.println("3: "+catalog2.getCatalog().getBaraxlo().toString());
    }
}
