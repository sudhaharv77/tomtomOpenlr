package com.stee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stee.repo.TrafficRepository;
import com.stee.trafficdata.model.MapDataZone;

import openlr.map.MapDatabase;
import openlr.map.loader.MapLoadParameter;
import openlr.map.sqlite.loader.DBFileNameParameter;
import openlr.map.sqlite.loader.SQLiteMapLoader;
@Service
public class TrafficDataServiceImpl implements TrafficDataService {

	
	@Autowired
	TrafficRepository repo;
	
	@Override
	public List<MapDataZone> getAllMapDataZone() {
		return (List<MapDataZone>) repo.getALL();
	}

	@Override
	public MapDatabase getSqliteDB() {
		MapDatabase mdb=null;
		String sqliteFile= "C:/Users/sudhaharv/Downloads/ldap/spring-boot-master/spring-data-jpa-postgresql/src/main/resources/db3/tomtom_dubai.db3";
		try {
			SQLiteMapLoader mapLoader = new SQLiteMapLoader();
			List<MapLoadParameter> params = new ArrayList<MapLoadParameter>();
			DBFileNameParameter dbFile = new DBFileNameParameter();
			dbFile.setValue(sqliteFile);
			params.add(dbFile);
			mdb = mapLoader.load(params);
			System.out.println(mdb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mdb;
	}

}
