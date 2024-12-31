package com.angeltravieso.accounts.service.impl;

import com.angeltravieso.accounts.constants.AccountsConstants;
import com.angeltravieso.accounts.dto.CustomerDto;
import com.angeltravieso.accounts.entity.Accounts;
import com.angeltravieso.accounts.entity.Customer;
import com.angeltravieso.accounts.exception.CustomerAlreadyExistsException;
import com.angeltravieso.accounts.mapper.CustomerMapper;
import com.angeltravieso.accounts.repositories.AccountsRepository;
import com.angeltravieso.accounts.repositories.CustomerRepository;
import com.angeltravieso.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());

        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());

        if(optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber " + customerDto.getMobileNumber());
        }

        Customer savedCustomer = customerRepository.save(customer);
        Accounts newAccount = createNewAccount(savedCustomer);

        accountsRepository.save(newAccount);
    }

    /**
     *
     * @param customer - Customer Object
     * @return the new account  details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }

}
