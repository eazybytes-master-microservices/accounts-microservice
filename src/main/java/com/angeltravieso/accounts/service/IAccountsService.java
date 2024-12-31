package com.angeltravieso.accounts.service;

import com.angeltravieso.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Account Details based on a given MobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);
}
