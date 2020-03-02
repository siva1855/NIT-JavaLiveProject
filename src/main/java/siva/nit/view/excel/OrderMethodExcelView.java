package siva.nit.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import siva.nit.model.OrderMethod;


public class OrderMethodExcelView extends AbstractXlsxView{
	
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//download  and file name
		response.addHeader("Content-Disposition", "attachment;filename=OrderMethodExcelData.xlsx");
		
		Sheet sheet = workbook.createSheet("OrderMethodData");
		
		// construct -row -0 (Header)
		setHeader(sheet);
		
		// read model data
		@SuppressWarnings("unchecked")
		List<OrderMethod> list = (List<OrderMethod>) model.get("showOrderMethodExcelData");
		setBody(sheet, list);
	}

	// it will print only row number--0 (Header)
	private void setHeader(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("ORDERMETHOD ID");
		row.createCell(1).setCellValue("ORDERMETHOD MODE");
		row.createCell(2).setCellValue("ORDERMETHOD CODE");
		row.createCell(3).setCellValue("ORDERMETHOD TYPE");
		row.createCell(4).setCellValue("ORDERMETHOD ACCEPT");
		row.createCell(5).setCellValue("DESCRIPTION");

	}

	// it will print row number ---1 on words (Body--Cells)
	private void setBody(Sheet sheet, List<OrderMethod> list) {
		int count = 1;
		for (OrderMethod orderMethod : list) {
			Row row = sheet.createRow(count++);
			row.createCell(0).setCellValue(orderMethod.getOrderMethodId());
			row.createCell(1).setCellValue(orderMethod.getOrderMethodMode());
			row.createCell(2).setCellValue(orderMethod.getOrderMethodCode());
			row.createCell(3).setCellValue(orderMethod.getOrderMethodType());
			row.createCell(4).setCellValue(orderMethod.getOrderMethodAccept().toString());
			row.createCell(5).setCellValue(orderMethod.getOrderMethodDescription());
		}

	}

}
