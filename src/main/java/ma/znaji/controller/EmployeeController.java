package ma.znaji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String saveEmpPage(@ModelAttribute("emp")Employee emp) {
        empDAO.save(emp);
        return "redirect:/listEmployee";
    }

    @RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
    public String listEmpPage(Model model) {
        model.addAttribute("listEmployee",empDAO.getListEmp());
        return "listEmployee";
    }

    @RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.GET)
    public String editEmployeePage(@PathVariable("id") long id,Model model) {
        model.addAttribute("employee",empDAO.getEmployee(id));
        return "editEmployee";
    }

    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public String editEmployee(@ModelAttribute("emp") Employee employee) {
        empDAO.updateEmployee(employee);
        return "redirect:/listEmployee";
    }
}
