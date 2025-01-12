package jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jobportal.beans.User;


public interface UserRepository extends JpaRepository<User, Integer> {

//	User findByusername(String username);
	 
	User findByemail(String email);



}
