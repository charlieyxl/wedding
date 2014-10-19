package com.awoo.wedding.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.awoo.wedding.model.Guest;

@Repository
public class GuestDaoImpl implements GuestDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SAVE_GUEST = "insert into Guests values (?, ?, ?)";
	
	public void saveGuest(Guest guest)
	{
		jdbcTemplate.update(SAVE_GUEST, guest.getUserid(), guest.getName(), guest.getCompanionNum());
	}

	public Map<String, Integer> getGuestsForUser(String userName)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
