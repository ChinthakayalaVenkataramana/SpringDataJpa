package com.vnk.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnk.JPA.Entity.VNKBankApplication;

public interface VNKBankRepo extends JpaRepository<VNKBankApplication,Integer> {

}
