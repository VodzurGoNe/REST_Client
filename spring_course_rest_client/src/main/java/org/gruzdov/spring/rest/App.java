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
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication"
                , Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        Employee empBiID = communication.getEmployee(16L);
        System.out.println(empBiID);


//        Employee emp = new Employee("Valdemar", "Stukov"
//                , "IT", 100);
//        emp.setId(22L);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(2L);

    }
}
