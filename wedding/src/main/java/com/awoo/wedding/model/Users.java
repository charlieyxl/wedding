package com.awoo.wedding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users implements Serializable
{
	private static final long serialVersionUID = 884438297522015831L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 8)
	private int id;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	
	@Column(name = "email", unique = true, nullable = false, length = 30)
	private String email;
	
	@Column(name = "mate", nullable = false, length = 20)
	private String mate;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getMate()
	{
		return mate;
	}

	public void setMate(String mate)
	{
		this.mate = mate;
	}
}
