package com.stee.service;

import java.util.List;

import com.stee.trafficdata.model.MapDataZone;

import openlr.map.MapDatabase;

public interface TrafficDataService {
	
	public List<MapDataZone> getAllMapDataZone();
	
	public MapDatabase getSqliteDB();

}
