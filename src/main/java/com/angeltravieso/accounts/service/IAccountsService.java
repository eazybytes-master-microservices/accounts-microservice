package com.angeltravieso.accounts.service;

import com.angeltravieso.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
