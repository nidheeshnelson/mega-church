package io.github.nidheeshnelson.mega_church.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.nidheeshnelson.mega_church.job.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    
}
