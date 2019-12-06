package com.stee.trafficdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MAP_DATA_ZONE")
public class MapDataZone {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long no;
    
    @Column(name = "ROUTENUM")
	private String routeNumber;
    
    @Column(name = "ROAD_NAME")
	private String roadName;
    
    @Column(name = "ROAD_CAT")
	private String roadCategory;    
    
    @Column(name = "ZONE_ID")
    private int zoneId;
	
    @Column(name = "ONEWAY")
    private String oneWay;
	
    @Column(name = "LINK_ID")
    private long linkId;
    
    @Column(name = "F_JNCTID")
	private long fJuncId;
    
    @Column(name = "T_JNCTID")
	private long tJunctId;
	
    @Column(name = "FRC")
    private int frc;
    
    @Column(name = "METERS")
	private float lengthInMeters;
    
    @Column(name = "LANES")
	private int numberOfLanes;
    
    @Column(name = "ORDER01")
	private String order;
	
    
	public MapDataZone() {
		
	}
	
	
	public MapDataZone(Long no, String routeNumber, String roadName, String roadCategory, int zoneId, String oneWay,
			long linkId, long fJuncId, long tJunctId, int frc, float lengthInMeters, int numberOfLanes, String order) {
		super();
		this.no = no;
		this.routeNumber = routeNumber;
		this.roadName = roadName;
		this.roadCategory = roadCategory;
		this.zoneId = zoneId;
		this.oneWay = oneWay;
		this.linkId = linkId;
		this.fJuncId = fJuncId;
		this.tJunctId = tJunctId;
		this.frc = frc;
		this.lengthInMeters = lengthInMeters;
		this.numberOfLanes = numberOfLanes;
		this.order = order;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getRoadCategory() {
		return roadCategory;
	}
	public void setRoadCategory(String roadCategory) {
		this.roadCategory = roadCategory;
	}
	public int getZoneId() {
		return zoneId;
	}
	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}
	public String getOneWay() {
		return oneWay;
	}
	public void setOneWay(String oneWay) {
		this.oneWay = oneWay;
	}
	public long getLinkId() {
		return linkId;
	}
	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}
	public long getfJuncId() {
		return fJuncId;
	}
	public void setfJuncId(long fJuncId) {
		this.fJuncId = fJuncId;
	}
	public long gettJunctId() {
		return tJunctId;
	}
	public void settJunctId(long tJunctId) {
		this.tJunctId = tJunctId;
	}
	public int getFrc() {
		return frc;
	}
	public void setFrc(int frc) {
		this.frc = frc;
	}
	public float getLengthInMeters() {
		return lengthInMeters;
	}
	public void setLengthInMeters(float lengthInMeters) {
		this.lengthInMeters = lengthInMeters;
	}
	public int getNumberOfLanes() {
		return numberOfLanes;
	}
	public void setNumberOfLanes(int numberOfLanes) {
		this.numberOfLanes = numberOfLanes;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	
	
}
