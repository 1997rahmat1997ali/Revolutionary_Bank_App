package com.ali.Revolutionary_Bank.controller;

import com.ali.Revolutionary_Bank.dto.*;
import com.ali.Revolutionary_Bank.entity.User;
import com.ali.Revolutionary_Bank.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new User and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
    //////////////////////////////////////

    @Operation(
            summary = "Balance Enquiry",
            description = "Enter an account number, Check how much money the user have"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }
    //////////////////////////////////////

    @Operation(
            summary = "User Enquiry",
            description = "Enter an account number, Check User Name"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){

        return userService.nameEnquiry(request);
    }
    //////////////////////////////////////

    @Operation(
            summary = "Credit into User Account",
            description = "Amount to be Credited in User's Account"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }
    //////////////////////////////////////

    @Operation(
            summary = "Debit from User Account",
            description = "Amount to be Debited from User's Account"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }
    //////////////////////////////////////

    @Operation(
            summary = "Transfer form User to User",
            description = "Debit from one User and Credit to other User"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){

        return userService.transfer(request);
    }
}
