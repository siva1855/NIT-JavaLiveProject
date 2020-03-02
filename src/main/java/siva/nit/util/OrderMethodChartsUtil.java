package siva.nit.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
@Component
public class OrderMethodChartsUtil {
	  //1.JFree PieCharts
		public void generatePieChart(String path, List<Object[]> data) {
			// 1.create dataset
			DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
			for (Object[] arrayPieChartObject : data) {
				// key-shipmentType,value-count
				defaultPieDataset.setValue(arrayPieChartObject[0].toString(), Double.valueOf(arrayPieChartObject[1].toString()));
			}
			// 2.create JFreeChart using chartFactory
			JFreeChart jFreeChart = ChartFactory.createPieChart3D("OrderMethod Types", defaultPieDataset, true, true,
					false);
			//3.save as Image Using ChartUtils
			try {
				ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderMethodPieChart.jpg"), jFreeChart, 400, 400);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		//2.JFree BarCharts
		public void generateBarChart(String path, List<Object[]> data) {
			// 1.create dataset
			DefaultCategoryDataset defaultCategoryDataset=new DefaultCategoryDataset();
			for(Object[]  arrayBarChartObject:data) {
				defaultCategoryDataset.setValue(Double.valueOf(arrayBarChartObject[1].toString()),
						arrayBarChartObject[0].toString(), "");	
			}
			//2.create JFreeChart Using ChartFactory
			JFreeChart jFreeChart=ChartFactory.createBarChart("OrderMethod Types", "Types", "Count",defaultCategoryDataset);
			
			//3.save as Image Using ChartUtil
			try {
				ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderMethodBarChart.jpg"), jFreeChart, 400, 400);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

}
