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
@Table(name="ordermethod_table")
public class OrderMethod {
	
	@Id
	@GeneratedValue(generator ="ordermethodidgenerator")
	@GenericGenerator(name="ordermethodidgenerator",strategy = "increment")
	@Column(name="ordermethod_id")
	@NonNull
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


	
}
