package com.vnk.JPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vnk.JPA.Entity.VNKBankApplication;
import com.vnk.JPA.Repository.VNKBankRepo;
@Service
public class VNKBankServClass implements VNKServ{
	@Autowired
	private VNKBankRepo repo;

	@Override
	public void InsertRecord(VNKBankApplication app) {
		if(app!=null) {
          repo.save(app);
          System.out.println("Inserted Successfully...........");
		}else {
			System.out.println("Not Inserted......");
		}
	}

	@Override
	public void SetectAllRecord() {
		repo.findAll().forEach(System.err::println);
	}

	@Override
	public void UpdateRecord(VNKBankApplication app) {
		if(app!=null) {
		repo.save(app);
		System.out.println("Successfully Update...");
	}else {
		System.out.println("Not Updated");
	}		
	}
	
	@Override
	public void SortingOperation(boolean bool, String... strings) {
		Sort sort;
		//sort=Sort.by(Direction.ASC, strings);
		//sort=Sort.by(strings);
		sort=Sort.by(bool?Direction.ASC:Direction.DESC, strings);
		/*repo.findAll(sort).forEach(System.out::println);*/
		Pageable p;
		//p=Pageable.ofSize(19);
		//p=Pageable.unpaged();
		/*p=Pageable.unpaged(sort);
		repo.findAll(p).forEach(System.out::println);*/
		/*Example<VNKBankApplication> ex=Example<VNKBankApplication>;
		repo.findAll(ex);*/
	}
}
