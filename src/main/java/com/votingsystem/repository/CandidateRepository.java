package com.votingsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.votingsystem.entity.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

}
