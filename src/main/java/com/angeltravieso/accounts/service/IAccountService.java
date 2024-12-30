package com.angeltravieso.accounts.service;

import com.angeltravieso.accounts.dto.CustomerDto;

public interface IAccountService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
