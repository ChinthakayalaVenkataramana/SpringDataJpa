package com.vnk.JPA.Services;
public interface ServiceInter {
 public void retriveRecordsBasedOnCustomerName(String name);
 public void retriveRecordBasedOnDESCASC(boolean bool,String... args);
 public void retriveRecordBasedOnPaging(int start,int end,boolean bool,String... args);
}
