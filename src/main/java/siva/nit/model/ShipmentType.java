package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "shipmenttype_table")
public class ShipmentType {
	
	@Id
	@GeneratedValue
	@Column(name = "shipmenttype_id")
	@NonNull
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

}
