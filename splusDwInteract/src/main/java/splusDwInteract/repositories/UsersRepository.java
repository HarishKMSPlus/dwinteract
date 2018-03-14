package splusDwInteract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import splusDwInteract.model.Users;

/**
 * This interface has method declarations to retrieve specific information of user from database.
 * @author Manas Das
 */

public interface UsersRepository extends JpaRepository<Users, Integer>{

	/**
	 * This will get the user by name
	 * 
	 * @param username
	 * @return Users
	 */
	
	
	Users findByName(String username);

}
