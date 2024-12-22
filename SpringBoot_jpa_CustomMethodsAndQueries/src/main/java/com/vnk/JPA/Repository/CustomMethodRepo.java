package com.vnk.JPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vnk.JPA.Entity.VNKBankApplication;
@Repository
public interface CustomMethodRepo extends JpaRepository<VNKBankApplication,Integer> {
public List<VNKBankApplication> findByBranchName(String bname );
public List<VNKBankApplication> findByMobileNo(Long log );

/*@Query("from VNKBankApplication where custName=:name")*/
/*@Query("from VNKBankApplication where custName=?1")*/
@Query("from VNKBankApplication where custName IN(?1,?2)")
public List<VNKBankApplication> retriveRecords(String name,String name2);

@Query("from VNKBankApplication")
public List<VNKBankApplication> retriveRecords();
}
