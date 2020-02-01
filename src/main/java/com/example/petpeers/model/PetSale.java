package com.example.petpeers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name = "pet_sale")
public class PetSale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pet_id")
	private int pet_id;
	
	@Column(name = "bread_name")
	private String breadName;
	
	@Column(name = "bread_url")
	private String breadUrl;
	
	@Column(name = "sold_status")
	private int soldStatus;
	
	
	
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public String getBreadName() {
		return breadName;
	}
	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	public String getBreadUrl() {
		return breadUrl;
	}
	public void setBreadUrl(String breadUrl) {
		this.breadUrl = breadUrl;
	}
	public int getSoldStatus() {
		return soldStatus;
	}
	public void setSoldStatus(int soldStatus) {
		this.soldStatus = soldStatus;
	}
	

}
