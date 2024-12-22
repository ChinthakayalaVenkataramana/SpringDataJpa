package com.vnk.JPA.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vnk.JPA.Entity.VNKBankApplication;
import com.vnk.JPA.Repository.CRUDRepo;
import com.vnk.JPA.Services.ServiceClass;

@Component
public class RunnerClass implements CommandLineRunner{
@Autowired
private ServiceClass sc;

@Autowired
private CRUDRepo repo;

	@Override
	public void run(String... args) throws Exception {
	// repo.findByBankName("SBI").forEach(System.err::println);
		//sc.readVallues().forEach(System.out::println);
		//System.out.println(sc.existByRecord(123457899));
		//sc.findRecord(123456789).ifPresentOrElse(System.out::println,()-> {System.out.println("Record Not Found");});
		/*VNKBankApplication vnk=new VNKBankApplication();
		vnk.setAddress("penagalur");
		vnk.setBankName("karurVysha");
		vnk.setBranchName("Rajampet");
		vnk.setCustName("Kiran");
		vnk.setMobileNo(9808764542l);
		vnk.setGender('M');
		System.out.println(sc.insertRecord(vnk));*/
		sc.deleteRecord(123456789);
	}

}
