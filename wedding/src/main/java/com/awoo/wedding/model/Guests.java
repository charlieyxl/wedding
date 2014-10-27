package com.awoo.wedding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.awoo.wedding.model.compositepk.GuestsPK;

@Entity
@Table(name = "Guests")
public class Guests implements Serializable
{
	private static final long serialVersionUID = 4548528122101629247L;
	
	@Id
	private GuestsPK guestPK;
	
	@Column(name = "companion_num", nullable = false, length = 2)
	private Integer companionNum;
	
	public GuestsPK getGuestPK()
	{
		return guestPK;
	}
	public void setGuestPK(GuestsPK guestPK)
	{
		this.guestPK = guestPK;
	}
	
	public Integer getCompanionNum()
	{
		return companionNum;
	}
	public void setCompanionNum(Integer companionNum)
	{
		this.companionNum = companionNum;
	}
}
