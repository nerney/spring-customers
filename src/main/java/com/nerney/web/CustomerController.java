package com.nerney.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nerney.model.Customer;
import com.nerney.model.CustomerRepository;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @RequestMapping("/new")
    public Map<String, Object> createAction(Customer customer) {
        return new TableMapper(repo.save(customer)).getReady();
    }

    @RequestMapping("/delete")
    public Map<String, Object> deleteAction(Long id) {
        Map<String, Object> response = new HashMap<>();
        repo.delete(id);
        response.put("Result", "OK");
        return response;
    }

    @RequestMapping("/customers")
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @RequestMapping("/customers/{id}")
    public Customer getOne(@PathVariable Long id) {
        return repo.findOne(id);
    }

    @RequestMapping("/list")
    public Map<String, Object> listAction() {
        return (new TableMapper(repo.findAll())).getReady();
    }

    @RequestMapping("/update")
    public Map<String, Object> updateAction(Customer customer) {
        Customer toUpdate = getOne(customer.getId());
        toUpdate.setStreet(customer.getStreet());
        toUpdate.setCity(customer.getCity());
        toUpdate.setState(customer.getState());
        toUpdate.setZip(customer.getZip());
        toUpdate.setEmail(customer.getEmail());
        toUpdate.setName(customer.getName());
        toUpdate.setPhone(customer.getPhone());
        return new TableMapper(repo.save(toUpdate)).getReady();
    }
}

// CRUD Controller for Customer Table

