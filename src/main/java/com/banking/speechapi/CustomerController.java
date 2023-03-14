package com.banking.speechapi;
import java.util.*;

import com.banking.speechapi.api.CustomerApi;
import com.banking.speechapi.model.Customer;
import com.banking.speechapi.model.CustomerFullData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi {

    private final HashMap<Long, com.banking.speechapi.Customer> customers = new HashMap<>();
    private Long index = 0L;

    @Override
    public ResponseEntity<CustomerFullData> createCustomer(Customer apiCustomer) {
        com.banking.speechapi.Customer customer = new com.banking.speechapi.Customer();
        customer.setCustomerId(index);
        customer.setFirstName(apiCustomer.getFirstName());
        customer.setLastName(apiCustomer.getLastName());

        customers.put(index, customer);
        index++;

        return ResponseEntity.ok(domainToApi(customer));
    }
    @Override
    public
    ResponseEntity<List<Customer>> getAllCustomer(Long customerId) {

        List<Customer> allCustomers =  new ArrayList<Customer>();

        for ( com.banking.speechapi.Customer value : customers.values()) {
            Customer cus = new Customer();
            System.out.println(" ========================== " + value.getFirstName());
            cus.setFirstName(value.getFirstName());
            cus.setLastName(value.getLastName());
            allCustomers.add(cus);
        }
        return ResponseEntity.ok((allCustomers));

    }
    @Override
    public ResponseEntity<CustomerFullData> getCustomer(Long customerId) {
        if (customers.containsKey(customerId)) {
            return ResponseEntity.ok(domainToApi(customers.get(customerId)));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    private CustomerFullData domainToApi(com.banking.speechapi.Customer customer) {
        CustomerFullData cfd = new CustomerFullData();
        cfd.setCustomerId(customer.getCustomerId());
        cfd.setFirstName(customer.getFirstName());
        cfd.setLastName(customer.getLastName());
        return cfd;
    }
}
