package com.ali.Revolutionary_Bank.repository;

import com.ali.Revolutionary_Bank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}

