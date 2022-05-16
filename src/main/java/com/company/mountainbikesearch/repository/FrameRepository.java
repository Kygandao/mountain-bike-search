package com.company.mountainbikesearch.repository;

import com.company.mountainbikesearch.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrameRepository extends JpaRepository<Bike, Integer> {

    List<Bike> findBySize(String size);
    List<Bike> findByReach(Integer reach);
    List<Bike> findByWheelSize(String wheelSize);
    List<Bike> findByManufacturer(String manufacturer);
    List<Bike> findByModel (String model);
    List<Bike> findByYear(String year);
    List<Bike> findByFrameMaterial (String frameMaterial);
    List<Bike> findByCategory(String category);
    List<Bike> findBySuspensionType(String suspensionType);


}
