package com.angeltravieso.accounts.mapper;

import com.angeltravieso.accounts.dto.CustomerDto;
import com.angeltravieso.accounts.entities.Customer;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customer.getName());
        customer.setEmail(customer.getEmail());
        customer.setMobileNumber(customer.getMobileNumber());
        return customer;
    }

}
