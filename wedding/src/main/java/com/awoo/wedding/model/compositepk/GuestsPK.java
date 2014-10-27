package com.awoo.wedding.model.compositepk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GuestsPK implements Serializable
{
	private static final long serialVersionUID = -8011107203083729747L;
	
	@Column(name = "userid", nullable = false, length = 8)
	private int userid;
	
	@Column(name = "name", nullable = false, length = 30)
	private String name;
	
	public int getUserid()
	{
		return userid;
	}
	public void setUserid(int userid)
	{
		this.userid = userid;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public boolean equals(Object object)
	{
		if (object instanceof GuestsPK)
		{
			GuestsPK instance = (GuestsPK) object;
			if (this.userid == instance.getUserid() && 
					this.name.equals(instance.getName()))
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int result = 17;
		result = 31*result + userid;
		result = 31*result + name.hashCode();
		return result;  
	}
}
