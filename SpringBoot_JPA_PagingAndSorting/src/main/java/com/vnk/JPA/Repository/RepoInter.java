package com.vnk.JPA.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.vnk.JPA.Entity.VNKBankApplication;
public interface RepoInter extends PagingAndSortingRepository<VNKBankApplication,Integer>{

}
