package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.MedicineId;
import com.ehealthpera.demo.Entity.MedicineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MedicineRecordRepo extends JpaRepository<MedicineRecord, MedicineId> {

}
