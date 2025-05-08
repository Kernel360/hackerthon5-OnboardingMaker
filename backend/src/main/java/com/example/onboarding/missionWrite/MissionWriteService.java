package com.example.onboarding.missionWrite;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onboarding.missionWrite.Entity.GroupEntity;
import com.example.onboarding.missionWrite.Entity.MissionEntity;
import com.example.onboarding.missionWrite.repository.GroupRepository;
import com.example.onboarding.missionWrite.repository.MissionRepository;

import jakarta.transaction.Transactional;

@Service
public class MissionWriteService {

	@Autowired
	MissionRepository missionRepository;

	@Autowired
	GroupRepository groupRepository;

	@Transactional
	public MissionEntity createMission(MissionWriteDTO dto) {
		
		// Mission 글 저장
		MissionEntity mission = new MissionEntity();
		
		mission.setTitle(dto.getTitle());
		mission.setDescription(dto.getDescription());
		mission.setTotal_groups((int) dto.getTotal_groups());
		mission.setCreated_at(LocalDateTime.parse(dto.getCreated_at()));
		mission.setDeadline(LocalDateTime.parse(dto.getDeadline()));
		
		MissionEntity saved = missionRepository.save(mission);

		// total_groups 만큼 Group 생성
		int total = dto.getTotal_groups();  
		
	    for (int i = 1; i <= total; i++) {
	        GroupEntity g = new GroupEntity();
	        g.setMission_id(saved);
	        g.setGroup_num(i);
	        groupRepository.save(g);
	        
	    }
	    
	    return saved;
	    
	}

}
