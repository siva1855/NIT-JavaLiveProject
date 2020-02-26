package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipmenttype_table")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name = "shipmenttype_id")
	private Integer shipmentTypeId;

	@Column(name = "shipment_mode")
	private String shipmentMode;

	@Column(name = "shipment_code")
	private String shipmentCode;

	@Column(name = "shipment_enable")
	private String shipmentEnable;

	@Column(name = "shipment_grade")
	private String shipmentGrade;

	@Column(name = "shipment_descr")
	private String shipmentDescr;

	public ShipmentType() {
		super();
	}

	public Integer getShipmentTypeId() {
		return shipmentTypeId;
	}

	public ShipmentType(Integer shipmentTypeId) {
		super();
		this.shipmentTypeId = shipmentTypeId;
	}

	public void setShipmentTypeId(Integer shipmentTypeId) {
		this.shipmentTypeId = shipmentTypeId;
	}

	public String getShipmentMode() {
		return shipmentMode;
	}

	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}

	public String getShipmentCode() {
		return shipmentCode;
	}

	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}

	public String getShipmentEnable() {
		return shipmentEnable;
	}

	public void setShipmentEnable(String shipmentEnable) {
		this.shipmentEnable = shipmentEnable;
	}

	public String getShipmentGrade() {
		return shipmentGrade;
	}

	public void setShipmentGrade(String shipmentGrade) {
		this.shipmentGrade = shipmentGrade;
	}

	public String getShipmentDescr() {
		return shipmentDescr;
	}

	public void setShipmentDescr(String shipmentDescr) {
		this.shipmentDescr = shipmentDescr;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipmentTypeId=" + shipmentTypeId + ", shipmentMode=" + shipmentMode + ", shipmentCode="
				+ shipmentCode + ", shipmentEnable=" + shipmentEnable + ", shipmentGrade=" + shipmentGrade
				+ ", shipmentDescr=" + shipmentDescr + "]";
	}

}
