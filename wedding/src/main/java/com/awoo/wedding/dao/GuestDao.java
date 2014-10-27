package com.awoo.wedding.dao;

import java.util.Map;

import com.awoo.wedding.model.Guests;

public interface GuestDao
{
	void saveGuest(Guests guest);
	Map<String, Integer> getGuestsForUser(String userName);
}
