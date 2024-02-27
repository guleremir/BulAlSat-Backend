package com.tobeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "car")
@Data
public class Car {

	// Entity classı dönüş tipleri güncellenecek !!
	//

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "advertNo")
	private int advertNo;

	@Column(name = "price")
	private double price;

	@Column(name = "address")
	private String address;

	@Column(name = "advertDate")
	private Date advertDate;

	@Column(name = "brand")
	private String brand;

	@Column(name = "model")
	private String model;

	@Column(name = "year")
	private String year;

	@Column(name = "fuel")
	private String fuel;

	@Column(name = "vehicleStatus")
	private String vehicleStatus;

	@Column(name = "km")
	private int km;

	@Column(name = "color")
	private String color;

}
