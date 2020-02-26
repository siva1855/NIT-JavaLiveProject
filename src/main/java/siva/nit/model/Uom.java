package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uom_table")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name = "uom_id")
	private Integer uomId;

	@Column(name = "uom_type")
	private String uomType;
	@Column(name = "uom_model")
	private String uomModel;
	@Column(name = "uom_description")
	private String uomDescription;

	public Uom() {
		super();
	}

	public Uom(Integer uomId) {
		super();
		this.uomId = uomId;
	}


	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getUomDescription() {
		return uomDescription;
	}

	public void setUomDescription(String uomDescription) {
		this.uomDescription = uomDescription;
	}

	@Override
	public String toString() {
		return "Uom [uomId=" + uomId + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDescription="
				+ uomDescription + "]";
	}

}
