package com.ventura.profile.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.profile.model.Profile;
import com.ventura.profile.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile addNewProfile(Profile profile) {
		return profileRepository.addNewProfile(profile);
	}
	
	public List<Profile> getAllProfiles() {
		return profileRepository.getAllProfiles();
	}

}
