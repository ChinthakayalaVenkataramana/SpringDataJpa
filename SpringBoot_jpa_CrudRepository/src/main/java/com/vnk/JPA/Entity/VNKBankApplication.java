package com.vnk.JPA.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class VNKBankApplication {
   @Id
   @SequenceGenerator(name = "SI",sequenceName = "SNO",initialValue = 1234567890,allocationSize = 1)
   @GeneratedValue(generator = "SI",strategy = GenerationType.SEQUENCE)
   @Column(length = 10)
	private Integer accountNo;
	
   @NonNull
   @Column(length = 30)
	private String custName;
	
   @NonNull
   @Column(length = 30)
	private String branchName;
	
   @NonNull
   @Column(length = 10)
	private Long mobileNo;
	
   @NonNull
   @Column(length =1)
	private Character gender;
	
   @NonNull
   @Column(length = 30)
	private String bankName;
	
   @NonNull
   @Column(length = 30)
	private String address;
}
