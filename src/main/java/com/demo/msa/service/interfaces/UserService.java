package com.demo.msa.service.interfaces;

import java.util.List;

public interface UserService {
	
	public List<Object> getUserList();
	
	public Object getUser(String userId);
	
	public List<Object> getRoleList(String userId);
}
