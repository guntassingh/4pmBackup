package com.rsystems.services;

import org.springframework.stereotype.Service;

@Service
public class ThirdPartyServiceImpl implements ThirdPartyService {

	@Override
	public boolean validateToken() {

		return true;
	}
}
