package com.nerney.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.nerney.model.Customer;

public class TableMapper {

    private Map<String, Object> ready;

    public TableMapper(Customer customer) {
        Map<String, Object> json = new HashMap<>();
        json.put("Record", customer);
        json.put("Result", "OK");
        ready = json;
    }

    public TableMapper(List<Customer> customers) {
        Map<String, Object> json = new HashMap<>();
        json.put("Records", customers);
        json.put("Result", "OK");
        ready = json;
    }

    public Map<String, Object> getReady() {
        return ready;
    }
}

/*
 * This is responsible for putting the JSON
 * into a format that works with jTable
 */
