package com.onlydev.garminfit.model;

import java.util.HashMap;
import java.util.Map;

public class Record {

	
	private Map<String, Object> distance;
	private Map<String, Object> heart_rate;
	private Map<String, Object> cadence;
	private Map<String, Object> speed;
	
	public Record() {
		
		distance = new HashMap<String, Object>();
		heart_rate = new HashMap<String, Object>();
		cadence = new HashMap<String, Object>();
		speed = new HashMap<String, Object>();
		
		distance.put("name", "distance");
		heart_rate.put("name", "heart_rate");
		cadence.put("name", "cadence");
		speed.put("name", "speed");
		
		distance.put("unit", "km");
		heart_rate.put("unit", "bpm");
		cadence.put("unit", "rpm");
		speed.put("unit", "km/h");
		
		
	}
	
	public String toString() {
		
		return "distance:"+distance.toString()+",heart_rate:"+heart_rate.toString()+",cadence:"+cadence.toString()+",speed:"+speed.toString();
	}

	public Map<String, Object> getDistance() {
		return distance;
	}

	public void setDistance(Map<String, Object> distance) {
		this.distance = distance;
	}

	public Map<String, Object> getHeart_rate() {
		return heart_rate;
	}

	public void setHeart_rate(Map<String, Object> heart_rate) {
		this.heart_rate = heart_rate;
	}

	public Map<String, Object> getCadence() {
		return cadence;
	}

	public void setCadence(Map<String, Object> cadence) {
		this.cadence = cadence;
	}

	public Map<String, Object> getSpeed() {
		return speed;
	}

	public void setSpeed(Map<String, Object> speed) {
		this.speed = speed;
	}
	
}
