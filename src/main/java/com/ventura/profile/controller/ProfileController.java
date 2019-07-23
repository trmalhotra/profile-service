package com.ventura.profile.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventura.profile.model.Profile;
import com.ventura.profile.service.ProfileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/ventura/profile")
@Api(value = "Profile Management")
public class ProfileController {

	@Autowired
	private ProfileService profileService;

	@ApiOperation(value = "Add a Profile")
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<Profile> addNewProfile(
			@ApiParam(value = "Profile object store in database table", required = true) @Valid @RequestBody Profile profile) {
		Profile profileAdded = null;
		try {
			profileAdded = profileService.addNewProfile(profile);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (profileAdded == null || profileAdded.getCandidateName() == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(profileAdded, HttpStatus.OK);
		}
	}

	@ApiOperation(value = "Get all Profiles", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved profiles"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(method = RequestMethod.GET, value = "/all", produces = "application/json")
	public ResponseEntity<List<Profile>> getAllProfiles() {
		List<Profile> profileList = new ArrayList<Profile>();
		try {
			profileList = profileService.getAllProfiles();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (profileList.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(profileList, HttpStatus.OK);
		}
	}

}
