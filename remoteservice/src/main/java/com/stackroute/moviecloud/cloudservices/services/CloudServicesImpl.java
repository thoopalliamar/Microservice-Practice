package com.stackroute.moviecloud.cloudservices.services;

import org.springframework.stereotype.Service;

@Service
public class CloudServicesImpl implements CloudServices {

	@Override
	public String saveUser() {
		String savetest = "saved user";
		return savetest;
	}

	@Override
	public String getUsers() {
		String gettest = "got user";
		return gettest;
	}

}
