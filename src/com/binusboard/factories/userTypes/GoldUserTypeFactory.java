package com.binusboard.factories.userTypes;

import com.binusboard.models.userTypes.GoldUserType;
import com.binusboard.models.userTypes.UserType;

public class GoldUserTypeFactory implements UserTypeFactory {

	@Override
	public UserType getInstance() {
		return new GoldUserType();
	}

}
