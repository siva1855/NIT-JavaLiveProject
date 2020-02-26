package siva.nit.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

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

	public DocumentsUploadDownload() {
		super();
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	@Override
	public String toString() {
		return "DocumentsUpload [fileId=" + fileId + ", fileName=" + fileName + ", fileData="
				+ Arrays.toString(fileData) + "]";
	}

}
