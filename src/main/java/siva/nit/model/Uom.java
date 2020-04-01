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
@Table(name = "uom_table")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name = "uom_id")
	@NonNull
	private Integer uomId;

	@Column(name = "uom_type")
	private String uomType;
	@Column(name = "uom_model")
	private String uomModel;
	@Column(name = "uom_description")
	private String uomDescription;
	
	

}
