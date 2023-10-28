package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.staticEntity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface NewsRepo extends JpaRepository<News, Long> {

    List<News> findAllByOrderByPublicationDateDesc();
}
