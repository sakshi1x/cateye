package com.example.cateye.repo.user_management;

import com.example.cateye.entity.user_management.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where email=?1", nativeQuery = true)
    Optional<User> findByEmail(String email);

    @Query(value = "select * from users where username=?1", nativeQuery = true)
    User findUserByUsername(String username);

}
