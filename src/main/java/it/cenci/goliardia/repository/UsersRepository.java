package it.cenci.goliardia.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.cenci.goliardia.dao.Users;
import it.cenci.goliardia.mapper.UsersMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Transactional
@Repository
public class UsersRepository {

	UsersMapper usersMapper;
	
	public Users findByUsername(String username) {
		return usersMapper.findByUsername(username);
	}
}
