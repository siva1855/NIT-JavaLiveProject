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

	@Column(name = "shipmenttype_mode")
	private String shipmentTypeMode;

	@Column(name = "shipmenttype_code")
	private String shipmentTypeCode;

	@Column(name = "shipmenttype_enable")
	private String shipmentTypeEnable;

	@Column(name = "shipmenttype_grade")
	private String shipmentTypeGrade;

	@Column(name = "shipmenttype_description")
	private String shipmentTypeDescription;

	public ShipmentType() {
		super();
	}

	public ShipmentType(Integer shipmentTypeId) {
		super();
		this.shipmentTypeId = shipmentTypeId;
	}

	public Integer getShipmentTypeId() {
		return shipmentTypeId;
	}

	public void setShipmentTypeId(Integer shipmentTypeId) {
		this.shipmentTypeId = shipmentTypeId;
	}

	public String getShipmentTypeMode() {
		return shipmentTypeMode;
	}

	public void setShipmentTypeMode(String shipmentTypeMode) {
		this.shipmentTypeMode = shipmentTypeMode;
	}

	public String getShipmentTypeCode() {
		return shipmentTypeCode;
	}

	public void setShipmentTypeCode(String shipmentTypeCode) {
		this.shipmentTypeCode = shipmentTypeCode;
	}

	public String getShipmentTypeEnable() {
		return shipmentTypeEnable;
	}

	public void setShipmentTypeEnable(String shipmentTypeEnable) {
		this.shipmentTypeEnable = shipmentTypeEnable;
	}

	public String getShipmentTypeGrade() {
		return shipmentTypeGrade;
	}

	public void setShipmentTypeGrade(String shipmentTypeGrade) {
		this.shipmentTypeGrade = shipmentTypeGrade;
	}

	public String getShipmentTypeDescription() {
		return shipmentTypeDescription;
	}

	public void setShipmentTypeDescription(String shipmentTypeDescription) {
		this.shipmentTypeDescription = shipmentTypeDescription;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipmentTypeId=" + shipmentTypeId + ", shipmentTypeMode=" + shipmentTypeMode
				+ ", shipmentTypeCode=" + shipmentTypeCode + ", shipmentTypeEnable=" + shipmentTypeEnable
				+ ", shipmentTypeGrade=" + shipmentTypeGrade + ", shipmentTypeDescription=" + shipmentTypeDescription
				+ "]";
	}

}
