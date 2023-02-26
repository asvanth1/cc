package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asvanth")
public class model {
	@Id
	private int sno;
	private String model;
	private int storage ;
	private int ram;
	

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public model(int sno, String model, int storage, int ram) {
		super();
		this.sno = sno;
		this.model = model;
		this.storage = storage;
		this.ram = ram;
	}

	public model() {
		
	}
	
	public String toString() {
		return "sno="+sno+"model="+model+"storage="+storage+"ram="+ram;
	}
}