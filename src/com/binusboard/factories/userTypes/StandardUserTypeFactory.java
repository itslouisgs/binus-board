package com.binusboard.factories.userTypes;

import com.binusboard.models.userTypes.StandardUserType;
import com.binusboard.models.userTypes.UserType;

public class StandardUserTypeFactory implements UserTypeFactory {

	@Override
	public UserType getInstance() {
		return new StandardUserType();
	}

}
