package com.vnk.JPA.Repository;

import org.springframework.data.repository.CrudRepository;

import com.vnk.JPA.Entity.VNKBankApplication;

public interface CRUDRepo extends CrudRepository<VNKBankApplication,Integer>{
 public Iterable<VNKBankApplication> findByBankName(String bank);
}
