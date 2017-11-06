package com.caozhen;

import java.io.IOException;

import org.junit.Test;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
//再次
public class Demo2 {

	@Test
	public void getPdfDemo() throws IOException{
		PdfWriter writer = new PdfWriter("D:\\A第五阶段\\photoDemo\\个人简历.pdf");
		PdfDocument pdfdoc = new PdfDocument(writer);
		Document doc = new Document(pdfdoc,PageSize.A4.rotate());
		//设置页边距
	    doc.setMargins(0, 20, 20, 20);
				
		//设定支持中文的字体，一定要导入亚洲字体包
		PdfFont font = PdfFontFactory.createFont("STSong-Light", "UniGB-UCS2-H",false);
		doc.add(new Paragraph("简        历").setFontSize(15).setTextAlignment(TextAlignment.CENTER).setFont(font));
		Table table = new Table(new float[]{200,230,140,230,200});
		Cell c1 = new Cell(1,5);
		c1.add(new Paragraph("基本情况").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c1);
		Cell c7 = new Cell();
		c7.add(new Paragraph("姓名").setFont(font));
		table.addCell(c7);
		Cell c8 = new Cell();
		c8.add(new Paragraph().setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c8);
		Cell c9 = new Cell();
		c9.add(new Paragraph("性别").setFont(font));
		table.addCell(c9);
		Cell c10 = new Cell();
		c10.add(new Paragraph().setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c10);
		//图片
		Cell c11 = new Cell(7,1).setTextAlignment(TextAlignment.CENTER);
		Image img = new Image(ImageDataFactory.create("D:\\A第五阶段\\666.jpg"));
		/*img.scaleAbsolute(134, 185);
		img.setAutoScaleHeight(true);
		img.setAutoScaleWidth(true);*/
		c11.add(img);
		table.addCell(c11);
		String[]cells1={"民  族","","出生年月","","政治面貌","","健康状况","","籍  贯","","学  历","","电子信箱","","联系电话",""};
		for(int i=1;i<=cells1.length;i++){
		     table.addCell(new Cell().add(new Paragraph(cells1[i-1])).setFont(font));
		}
		Cell c2 = new Cell();
		c2.add(new Paragraph("专业")).setFont(font);
		table.addCell(c2);
		Cell c3 = new Cell(1,3);
		c3.add(new Paragraph("")).setFont(font);
		table.addCell(c3);
		Cell c4 = new Cell();
		c4.add(new Paragraph("毕业院校")).setFont(font);
		table.addCell(c4);
		Cell c5 = new Cell(1,3);
		c5.add(new Paragraph("")).setFont(font);
		table.addCell(c5);
		Cell c6 = new Cell();
		c6.add(new Paragraph("求职意向")).setFont(font);
		table.addCell(c6);
		Cell c12 = new Cell(1,4);
		c12.add(new Paragraph("")).setFont(font);
		table.addCell(c12);
		
		//创建新表
		Table table2 = new Table(new float[]{250,250,250,250});
		Cell c13 = new Cell(1,4);
		c13.add(new Paragraph("教育情况").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c13);
		String[]cells2={"时间","培训机构","专业","学历"};
		for(int i=1;i<=cells2.length;i++){
			 table2.addCell(new Cell().add(new Paragraph(cells2[i-1])).setFont(font));
		}
		for(int i=0;i<8;i++) {
			Cell cell=new Cell().setTextAlignment(TextAlignment.LEFT).setHeight(20F);
			table2.addCell(cell);
		}
		Cell c14 = new Cell(1,4);
		c14.add(new Paragraph("技能特长").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c14);
		Cell c15 = new Cell(2,4).setTextAlignment(TextAlignment.LEFT).setHeight(40F);
		
		table2.addCell(c15);
		Cell c16 = new Cell(1,4);
		c16.add(new Paragraph("工作经验").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c16);
		String[]cells3={"时间","公司名称","职位","工作内容"};
		for(int i=1;i<=cells3.length;i++){
			 table2.addCell(new Cell().add(new Paragraph(cells3[i-1])).setFont(font));
		}
		for(int i=0;i<4;i++) {
			Cell cell=new Cell().setTextAlignment(TextAlignment.LEFT).setHeight(20F);
			table2.addCell(cell);
		}
		Cell c17 = new Cell(1,4);
		c17.add(new Paragraph("英文、计算机水平").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c17);
		Cell c18 = new Cell(2,4);
		c18.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c18);
		Cell c19 = new Cell(1,4);
		c19.add(new Paragraph("奖励荣誉").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c19);
		Cell c20 = new Cell(2,4);
		c20.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c20);
		Cell c21 = new Cell(1,4);
		c21.add(new Paragraph("自我评价").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c21);
		Cell c22 = new Cell(2,4);
		c22.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c22);
		doc.add(table);
		doc.add(table2);
		doc.close();
	}
	
	
}
