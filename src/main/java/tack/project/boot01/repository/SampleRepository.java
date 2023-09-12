package tack.project.boot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tack.project.boot01.domain.Sample;

public interface SampleRepository extends JpaRepository<Sample, String> {
    
}
