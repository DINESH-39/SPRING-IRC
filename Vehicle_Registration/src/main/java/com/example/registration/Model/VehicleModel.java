package com.example.registration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehicle_Details")
public class VehicleModel 
{

	@Id
	private int id;
	private String regno;
	private String ownername;
	private String vehicletype;
	private String manufacturer;
	private String modelname;
	private String fueltype;
	private int regyear;
	private int cc;
	private String regstate;
	private String colour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelmame(String modelmame) {
		this.modelname = modelmame;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getRegyear() {
		return regyear;
	}
	public void setRegyear(int regyear) {
		this.regyear = regyear;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getRegstate() {
		return regstate;
	}
	public void setRegstate(String regstate) {
		this.regstate = regstate;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "VehicleModel [id=" + id + ", regno=" + regno + ", ownername=" + ownername + ", vehicletype="
				+ vehicletype + ", manufacturer=" + manufacturer + ", modelname=" + modelname + ", fueltype=" + fueltype
				+ ", regyear=" + regyear + ", cc=" + cc + ", regstate=" + regstate + ", colour=" + colour + "]";
	}
	
	
	
	
	
}
