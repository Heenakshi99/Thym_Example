package com.example.thymleafeexample.controller;

import com.example.thymleafeexample.EmployeeService;
import com.example.thymleafeexample.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/showList", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        model.addAttribute("allEmployee", employeeService.getAllEmployee());
        return "showList";
    }

    @RequestMapping(value = "/addNewPerson", method = RequestMethod.POST)
    public String insert(@ModelAttribute("employee") Employee employee) {
        if (!employee.getFname().equals("") && !employee.getLname().equals(""))
            employeeService.save(employee);
        else
            return "employee name blank";
        return "inserted";
    }

    @GetMapping("/addPerson")
    public String addPerson(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addPerson";
    }

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable("id") long id, Model model) {
        System.out.println(id);
        Employee employee = employeeService.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") long id, Model model) {
        employeeService.deleteById(id);

        return "redirect:/showList";
    }
}
