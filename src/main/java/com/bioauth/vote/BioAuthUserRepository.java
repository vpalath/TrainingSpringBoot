package com.bioauth.vote;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.bioauth.domain.Users;


public interface BioAuthUserRepository extends CrudRepository<Users, Integer>{
	
	public Users findByAadhaaridAndDob(long aadhaarid,Date dob);
	
	
}
