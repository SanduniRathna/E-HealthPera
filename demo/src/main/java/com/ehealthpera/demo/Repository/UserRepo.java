package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,String> {

    /*@Query(value= "SELECT * FROM USER WHERE ID= ?1",nativeQuery = true)
    User getUserById(String Id);*/
}
