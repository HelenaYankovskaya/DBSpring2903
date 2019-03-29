package com.it.repository;

import com.it.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',:name))")
//    List<User> findByNameStartsWithParam1(@Param("name") String name);
//
//    @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',?1))")
//    List<User> findByNameStartsWithParam2(String name);

//    List<User> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    User findByName(String name);
//
//    //Optional<User> findByName(String name);
}

