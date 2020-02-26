package siva.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import siva.nit.model.DocumentsUploadDownload;
import siva.nit.service.DocumentsUploadDownloadService;


@Controller
@RequestMapping("/documents")
public class DocumentsUploadDownloadController {

	@Autowired
	private DocumentsUploadDownloadService documentsUploadDownloadService;

	// 1.Show Document Upload Page
	@RequestMapping("/show")
	public String showDocumentsUploadPage() {
		return "DocumentsUploadDownload";
	}

	// 2.Upload Documents into DataBase
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String doUpload(@RequestParam Integer fileId,
			@RequestParam CommonsMultipartFile fileObject, Model model) {

		if (fileObject != null) {
			DocumentsUploadDownload documentsUpload = new DocumentsUploadDownload();
			documentsUpload.setFileId(fileId);
			documentsUpload.setFileName(fileObject.getOriginalFilename());
			documentsUpload.setFileData(fileObject.getBytes());
			documentsUploadDownloadService.saveDocumentsUploadDownload(documentsUpload);
			String message = fileId+ " is Uploaded";
			model.addAttribute("doUploadMessage", message);
		}
		return "DocumentsUploadDownload";
	}

}
