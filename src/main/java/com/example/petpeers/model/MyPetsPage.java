package com.example.petpeers.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity()
@Table(name = "my_pet")
public class MyPetsPage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="my_pet_id")
	private int my_pet_id;
	
	@Column
	private int pet_id;
	
	@Column(name="user_id")
	private int userId;
	
	@Transient
	private List<MyPetsPage> myPets;
	@Transient
	private Users users;
	
	
	public int getMy_pet_id() {
		return my_pet_id;
	}

	public void setMy_pet_id(int my_pet_id) {
		this.my_pet_id = my_pet_id;
	}

	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<MyPetsPage> getMyPets() {
		return myPets;
	}

	public void setMyPets(List<MyPetsPage> myPets) {
		this.myPets = myPets;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	
	
	
}
