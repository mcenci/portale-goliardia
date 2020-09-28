package it.cenci.goliardia.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import it.cenci.goliardia.dao.Users;
import it.cenci.goliardia.repository.UsersRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DataBaseUserDetailService implements UserDetailsService {

	private UsersRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Users user = repo.findByUsername(username);
	     List<SimpleGrantedAuthority> grantedAuthorities = user.getAuthoritiesList().stream()
	    		 .map(authority -> new SimpleGrantedAuthority(authority)).collect(Collectors.toList());
	     return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities); 
	}

}
