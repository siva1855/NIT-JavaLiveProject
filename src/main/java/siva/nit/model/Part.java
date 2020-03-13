package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "part_table")
public class Part {
	@Id
	@GeneratedValue
	@Column(name = "part_id")
	private Integer partId;

	@Column(name = "part_code")
	private String partCode;

	@Column(name = "part_dimensionlength")
	private Double partDimensionLength;
	@Column(name = "part_dimensionwidth")
	private Double partDimensionWidth;
	@Column(name = "part_dimensionheight")
	private Double partDimensionHeight;

	@Column(name = "part_basecost")
	private Double partBaseCost;
	@Column(name = "part_basecurrency")
	private String partBaseCurrency;

	// HAS-A Relation----Module Uom
	@ManyToOne
	@JoinColumn(name = "uomIdFK")
	private Uom uomObj;

	// HAS-A Relation----Module OrderMethod(Sale)
	@ManyToOne
	@JoinColumn(name = "orderMethodSaleIdFK")
	private OrderMethod orderMethodSaleObj;

	// HAS-A Relation----Module OrderMethod(Purchase)
	@ManyToOne
	@JoinColumn(name = "orderMethodPurchaseIdFK")
	private OrderMethod orderMethodPurchaseObj;

	@Column(name = "part_description")
	private String partDescription;

	public Part() {
		super();
	}

	public Part(Integer partId) {
		super();
		this.partId = partId;
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public String getPartCode() {
		return partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public Double getPartDimensionLength() {
		return partDimensionLength;
	}

	public void setPartDimensionLength(Double partDimensionLength) {
		this.partDimensionLength = partDimensionLength;
	}

	public Double getPartDimensionWidth() {
		return partDimensionWidth;
	}

	public void setPartDimensionWidth(Double partDimensionWidth) {
		this.partDimensionWidth = partDimensionWidth;
	}

	public Double getPartDimensionHeight() {
		return partDimensionHeight;
	}

	public void setPartDimensionHeight(Double partDimensionHeight) {
		this.partDimensionHeight = partDimensionHeight;
	}

	public Double getPartBaseCost() {
		return partBaseCost;
	}

	public void setPartBaseCost(Double partBaseCost) {
		this.partBaseCost = partBaseCost;
	}

	public String getPartBaseCurrency() {
		return partBaseCurrency;
	}

	public void setPartBaseCurrency(String partBaseCurrency) {
		this.partBaseCurrency = partBaseCurrency;
	}

	public Uom getUomObj() {
		return uomObj;
	}

	public void setUomObj(Uom uomObj) {
		this.uomObj = uomObj;
	}

	public OrderMethod getOrderMethodSaleObj() {
		return orderMethodSaleObj;
	}

	public void setOrderMethodSaleObj(OrderMethod orderMethodSaleObj) {
		this.orderMethodSaleObj = orderMethodSaleObj;
	}

	public OrderMethod getOrderMethodPurchaseObj() {
		return orderMethodPurchaseObj;
	}

	public void setOrderMethodPurchaseObj(OrderMethod orderMethodPurchaseObj) {
		this.orderMethodPurchaseObj = orderMethodPurchaseObj;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partCode=" + partCode + ", partDimensionLength=" + partDimensionLength
				+ ", partDimensionWidth=" + partDimensionWidth + ", partDimensionHeight=" + partDimensionHeight
				+ ", partBaseCost=" + partBaseCost + ", partBaseCurrency=" + partBaseCurrency + ", uomObj=" + uomObj
				+ ", orderMethodSaleObj=" + orderMethodSaleObj + ", orderMethodPurchaseObj=" + orderMethodPurchaseObj
				+ ", partDescription=" + partDescription + "]";
	}

}
