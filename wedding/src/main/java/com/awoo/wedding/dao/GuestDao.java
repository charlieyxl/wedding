package com.awoo.wedding.dao;

import java.util.Map;

import com.awoo.wedding.model.Guest;

public interface GuestDao
{
	void saveGuest(Guest guest);
	Map<String, Integer> getGuestsForUser(String userName);
}
