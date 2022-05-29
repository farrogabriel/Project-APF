package NTTDATA.AFP.service;

import NTTDATA.AFP.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer create(Customer persona);

    Customer update(Customer persona);

    Customer findById(long id);

    void delete(long id);
}
