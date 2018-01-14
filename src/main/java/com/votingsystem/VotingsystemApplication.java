package com.votingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.votingsystem.repository.CandidateRepository;

@SpringBootApplication
public class VotingsystemApplication /* implements CommandLineRunner */ {

	@Autowired
	private CandidateRepository candidateRepository;

	public static void main(String[] args) {
		SpringApplication.run(VotingsystemApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { for (String
	 * string : args) { System.out.println(string); } Candidate candidate = new
	 * Candidate(); candidate.setId(1); candidate.setName("Rina");
	 * candidate.setVote_count(0); candidateRepository.save(candidate); }
	 */
}
