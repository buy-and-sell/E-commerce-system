package com.anjuc.utils.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }

    public Buyer getBuyerByBuyerCode (String buyerCode){
        return buyerRepository.findBuyerByBuyerCode(buyerCode);
    }

    public Buyer createBuyer(Buyer buyer){
        return buyerRepository.save(buyer);
    }

    public Buyer updateBuyer(int id, Buyer buyerDetails){
        Buyer buyer = buyerRepository.findBuyerById(id);

        buyer.setBuyerCode(buyerDetails.getBuyerCode());
        buyer.setBuyerFirstName(buyerDetails.getBuyerLastName());
        buyer.setBuyerLastName(buyerDetails.getBuyerEmail());
        buyer.setBuyerPassword(buyerDetails.getBuyerPassword());

        return buyerRepository.save(buyer);
    }

    public void deleteBuyer(int id){
        buyerRepository.deleteBuyerById(id);
    }
}
