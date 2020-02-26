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

import siva.nit.model.Uom;

public class UomPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=UomPdfData.pdf");

		// create element
		Paragraph paragraph = new Paragraph("Welcome To Uom");

		// add element to document
		document.add(paragraph);

		// read data from model
		@SuppressWarnings("unchecked")
		List<Uom> list = (List<Uom>) model.get("showUomPdfData");

		// creating table with number of columns
		PdfPTable pdfPTable = new PdfPTable(4);
		pdfPTable.addCell("Uom ID");
		pdfPTable.addCell("Uom TYPE");
		pdfPTable.addCell("Uom MODE");
		pdfPTable.addCell("Description");

		// adding data to table
		for (Uom uom : list) {
			pdfPTable.addCell(uom.getUomId().toString());
			pdfPTable.addCell(uom.getUomType());
			pdfPTable.addCell(uom.getUomModel());
			pdfPTable.addCell(uom.getUomDescription());
		}
		// add table to document
		document.add(pdfPTable);

		// print date and Time
		document.add(new Paragraph(new Date().toString()));

	}
}
