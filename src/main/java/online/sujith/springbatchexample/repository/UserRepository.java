package online.sujith.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import online.sujith.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
