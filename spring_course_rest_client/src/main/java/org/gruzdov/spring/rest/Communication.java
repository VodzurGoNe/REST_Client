package org.gruzdov.spring.rest;

import org.gruzdov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/spring_course_rest/api/employees";

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null
                , new ParameterizedTypeReference<List<Employee>>() {});

        List<Employee> allEmployees = responseEntity.getBody();

        return allEmployees;
    }

    public Employee getEmployee(Long id) {
        Employee employee = restTemplate.getForObject(URL + "/" + id
                , Employee.class);

        return employee;
    }

    public void saveEmployee(Employee employee) {
        Long id = employee.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New employee was added to DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, employee);
            System.out.println("Employee width ID " + id + " was updated");
        }
    }

    public void deleteEmployee(Long id) {

    }
}