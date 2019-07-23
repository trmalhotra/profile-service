package com.ventura.profile.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.ventura.profile.model.Profile;

@Repository
public class ProfileRepositoryImpl implements ProfileRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public Profile addNewProfile(Profile profile) {
		return mongoTemplate.save(profile);
	}

	@Override
	public List<Profile> getAllProfiles() {
		Query query = new Query();
		return mongoTemplate.find(query, Profile.class);
	}

}
