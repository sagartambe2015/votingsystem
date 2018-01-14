package com.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate {

	@Id
	private long id;

	@Column(name = "candidate_name")
	private String name;

	@Column(name = "vote_count")
	private int vote_count;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

}
