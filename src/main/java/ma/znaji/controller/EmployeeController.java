package ma.znaji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.znaji.dao.EmployeeDAO;
import ma.znaji.model.Employee;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDAO empDAO;

    @RequestMapping("/addEmployee")
    public String addEmployeePage() {
        return "addEmployee";
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public String saveEmp(@ModelAttribute("emp")Employee emp) {
        empDAO.save(emp);
        return "redirect:/";
    }
}
