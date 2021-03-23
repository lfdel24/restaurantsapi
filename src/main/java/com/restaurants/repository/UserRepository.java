package com.restaurants.repository;

import com.restaurants.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.mail = :mail AND u.pass = :pass")
    public User find(@Param("mail") String mail, @Param("pass") String pass);

}
