package com.betek.backend7.sesion8.longclass.after;

import com.betek.backend7.sesion8.longclass.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    // Customer management fields
    private List<Customer> customers;
    private int customerCount;

    public CustomerService() {
        customers = new ArrayList<Customer>();
        customerCount = 0;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        customerCount++;
    }

    public void removeCustomer(int customerId) {
        Customer customerToRemove = null;
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                customerToRemove = customer;
                break;
            }
        }
        if (customerToRemove != null) {
            customers.remove(customerToRemove);
            customerCount--;
        }
    }

    public Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }
}
