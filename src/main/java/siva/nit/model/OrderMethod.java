package siva.nit.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ordermethod_table")
public class OrderMethod {
	
	@Id
	@GeneratedValue(generator ="ordermethodidgenerator")
	@GenericGenerator(name="ordermethodidgenerator",strategy = "increment")
	@Column(name="ordermethod_id")
	private Integer orderMethodId;
	
	
	@Column(name="ordermethod_mode")
	private String orderMethodMode;
	@Column(name="ordermethod_code")
	private String orderMethodCode;
	@Column(name="ordermethod_type")
	private String orderMethodType;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="ordermethodaccept_table",joinColumns = @JoinColumn(name="ordermethod_id"))
	@OrderColumn(name="position")
	@Column(name="ordermethod_accept")
	private List<String> orderMethodAccept;
	
	@Column(name="ordermethod_description")
	private String orderMethodDescription;


	public OrderMethod() {
		super();
	}

	
	public Integer getOrderMethodId() {
		return orderMethodId;
	}

	public void setOrderMethodId(Integer orderMethodId) {
		this.orderMethodId = orderMethodId;
	}

	public String getOrderMethodMode() {
		return orderMethodMode;
	}

	public void setOrderMethodMode(String orderMethodMode) {
		this.orderMethodMode = orderMethodMode;
	}

	public String getOrderMethodCode() {
		return orderMethodCode;
	}

	public void setOrderMethodCode(String orderMethodCode) {
		this.orderMethodCode = orderMethodCode;
	}

	public String getOrderMethodType() {
		return orderMethodType;
	}

	public void setOrderMethodType(String orderMethodType) {
		this.orderMethodType = orderMethodType;
	}

	public List<String> getOrderMethodAccept() {
		return orderMethodAccept;
	}

	public void setOrderMethodAccept(List<String> orderMethodAccept) {
		this.orderMethodAccept = orderMethodAccept;
	}

	public String getOrderMethodDescription() {
		return orderMethodDescription;
	}

	public void setOrderMethodDescription(String orderMethodDescription) {
		this.orderMethodDescription = orderMethodDescription;
	}

	
	
	@Override
	public String toString() {
		return "OrderMethod [orderMethodId=" + orderMethodId + ", orderMethodMode=" + orderMethodMode
				+ ", orderMethodCode=" + orderMethodCode + ", orderMethodType=" + orderMethodType
				+ ", orderMethodAccept=" + orderMethodAccept + ", orderMethodDescription=" + orderMethodDescription
				+ "]";
	}
}
