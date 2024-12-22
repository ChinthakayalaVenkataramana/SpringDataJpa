package com.vnk.JPA.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnk.JPA.Entity.VNKBankApplication;
import com.vnk.JPA.Repository.CRUDRepo;

@Service
public class ServiceClass implements ServiceInter {
@Autowired
private CRUDRepo repo;

@Override
public Iterable <VNKBankApplication> readVallues() {
	Iterable<VNKBankApplication> it=repo.findAll();
	return it;
}

@Override
public long recordsCount() {
    long count=repo.count();
	return count;
}

@Override
public void deleteRecord(int id) {
System.out.println(System.lineSeparator());
System.out.println("How Many Records are ther int table: "+repo.count());
}

@Override
public VNKBankApplication insertRecord(VNKBankApplication vnk) {
	VNKBankApplication vn=repo.save(vnk);
	System.out.println("Successfully inserted..");
	return vn;
}

@Override
public Iterable<VNKBankApplication> insertRecord(List<VNKBankApplication> list) {
	Iterable<VNKBankApplication> vn=repo.saveAll(list);
	return vn;
}

@Override
public Optional<VNKBankApplication> findRecord(int id) {
	Optional<VNKBankApplication> vn=repo.findById(id);
	return vn;
}

@Override
public boolean existByRecord(int id) {
	boolean bool=repo.existsById(id);
	return bool;
}
	
}
