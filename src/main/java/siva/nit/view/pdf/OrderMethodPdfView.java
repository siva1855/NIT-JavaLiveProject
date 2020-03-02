package siva.nit.view.pdf;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import siva.nit.model.OrderMethod;


public class OrderMethodPdfView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=OrderMethodPdfData.pdf");
		
		// create element
		Paragraph paragraph = new Paragraph("Welcome To OrderMethod");
		
		// add element to document
		document.add(paragraph);
		
		// read data from model
		@SuppressWarnings("unchecked")
		List<OrderMethod> list = (List<OrderMethod>) model.get("showOrderMethodPdfData");
		
		// creating table with number of columns
		PdfPTable pdfPTable = new PdfPTable(6);
		pdfPTable.addCell("ORDERMETHOD ID");
		pdfPTable.addCell("ORDERMETHOD MODE");
		pdfPTable.addCell("ORDERMETHOD CODE");
		pdfPTable.addCell("ORDERMETHOD TYPE");
		pdfPTable.addCell("ORDERMETHOD ACCEPT");
		pdfPTable.addCell("ORDERMETHOD DESCRIPTION");

		// adding data to table
		for (OrderMethod orderMethod : list) {
			pdfPTable.addCell(orderMethod.getOrderMethodId().toString());
			pdfPTable.addCell(orderMethod.getOrderMethodMode());
			pdfPTable.addCell(orderMethod.getOrderMethodCode());
			pdfPTable.addCell(orderMethod.getOrderMethodType());
			pdfPTable.addCell(orderMethod.getOrderMethodAccept().toString());
			pdfPTable.addCell(orderMethod.getOrderMethodDescription());
		}
		// add table to document
		document.add(pdfPTable);
		
		// print date and Time
		document.add(new Paragraph(new Date().toString()));

	}
}
