package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whusertype_table")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name = "whusertype_id")
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

	public WhUserType() {
		super();
	}

	public Integer getWhUserTypeId() {
		return whUserTypeId;
	}

	public void setWhUserTypeId(Integer whUserTypeId) {
		this.whUserTypeId = whUserTypeId;
	}

	public String getWhUserType() {
		return whUserType;
	}

	public void setWhUserType(String whUserType) {
		this.whUserType = whUserType;
	}

	public String getWhUserTypeCode() {
		return whUserTypeCode;
	}

	public void setWhUserTypeCode(String whUserTypeCode) {
		this.whUserTypeCode = whUserTypeCode;
	}

	public String getWhUserTypeFor() {
		return whUserTypeFor;
	}

	public void setWhUserTypeFor(String whUserTypeFor) {
		this.whUserTypeFor = whUserTypeFor;
	}

	public String getWhUserTypeMail() {
		return whUserTypeMail;
	}

	public void setWhUserTypeMail(String whUserTypeMail) {
		this.whUserTypeMail = whUserTypeMail;
	}

	public Long getWhUserTypeContact() {
		return whUserTypeContact;
	}

	public void setWhUserTypeContact(Long whUserTypeContact) {
		this.whUserTypeContact = whUserTypeContact;
	}

	public String getWhUserTypeIdType() {
		return whUserTypeIdType;
	}

	public void setWhUserTypeIdType(String whUserTypeIdType) {
		this.whUserTypeIdType = whUserTypeIdType;
	}

	public String getWhUserTypeIfOther() {
		return whUserTypeIfOther;
	}

	public void setWhUserTypeIfOther(String whUserTypeIfOther) {
		this.whUserTypeIfOther = whUserTypeIfOther;
	}

	public Integer getWhUserTypeIdNumber() {
		return whUserTypeIdNumber;
	}

	public void setWhUserTypeIdNumber(Integer whUserTypeIdNumber) {
		this.whUserTypeIdNumber = whUserTypeIdNumber;
	}

	@Override
	public String toString() {
		return "WhUserType [whUserTypeId=" + whUserTypeId + ", whUserType=" + whUserType + ", whUserTypeCode="
				+ whUserTypeCode + ", whUserTypeFor=" + whUserTypeFor + ", whUserTypeMail=" + whUserTypeMail
				+ ", whUserTypeContact=" + whUserTypeContact + ", whUserTypeIdType=" + whUserTypeIdType
				+ ", whUserTypeIfOther=" + whUserTypeIfOther + ", whUserTypeIdNumber=" + whUserTypeIdNumber + "]";
	}

}
