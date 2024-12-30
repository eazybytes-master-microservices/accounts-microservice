package com.angeltravieso.accounts.mapper;

import com.angeltravieso.accounts.dto.AccountsDto;
import com.angeltravieso.accounts.entities.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accounts.getAccountNumber());
        accounts.setAccountType(accounts.getAccountType());
        accounts.setBranchAddress(accounts.getBranchAddress());
        return accounts;
    }

}
