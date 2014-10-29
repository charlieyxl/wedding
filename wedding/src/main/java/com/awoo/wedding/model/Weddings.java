package com.awoo.wedding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weddings")
public class Weddings implements Serializable
{
	private static final long serialVersionUID = 8824497201840609642L;
	
	@Id
	@Column(name = "userid", nullable = false, length = 8)
	private int userid;
	
	@Column(name = "address", nullable = false, length = 60)
	private String address;
	
	@Column(name = "date", nullable = false, length = 20)
	private String date;
	
	@Column(name = "time", nullable = false, length = 10)
	private String time;

	public int getUserid()
	{
		return userid;
	}

	public void setUserid(int userid)
	{
		this.userid = userid;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}
}
