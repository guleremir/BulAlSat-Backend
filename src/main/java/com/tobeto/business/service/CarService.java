package com.tobeto.business.service;

import java.util.List;

import com.tobeto.dto.request.car.AddCarRequest;
import com.tobeto.dto.request.car.DeleteCarRequest;
import com.tobeto.dto.request.car.UpdateCarRequest;
import com.tobeto.dto.response.car.GetAllCarsResponse;
import com.tobeto.dto.response.car.GetByIdCarResponse;

public interface CarService {

	List<GetAllCarsResponse> getAll();

	public GetByIdCarResponse getById(int id);

	void add(AddCarRequest addCarRequest);

	void update(UpdateCarRequest updateCarRequest);

	void delete(DeleteCarRequest deleteCarRequest);

}
