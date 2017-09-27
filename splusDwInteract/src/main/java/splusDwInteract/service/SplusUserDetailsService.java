package splusDwInteract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import splusDwInteract.model.SplusUserDetails;
import splusDwInteract.model.Users;
import splusDwInteract.repository.UsersRepository;

@Service
public class SplusUserDetailsService implements UserDetailsService{

	@Autowired
	UsersRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	
		Users users=userRepository.findByName(username);
		if(users!=null){
			System.out.println("MPD user is not null"+users);
		}
		else{
			System.out.println("MPD user is null.");
		}
		
		
		return new SplusUserDetails(users);
	}

}
