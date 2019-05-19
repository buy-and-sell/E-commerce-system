package com.anjuc.utils.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank getBankByBankCode(String bankCode) {
        return bankRepository.findBankByBankCode(bankCode);
    }

    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public Bank updateBank(int id, Bank bankDetails) {
        Bank bank = bankRepository.findBankById(id);

        bank.setBankCode(bankDetails.getBankCode());
        bank.setBankName(bankDetails.getBankName());

        return bankRepository.save(bank);
    }

    public void deleteBank(int id) {
        bankRepository.deleteBankById(id);
    }
}
