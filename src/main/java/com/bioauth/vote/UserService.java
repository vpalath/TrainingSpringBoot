package com.bioauth.vote;

import java.util.List;

import com.bioauth.domain.Users;
import com.bioauth.domain.VoteDetails;

public interface UserService {
	
	public String save(Users user);
	public Users getUser(int id);
	public String storeVote(VoteInfo voteInfo);
	public String validate(long aadhaarId,String dob);
    public List<VoteDetails> count();
    public List<VoteDetails> findByAadhaarid(long aadhaarid);
}
