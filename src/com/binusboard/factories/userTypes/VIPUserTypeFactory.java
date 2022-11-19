package com.binusboard.factories.userTypes;

import com.binusboard.models.userTypes.VIPUserType;
import com.binusboard.models.userTypes.UserType;

public class VIPUserTypeFactory implements UserTypeFactory {

	@Override
	public UserType getInstance() {
		return new VIPUserType();
	}

}
