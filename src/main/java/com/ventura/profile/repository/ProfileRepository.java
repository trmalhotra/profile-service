package com.ventura.profile.repository;


import java.util.List;

import com.ventura.profile.model.Profile;

public interface ProfileRepository {

	public Profile addNewProfile(Profile profile);
	
	public List<Profile> getAllProfiles();
}
