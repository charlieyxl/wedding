package com.awoo.wedding.model;

import java.io.Serializable;

public class Guest implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer userid;
	private String name;
	private Integer companionNum;
	
	public Integer getUserid()
	{
		return userid;
	}
	public void setUserid(Integer userid)
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
	
	public Integer getCompanionNum()
	{
		return companionNum;
	}
	public void setCompanionNum(Integer companionNum)
	{
		this.companionNum = companionNum;
	}
}
