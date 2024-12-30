package com.angeltravieso.accounts.service.impl;

import com.angeltravieso.accounts.dto.CustomerDto;
import com.angeltravieso.accounts.repositories.AccountsRepository;
import com.angeltravieso.accounts.repositories.CustomRepository;
import com.angeltravieso.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;
    private CustomRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
