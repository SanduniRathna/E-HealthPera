package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MedicineRecordRepo extends JpaRepository <MedicineRecord,Long>{
    @Query(value = "SELECT * FROM medicineRecord  WHERE enrolmentNumber =  ?1",nativeQuery = true)
    MedicineRecord findByEnrolmentNumber(String enrolmentNumber);
}
