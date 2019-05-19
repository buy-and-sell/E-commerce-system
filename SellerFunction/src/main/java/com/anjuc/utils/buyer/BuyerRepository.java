package com.anjuc.utils.buyer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    public Buyer findBuyerByBuyerCode(String BuyerCode);
    public void deleteBuyerById(int id);
    public Buyer findBuyerById(int id);
}
