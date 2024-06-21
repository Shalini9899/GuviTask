package com.spring.Employee.Controller;

import com.spring.Employee.Entity.Employee;
import com.spring.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/index")
    public  String index(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employee/index";
    }

    @GetMapping("/displayAll")
    public  String displayAllEmployees(Model model){
        List<Employee> employees=employeeService.getAllEmployee();
        model.addAttribute("employees",employees);
        return "display-all";
    }

    @GetMapping("/display/{id}")
    public String displayEmployeeById(@PathVariable Long id, Model model){
        Optional<Employee> employee=employeeService.getAllEmployeeById(id);
        if (employee.isPresent()){
            model.addAttribute("employee",employee.get());
        }else {
            model.addAttribute("error","Employee not found");
        }
        return "display-one";
    }

    @PostMapping("/addEmployee")
    @ResponseBody
    public ResponseEntity <Employee>  addEmployeeRest(@RequestBody Employee employee){
        Employee savedEmployee=employeeService.saveEmployee(employee);
        return  ResponseEntity.ok(savedEmployee);
    }
    @GetMapping("/getAllEmployees")
    @ResponseBody
    public ResponseEntity<List<Employee>> getAllEmployeesRest() {
        List<Employee> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }
    @GetMapping("/getEmployee/{id}")
    public  ResponseEntity <Employee> getAllEmployeeRest(@PathVariable Long id){
        Optional <Employee> employee=employeeService.getAllEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());

    }
// Charge meeeeeeeeeeeee
}
