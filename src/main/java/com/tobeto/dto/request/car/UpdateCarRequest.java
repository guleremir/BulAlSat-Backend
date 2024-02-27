package com.tobeto.dto.request.car;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

	private int advertNo;
	private double price;
	private String address;
	private Date advertDate;
	private String brand;
	private String model;
	private String year;
	private String fuel;
	private String vehicleStatus;
	private int km;
	private String color;

}
