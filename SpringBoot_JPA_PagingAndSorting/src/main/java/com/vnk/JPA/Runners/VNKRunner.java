package com.vnk.JPA.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vnk.JPA.Services.ServiceClass;
@Component
public class VNKRunner implements CommandLineRunner{
@Autowired
private ServiceClass sc;
	@Override
	public void run(String... args) throws Exception {
		//sc.retriveRecordsBasedOnCustomerName(null);
		
		//sc.retriveRecordBasedOnDESCASC(false,"mobileNo");
		
		sc.retriveRecordBasedOnPaging(1,2, false,"mobileNo");
	}

}
