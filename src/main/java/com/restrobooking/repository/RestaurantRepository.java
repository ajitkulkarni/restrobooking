package com.restrobooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restrobooking.domain.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, String> {

}
