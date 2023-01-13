package com.paalpocbackend.app.service;
import com.paalpocbackend.app.model.CustomerModel;
import com.paalpocbackend.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {



@Autowired
private CustomerRepository customerRepository;


public CustomerModel createCustomer(CustomerModel customer){
    return  customerRepository.save(customer);
}

public CustomerModel getCustomerDetails(Integer id){
    CustomerModel cus = customerRepository.findById(id).orElse(null);
    return cus;
}

}
