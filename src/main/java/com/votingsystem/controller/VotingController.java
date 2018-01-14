package com.votingsystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.votingsystem.entity.Candidate;
import com.votingsystem.repository.CandidateRepository;

@Controller

public class VotingController {

	@Autowired
	private CandidateRepository candidateRepository;

	@RequestMapping("/")
	public String goToVote(Map<String, Object> model) {
		model.put("message", "This is Spring Boot Application");
		return "welcome.html";
	}

	@RequestMapping("/doLogin")
	public String getCandidateList(@RequestParam String name, Model model) {

		List<Candidate> lstCandidate = (List<Candidate>) candidateRepository.findAll();
		model.addAttribute(lstCandidate);
		return "performVoted.html";

	}

}
