package com.example.onboarding.missionWrite.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mission")
public class MissionEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_id")
    private int mission_id;

    @Column(name = "total_groups", nullable = false)
    private int total_groups;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "deadline", nullable = false)
    private LocalDateTime deadline;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;
    
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public LocalDateTime getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}
	public int getMission_id() {
		return mission_id;
	}
	public void setMission_id(int mission_id) {
		this.mission_id = mission_id;
	}
	public int getTotal_groups() {
		return total_groups;
	}
	public void setTotal_groups(int l) {
		this.total_groups = l;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

    
}
