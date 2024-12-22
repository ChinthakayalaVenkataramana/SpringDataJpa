package com.vnk.JPA.Services;

import java.util.List;
import java.util.Optional;

import com.vnk.JPA.Entity.VNKBankApplication;

public interface ServiceInter {
public VNKBankApplication insertRecord(VNKBankApplication vnk);
public Iterable <VNKBankApplication> insertRecord(List<VNKBankApplication> list);
public Iterable <VNKBankApplication> readVallues();
public Optional<VNKBankApplication> findRecord(int id);
public long recordsCount();
public void deleteRecord(int id);
public boolean existByRecord(int id);
}
