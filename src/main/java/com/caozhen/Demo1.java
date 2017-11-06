package com.caozhen;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
//�ٴ��ύ
public class Demo1 {

	@Test
	public void getExcel() throws FileNotFoundException, IOException{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("���ʱ�");
		//ָ���ϲ���ʼ�С������У���ʼ�У�������
		CellRangeAddress range = new CellRangeAddress(0, 0, 0, 11);
		//���Ҫ�ϲ��ĵ�ַ����Ԫ��
		sheet.addMergedRegion(range);
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("��Oһ�������¹��ʱ�");
		
		CellRangeAddress range1 = new CellRangeAddress(1, 2, 0, 0);
		sheet.addMergedRegion(range1);
		XSSFRow row1 = sheet.createRow(1);
		XSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue("����");
		
		CellRangeAddress range2 = new CellRangeAddress(1, 2, 1, 1);
		sheet.addMergedRegion(range2);
		
		XSSFCell cell2 = row1.createCell(1);
		cell2.setCellValue("����");
		
		CellRangeAddress range3 = new CellRangeAddress(1, 1, 2, 3);
		sheet.addMergedRegion(range3);		
		XSSFCell cell3 = row1.createCell(2);
		cell3.setCellValue("�̶�����");
		
		CellRangeAddress range4 = new CellRangeAddress(1, 1, 4, 6);
		sheet.addMergedRegion(range4);
		XSSFCell cell4 = row1.createCell(4);
		cell4.setCellValue("��������");
		
		CellRangeAddress range5 = new CellRangeAddress(1, 2, 7, 7);
		sheet.addMergedRegion(range5);
		XSSFCell cell5 = row1.createCell(7);
		cell5.setCellValue("���/�ۿ�");
		
		CellRangeAddress range6 = new CellRangeAddress(1, 2, 8, 8);
		sheet.addMergedRegion(range6);
		XSSFCell cell6 = row1.createCell(8);
		cell6.setCellValue("Ӧ�������ܶ�");
		
		CellRangeAddress range7 = new CellRangeAddress(1, 1, 9, 10);
		sheet.addMergedRegion(range7);
		XSSFCell cell7 = row1.createCell(9);
		cell7.setCellValue("���ۿ���");
		
		CellRangeAddress range8 = new CellRangeAddress(1, 2, 11, 11);
		sheet.addMergedRegion(range8);
		XSSFCell cell8 = row1.createCell(11);
		cell8.setCellValue("ʵ������");
		
		XSSFRow row2 = sheet.createRow(2);
		XSSFCell cell9 = row2.createCell(2);
		cell9.setCellValue("��������");
		XSSFCell cell10 = row2.createCell(3);
		cell10.setCellValue("��λ����");
		XSSFCell cell11 = row2.createCell(4);
		cell11.setCellValue("��ͨ����");
		XSSFCell cell12 = row2.createCell(5);
		cell12.setCellValue("ʳ�޲���");
		XSSFCell cell13 = row2.createCell(6);
		cell13.setCellValue("�Ӱ๤��");
		
		XSSFCell cell14 = row2.createCell(9);
		cell14.setCellValue("��ҽ��");
		XSSFCell cell15 = row2.createCell(10);
		cell15.setCellValue("������");
		
		String[]rows3 = {"����","����","1000.00","1400.00","100.00","","10.00","","2510.00","128.28","144.00","2237.72"};
		XSSFRow row3 = sheet.createRow(3);
		for(int i=0;i<rows3.length;i++){
			row3.createCell(i).setCellValue(rows3[i]);	
		}
		CellRangeAddress range9 = new CellRangeAddress(9, 9, 0, 5);
		sheet.addMergedRegion(range9);
		XSSFRow row9 = sheet.createRow(9);
		XSSFCell cell16 = row9.createCell(0);
		cell16.setCellValue("��ע������ȷ�Ϲ�������               ǩ����     ");

		XSSFCellStyle style = workbook.createCellStyle();
		//����
		style.setAlignment(HorizontalAlignment.CENTER);
		
		//Ϊָ����Ԫ���趨��ʽ
		cell.setCellStyle(style);
		workbook.write(new FileOutputStream("D:\\A����׶�\\photoDemo\\homework.xlsx"));
		workbook.close();
	}
}
