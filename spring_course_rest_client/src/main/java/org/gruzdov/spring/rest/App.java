package org.gruzdov.spring.rest;

import org.gruzdov.spring.rest.configuration.MyConfig;
import org.gruzdov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
/*        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication"
                , Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        Employee empBiID = communication.getEmployee(1L);
        System.out.println(empBiID);

 */
        System.out.println("hello");
    }
}
