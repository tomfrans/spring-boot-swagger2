package com.fs.dto;

import java.util.Date;

public class FlightStatus extends Status {
	
	private String flightName;
	private String route;
	private Date departureTime;
	private Date arrivalTime;
	private String departureTerminal;
	private String departureGate;
	private String arrivalTerminal;
	private String arrivalGate;
	
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTerminal() {
		return departureTerminal;
	}
	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}
	public String getDepartureGate() {
		return departureGate;
	}
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}
	public String getArrivalTerminal() {
		return arrivalTerminal;
	}
	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}
	public String getArrivalGate() {
		return arrivalGate;
	}
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}
	
	
}
