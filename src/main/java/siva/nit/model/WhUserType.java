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
@Table(name = "whusertype_table")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name = "whusertype_id")
	@NonNull
	private Integer whUserTypeId;

	@Column(name = "whusertype_type")
	private String whUserType;

	@Column(name = "whusertype_code")
	private String whUserTypeCode;

	@Column(name = "whusertype_for")
	private String whUserTypeFor;

	@Column(name = "whusertype_mail")
	private String whUserTypeMail;

	@Column(name = "whusertype_contact")
	private Long whUserTypeContact;

	@Column(name = "whusertype_id_type")
	private String whUserTypeIdType;

	@Column(name = "whusertype_if_other")
	private String whUserTypeIfOther;

	@Column(name = "whusertype_id_number")
	private Integer whUserTypeIdNumber;

	
}
