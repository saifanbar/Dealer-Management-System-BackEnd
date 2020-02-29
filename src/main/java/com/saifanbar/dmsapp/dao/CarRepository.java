package com.saifanbar.dmsapp.dao;

import com.saifanbar.dmsapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CarRepository extends JpaRepository<Car, Long> {
}
