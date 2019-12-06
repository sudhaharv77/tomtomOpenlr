package com.stee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stee.trafficdata.model.MapDataZone;

public interface TrafficRepository extends JpaRepository<MapDataZone, Long> {
	
	
	@Query("select u from MapDataZone u where u.id = ?1")
	MapDataZone findById(String id);
	
	@Query(nativeQuery =true,value = "select * from map_data_zone") 
    List<MapDataZone> getALL();
}
