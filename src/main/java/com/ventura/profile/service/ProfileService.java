package com.ventura.profile.service;


import java.util.List;

import com.ventura.profile.model.Profile;

public interface ProfileService {
	
	public Profile addNewProfile(Profile profile);
	
	public List<Profile> getAllProfiles();

}
