package siva.nit.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import siva.nit.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=ShipmentTypeExcelData.xlsx");

		Sheet sheet = workbook.createSheet("ShipmentData");

		// construct -row -0 (Header)
		setHeader(sheet);

		// read model data
		@SuppressWarnings("unchecked")
		List<ShipmentType> list = (List<ShipmentType>) model.get("showShipmentTypeExcelData");
		setBody(sheet, list);
	}

	// it will print only row number--0 (Header)
	private void setHeader(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("SHIPMENT ID");
		row.createCell(1).setCellValue("SHIPMENT MODE");
		row.createCell(2).setCellValue("SHIPMENT CODE");
		row.createCell(3).setCellValue("ENABLE SHIPMENT");
		row.createCell(4).setCellValue("SHIPMENTTYPE GREADE");
		row.createCell(5).setCellValue("DESCRIPTION");

	}

	// it will print row number ---1 on words (Body--Cells)
	private void setBody(Sheet sheet, List<ShipmentType> list) {
		int count = 1;
		for (ShipmentType shipmentType : list) {
			Row row = sheet.createRow(count++);
			row.createCell(0).setCellValue(shipmentType.getShipmentTypeId());
			row.createCell(1).setCellValue(shipmentType.getShipmentTypeMode());
			row.createCell(2).setCellValue(shipmentType.getShipmentTypeCode());
			row.createCell(3).setCellValue(shipmentType.getShipmentTypeEnable());
			row.createCell(4).setCellValue(shipmentType.getShipmentTypeGrade());
			row.createCell(5).setCellValue(shipmentType.getShipmentTypeDescription());
		}

	}

}
