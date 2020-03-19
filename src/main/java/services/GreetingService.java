package services;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import entities.Employee;

@ApplicationScoped
public class GreetingService {

    @Transactional
    public String greeting(String name) {
        Employee emp = new Employee();
        emp.id = 1l;
        emp.name = "Ankit";
        emp.department = "LR";
        emp.persist();
        Employee returnEmp = Employee.findById(1l);
        System.out.println("2517:-" + returnEmp.department);
        return "hello "+name;

    }
}