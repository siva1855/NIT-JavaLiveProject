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

import siva.nit.model.ShipmentType;

public class ShipmentTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=ShipmentTypePdfData.pdf");
		
		// create element
		Paragraph paragraph = new Paragraph("Welcome To Shipment Type");
		
		// add element to document
		document.add(paragraph);
		
		// read data from model
		@SuppressWarnings("unchecked")
		List<ShipmentType> list = (List<ShipmentType>) model.get("showShipmentTypePdfData");
		
		// creating table with number of columns
		PdfPTable pdfPTable = new PdfPTable(6);
		pdfPTable.addCell("ShipmentType ID");
		pdfPTable.addCell("ShipmentType MODE");
		pdfPTable.addCell("ShipmentType CODE");
		pdfPTable.addCell("ShipmentType ENABLE");
		pdfPTable.addCell("ShipmentType GRADE");
		pdfPTable.addCell("ShipmentType Description");

		// adding data to table
		for (ShipmentType shipmentType : list) {
			pdfPTable.addCell(shipmentType.getShipmentTypeId().toString());
			pdfPTable.addCell(shipmentType.getShipmentMode());
			pdfPTable.addCell(shipmentType.getShipmentCode());
			pdfPTable.addCell(shipmentType.getShipmentEnable());
			pdfPTable.addCell(shipmentType.getShipmentGrade());
			pdfPTable.addCell(shipmentType.getShipmentDescr());
		}
		// add table to document
		document.add(pdfPTable);
		
		// print date and Time
		document.add(new Paragraph(new Date().toString()));

	}
}
