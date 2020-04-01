package siva.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "documentsuploaddownload_table")
public class DocumentsUploadDownload {

	@Id
	@Column(name = "file_id")
	private Integer fileId;

	@Column(name = "file_name")
	private String fileName;

	// byte[]+@Lob=BLOB
	@Lob
	@Column(name = "file_data")
	private byte[] fileData;

}
