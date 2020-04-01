package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "part_table")
public class Part {
	@Id
	@GeneratedValue
	@Column(name = "part_id")
	@NonNull
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

	
}
