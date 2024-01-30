package com.hexaware.test_springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.test_springjdbc.entity.Country;
import com.hexaware.test_springjdbc.service.IService;
import com.hexaware.test_springjdbc.service.IServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(CountryConfig.class);
//        Country c1 = context.getBean(Country.class);
//        c1.setCname("India");
//        c1.setCaptial("Delhi");
//        c1.setPopulation(140);
        
        IService service = context.getBean(IServiceImpl.class);
       // service.addCountry(c1);
       List<Country>list =  service.showAllCountry() ;
       System.out.println(list);
       
    }
}
