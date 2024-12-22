package com.vnk.JPA.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vnk.JPA.Entity.VNKBankApplication;
import com.vnk.JPA.Repository.CustomMethodRepo;
@Component
public class VNKBankRunner implements CommandLineRunner {
@Autowired
private CustomMethodRepo repo;
	@Override
	public void run(String... args) throws Exception {
		VNKBankApplication vnk=new VNKBankApplication("Yallaih","Nandalur",9100867584l,'M',"Kotak","Labok");
		repo.save(vnk);
		repo.findByBranchName("penagalur").forEach(System.out::println);
		/*repo.findByMobileNo(9100802854l).forEach(System.err::println);*/
		repo.retriveRecords("Yallaih","RAM").forEach(System.out::println);
		/*repo.retriveRecords().forEach(System.out::println);*/
	}

}
