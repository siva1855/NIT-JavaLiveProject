package siva.nit.service;

import java.util.List;

import siva.nit.model.DocumentsUploadDownload;

public interface DocumentsUploadDownloadService {

	public Integer saveDocumentsUploadDownload(DocumentsUploadDownload documentsUpload);

	public List<Object[]> getFileIdAndNames();

	public DocumentsUploadDownload getOneDocument(Integer id);
}
