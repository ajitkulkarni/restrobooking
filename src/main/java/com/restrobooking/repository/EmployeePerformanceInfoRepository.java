package com.restrobooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restrobooking.domain.EmployeePerformanceInfo;

@Repository
public interface EmployeePerformanceInfoRepository extends CrudRepository<EmployeePerformanceInfo, String> {

}
