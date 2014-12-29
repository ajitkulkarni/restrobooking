package com.restrobooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrobooking.domain.EmployeePerformanceInfo;
import com.restrobooking.repository.EmployeePerformanceInfoRepository;

@Service
public class SampleService {

	
	@Autowired
	private EmployeePerformanceInfoRepository employeePerformanceInfoRepository;
	
	public void prepareEmployeePerformanceInfo(String data){
		EmployeePerformanceInfo employeePerformanceInfo = new EmployeePerformanceInfo();
		employeePerformanceInfo.setName(data);
		employeePerformanceInfoRepository.save(employeePerformanceInfo);
	}
}
