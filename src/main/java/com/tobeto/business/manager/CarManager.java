package com.tobeto.business.manager;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tobeto.business.service.CarService;
import com.tobeto.dto.request.car.AddCarRequest;
import com.tobeto.dto.request.car.DeleteCarRequest;
import com.tobeto.dto.request.car.UpdateCarRequest;
import com.tobeto.dto.response.car.GetAllCarsResponse;
import com.tobeto.dto.response.car.GetByIdCarResponse;
import com.tobeto.entities.Car;
import com.tobeto.repository.CarRepository;

@Service
public class CarManager implements CarService {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	@Qualifier("requestMapper")
	private ModelMapper requestMapper;

	@Autowired
	@Qualifier("responseMapper")
	private ModelMapper responseMapper;

	@Override
	public List<GetAllCarsResponse> getAll() {
		return carRepository.findAll().stream()
				.map(c -> responseMapper.map(c, GetAllCarsResponse.class))
				.toList();
	}

	@Override
	public GetByIdCarResponse getById(int id) {
		Optional<Car> car = carRepository.findById(id);
		return responseMapper.map(car, GetByIdCarResponse.class);
	}

	@Override
	public void add(AddCarRequest addCarRequest) {
		Car car = requestMapper.map(addCarRequest, Car.class);
		carRepository.save(car);
	}

	@Override
	public void update(UpdateCarRequest updateCarRequest) {
		Car car = requestMapper.map(updateCarRequest, Car.class);
		carRepository.save(car);
	}

	@Override
	public void delete(DeleteCarRequest deleteCarRequest) {
		Car car = requestMapper.map(deleteCarRequest, Car.class);
		carRepository.delete(car);
	}

}
