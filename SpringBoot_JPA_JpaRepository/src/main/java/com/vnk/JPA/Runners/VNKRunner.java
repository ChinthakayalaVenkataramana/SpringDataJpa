package com.vnk.JPA.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vnk.JPA.Entity.VNKBankApplication;
import com.vnk.JPA.Services.VNKBankServClass;
@Component
public class VNKRunner implements CommandLineRunner{
@Autowired
private VNKBankServClass vnk;
	@Override
	public void run(String... args) throws Exception {
	/*VNKBankApplication app=new VNKBankApplication(1234567895,"Banu","Nanadalur",91008078234l, 'F', "Penagalur", "Indlur");
	vnk.UpdateRecord(app);*/
	/*vnk.InsertRecord(app);*/
	/*vnk.SetectAllRecord();*/
	vnk.SortingOperation(false, /*"bankName"*/"branchName");
	}

}
