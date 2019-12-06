/**
 * Classname :KafkaListener.java
 *
 * Description : Listener class to listen to consume the kafka topic
 *
 * Author : sudhaharv
**/
package com.stee.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.stee.service.TrafficDataService;
import com.stee.trafficdata.model.MapDataZone;

import openlr.map.MapDatabase;

@Component
@Profile("!test")
public class KafkaRunner implements ApplicationRunner {

	private final Logger log = LoggerFactory.getLogger(KafkaRunner.class);

	@Autowired
	private TrafficDataService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		 List<MapDataZone>  mapList = service.getAllMapDataZone();
		 System.out.println(mapList.size());
		 
		 MapDatabase mdp= service.getSqliteDB();
		 System.out.println(mdp);

	}
}
