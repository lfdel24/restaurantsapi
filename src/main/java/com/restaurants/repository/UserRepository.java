package com.restaurants.repository;

import com.restaurants.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
