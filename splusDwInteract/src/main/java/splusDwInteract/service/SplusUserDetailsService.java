package splusDwInteract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import splusDwInteract.model.SplusUserDetails;
import splusDwInteract.model.Users;
import splusDwInteract.repositories.UsersRepository;

/**
 * This interface gets the call from the My Secure controller and it contains the business logic to get user details.
 * @author Manas Das
 */

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
