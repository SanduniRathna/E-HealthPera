package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.MedicineId;
import com.ehealthpera.demo.Entity.MedicineRecord;
import com.ehealthpera.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface MedicineRecordRepo extends JpaRepository<MedicineRecord, MedicineId> {
    //get student medicine details by id
    @Query("SELECT u FROM studentMedicine u WHERE u.id= :id")
    default Optional<MedicineRecord> getUserMedicineRecordById(@Param("id") String id) {
        return null;
    }
}
