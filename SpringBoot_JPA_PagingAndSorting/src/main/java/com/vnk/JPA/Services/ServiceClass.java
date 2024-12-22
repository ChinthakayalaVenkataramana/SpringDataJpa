package com.vnk.JPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vnk.JPA.Repository.RepoInter;

@Service
public class ServiceClass implements ServiceInter {
@Autowired
private RepoInter repo;

@Override
public void retriveRecordsBasedOnCustomerName(String name) {
	//Pageable p=Pageable.ofSize(2);
	//Pageable p=Pageable.unpaged();
	//Sort s=Sort.unsorted();
	/*Sort s=Sort.by("branchName","address");
	Pageable p=Pageable.unpaged(s);
	repo.findAll(p).forEach(System.out::println);*/
}

@Override
public void retriveRecordBasedOnDESCASC(boolean bool,String... args) {
	//Sort s=Sort.by(bool?Direction.ASC:Direction.DESC, args);
	Sort s=Sort.by(args);
    repo.findAll(s).forEach(System.out::println);
}

@Override
public void retriveRecordBasedOnPaging(int start, int end, boolean bool, String... args) {
	//Sort s=Sort.by(bool?Direction.ASC:Direction.DESC, args);
	//PageRequest pr=PageRequest.of(start, end,s);
	//PageRequest pr=PageRequest.of(start, end);
	PageRequest pr=PageRequest.of(start, end,bool?Direction.ASC:Direction.DESC, args);
	//PageRequest pr=PageRequest.ofSize(start);
	repo.findAll(pr).forEach(System.err::println);
}

}
