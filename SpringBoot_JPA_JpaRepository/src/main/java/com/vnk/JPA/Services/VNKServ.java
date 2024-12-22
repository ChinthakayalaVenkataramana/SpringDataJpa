package com.vnk.JPA.Services;

import com.vnk.JPA.Entity.VNKBankApplication;

public interface VNKServ {
public abstract void InsertRecord(VNKBankApplication app);
public abstract void UpdateRecord(VNKBankApplication app);
public abstract void SetectAllRecord();
public abstract void SortingOperation(boolean bool,String...strings);
}
