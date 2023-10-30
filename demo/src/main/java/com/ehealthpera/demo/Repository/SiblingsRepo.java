package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.Siblings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface SiblingsRepo extends JpaRepository<Siblings,Long> {
}
