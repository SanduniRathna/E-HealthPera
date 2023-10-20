package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.MedicineRecord;
import com.ehealthpera.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

    //find user by email
    User findByEmail(String email);

    //find user by email and password
    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    Optional<User> findOneEmailAndPassword(@Param("email") String email, @Param("password") String password);

    //find user by ID

    @Query(value= "SELECT * FROM USER WHERE ID= ?1",nativeQuery = true)
    User getUserById(String Id);

    //find all medicine details by id
    @Query("SELECT u FROM studentMedicine u WHERE u.id=:id")
    List<MedicineRecord> findAllMedicineDetailsByID(@Param("id") String id);

    //find medicine details by id and date

}


