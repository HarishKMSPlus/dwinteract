package splusDwInteract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import splusDwInteract.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	Users findByName(String username);

}
