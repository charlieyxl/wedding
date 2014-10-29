package com.awoo.wedding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.awoo.wedding.dao.GuestDao;
import com.awoo.wedding.model.Guests;

@Service
public class GuestServiceImpl implements GuestService
{
	@Autowired
	private GuestDao guestDao;
	
	@Transactional(readOnly=false)
	public void saveOrUpdateGuest(Guests guest)
	{
		guestDao.saveGuest(guest);
	}

}
