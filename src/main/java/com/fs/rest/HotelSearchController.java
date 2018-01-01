package com.fs.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fs.dto.FlightStatus;
import com.fs.dto.Search;
import com.fs.dto.Status;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Hotel Service")
@RestController
public class HotelSearchController {

	@ApiOperation(value = "Hotel Service", nickname = "getHotelStatus")
	@RequestMapping(value="/hotel/search",method = RequestMethod.POST)
	public Status hotelSearch(@RequestBody Search search){				
		return new FlightStatus();
		
	}
}