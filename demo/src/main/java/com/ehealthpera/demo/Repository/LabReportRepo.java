package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.laboratoryEntity.LabReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface LabReportRepo extends JpaRepository<LabReport,Long> {
}
