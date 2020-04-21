package singleton;

import org.springframework.stereotype.Component;

@Component
public class AddEmployeeController {
    private EmployeeService employeeService;

    public AddEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void addEmployee(String name) {
        employeeService.getEmployees().add(name);
    }
}
