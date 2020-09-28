package it.cenci.goliardia.dao;

import java.util.List;

import lombok.Data;

@Data
public class Users {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private Boolean enabled;
	
	private List<String> authoritiesList;
}
