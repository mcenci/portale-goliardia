package it.cenci.goliardia.mapper;

import org.apache.ibatis.annotations.Mapper;

import it.cenci.goliardia.dao.Users;

@Mapper
public interface UsersMapper {

	Users findByUsername(String username);
}
