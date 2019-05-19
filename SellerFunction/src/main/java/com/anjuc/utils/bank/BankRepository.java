package com.anjuc.utils.bank;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankRepository extends JpaRepository<Bank, Integer> {

    public Bank findBankByBankCode(String bankCode);
    public void deleteBankById(int id);
    public Bank findBankById(int id);

}
