package com.anjuc.utils.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping(value = "/utils/banks", params = "bank_code")
    public ResponseEntity<Bank> getBankByBankCode(@RequestParam(name = "bank_code") String bankCode) {
        return new ResponseEntity<>(bankService.getBankByBankCode(bankCode), HttpStatus.OK);
    }

    @GetMapping("/utils/banksd")
    public ResponseEntity<List<Bank>> getAllBanks() {
        return new ResponseEntity<>(bankService.getAllBanks(), HttpStatus.OK);
    }

    @PostMapping("utils/banks")
    public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
        return new ResponseEntity<>(bankService.createBank(bank), HttpStatus.OK);
    }

    @PutMapping("/utils/banks/{id}")
    public ResponseEntity<Bank> updateBank(@PathVariable int id, @RequestBody Bank bank) {
        return new ResponseEntity<Bank>(bankService.updateBank(id, bank), HttpStatus.OK);
    }

    @DeleteMapping("utils/banks/{id}")
    public ResponseEntity deleteBank(@PathVariable int id) {
        bankService.deleteBank(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
