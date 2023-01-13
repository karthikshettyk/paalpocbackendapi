package com.paalpocbackend.app.controller;
import com.paalpocbackend.app.model.CustomerModel;
import com.paalpocbackend.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String welcomeMessage (){
        return  "Welcome";
    }

    @PostMapping("/customer/create")
    public CustomerModel createCustomerDetails(@RequestBody CustomerModel customer ){
     return customerService.createCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public CustomerModel getCustomerDetails(@PathVariable Integer id){
        return customerService.getCustomerDetails(id);
    }

}




