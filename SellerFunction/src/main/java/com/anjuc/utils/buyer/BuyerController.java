package com.anjuc.utils.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping(value = "/utils/buyers",params = "buyer_code")
    public ResponseEntity<Buyer> getBuyerByBuyerCode (@RequestParam(name = "buyer_code") String buyerCode){
        return new ResponseEntity<>(buyerService.getBuyerByBuyerCode(buyerCode), HttpStatus.OK);
    }

    @GetMapping("/utils/buyers")
    public ResponseEntity<List<Buyer>> getAllBuyers(){
        return new ResponseEntity<>(buyerService.getAllBuyers(), HttpStatus.OK);
    }

    @PostMapping("/utils/buyers")
    public ResponseEntity<Buyer> createBuyer (@RequestBody Buyer buyer){
        return new ResponseEntity<>(buyerService.createBuyer(buyer), HttpStatus.OK);
    }

    @PutMapping("/utils/buyers/{id}")
    public ResponseEntity <Buyer> updateBuyer (@PathVariable int id, @RequestBody Buyer buyer){
        return new ResponseEntity<Buyer>(buyerService.updateBuyer(id, buyer), HttpStatus.OK);
    }

    @DeleteMapping("/utils/buyers/{id}")
    public ResponseEntity deleteBuyer (@PathVariable int id){
        buyerService.deleteBuyer(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
