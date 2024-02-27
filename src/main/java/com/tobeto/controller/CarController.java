package com.tobeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.service.CarService;
import com.tobeto.dto.request.car.AddCarRequest;
import com.tobeto.dto.request.car.DeleteCarRequest;
import com.tobeto.dto.request.car.UpdateCarRequest;
import com.tobeto.dto.response.car.GetAllCarsResponse;
import com.tobeto.dto.response.car.GetByIdCarResponse;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping("/getAll")
	public List<GetAllCarsResponse> getAllCarsResponse() {
		return carService.getAll();
	}

	@GetMapping("/get/{id}")
	public GetByIdCarResponse getByIdCarResponse(@PathVariable int id) {
		return carService.getById(id);
	}

	@PostMapping("/add")
	public void addCarRequest(@RequestBody AddCarRequest addCarRequest) {
		carService.add(addCarRequest);
	}

	@PutMapping("/update")
	public void updateCarRequest(
			@RequestBody UpdateCarRequest updateCarRequest) {
		carService.update(updateCarRequest);
	}

	@DeleteMapping("/delete")
	public void deleteCarRequest(
			@RequestBody DeleteCarRequest deleteCarRequest) {
		carService.delete(deleteCarRequest);
	}

}
