package com.awoo.wedding.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.awoo.wedding.model.Guests;

@Repository
public class GuestDaoImpl extends HibernateBaseDao implements GuestDao
{
	public void saveGuest(Guests guest)
	{
		getHibernateTemplate().saveOrUpdate(guest);
	}

	public Map<String, Integer> getGuestsForUser(String userName)
	{
		return null;
	}
}
