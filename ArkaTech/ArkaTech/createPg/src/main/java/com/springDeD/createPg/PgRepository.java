package com.springDeD.createPg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@EnableJpaRepositories("com.springDeD.createPg.*")
@Repository
public interface PgRepository extends JpaRepository<Pg, Long> {

    
}
