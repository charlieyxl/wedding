package com.awoo.wedding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awoo.wedding.dao.GuestDao;
import com.awoo.wedding.model.Guest;

@Service
public class GuestServiceImpl implements GuestService
{
	@Autowired
	private GuestDao guestDao;
	
	public void saveGuest(Guest guest)
	{
		guestDao.saveGuest(guest);
	}

}
