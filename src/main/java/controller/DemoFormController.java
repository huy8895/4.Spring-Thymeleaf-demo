package controller;

import model.ListCustomer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoFormController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping
    public String index(Model model) {
        List customerList = customerService.findAll();
        model.addAttribute("customerList", customerList);
        model.addAttribute("listDemo",new ListCustomer());
        return "/demo_form/demo";
    }
    @GetMapping("/")
    public String demoGet(){
        return "/demo_form/demo";
    }
}
