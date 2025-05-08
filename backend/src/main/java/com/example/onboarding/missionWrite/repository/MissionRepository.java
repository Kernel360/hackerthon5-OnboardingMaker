package com.example.onboarding.missionWrite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onboarding.missionWrite.Entity.MissionEntity;

public interface MissionRepository extends JpaRepository<MissionEntity, Integer>{

}
