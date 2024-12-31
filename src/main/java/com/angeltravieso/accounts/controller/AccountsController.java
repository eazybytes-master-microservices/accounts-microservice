package com.angeltravieso.accounts.controller;

import com.angeltravieso.accounts.constants.AccountsConstants;
import com.angeltravieso.accounts.dto.CustomerDto;
import com.angeltravieso.accounts.dto.ResponseDto;
import com.angeltravieso.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountService;

    @PostMapping("/create")
    public ResponseEntity<?> createAccount(@RequestBody CustomerDto customerDto) {
        iAccountService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));

    }
}
