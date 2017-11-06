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
//�ٴ�
public class Demo2 {

	@Test
	public void getPdfDemo() throws IOException{
		PdfWriter writer = new PdfWriter("D:\\A����׶�\\photoDemo\\���˼���.pdf");
		PdfDocument pdfdoc = new PdfDocument(writer);
		Document doc = new Document(pdfdoc,PageSize.A4.rotate());
		//����ҳ�߾�
	    doc.setMargins(0, 20, 20, 20);
				
		//�趨֧�����ĵ����壬һ��Ҫ�������������
		PdfFont font = PdfFontFactory.createFont("STSong-Light", "UniGB-UCS2-H",false);
		doc.add(new Paragraph("��        ��").setFontSize(15).setTextAlignment(TextAlignment.CENTER).setFont(font));
		Table table = new Table(new float[]{200,230,140,230,200});
		Cell c1 = new Cell(1,5);
		c1.add(new Paragraph("�������").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c1);
		Cell c7 = new Cell();
		c7.add(new Paragraph("����").setFont(font));
		table.addCell(c7);
		Cell c8 = new Cell();
		c8.add(new Paragraph().setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c8);
		Cell c9 = new Cell();
		c9.add(new Paragraph("�Ա�").setFont(font));
		table.addCell(c9);
		Cell c10 = new Cell();
		c10.add(new Paragraph().setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table.addCell(c10);
		//ͼƬ
		Cell c11 = new Cell(7,1).setTextAlignment(TextAlignment.CENTER);
		Image img = new Image(ImageDataFactory.create("D:\\A����׶�\\666.jpg"));
		/*img.scaleAbsolute(134, 185);
		img.setAutoScaleHeight(true);
		img.setAutoScaleWidth(true);*/
		c11.add(img);
		table.addCell(c11);
		String[]cells1={"��  ��","","��������","","������ò","","����״��","","��  ��","","ѧ  ��","","��������","","��ϵ�绰",""};
		for(int i=1;i<=cells1.length;i++){
		     table.addCell(new Cell().add(new Paragraph(cells1[i-1])).setFont(font));
		}
		Cell c2 = new Cell();
		c2.add(new Paragraph("רҵ")).setFont(font);
		table.addCell(c2);
		Cell c3 = new Cell(1,3);
		c3.add(new Paragraph("")).setFont(font);
		table.addCell(c3);
		Cell c4 = new Cell();
		c4.add(new Paragraph("��ҵԺУ")).setFont(font);
		table.addCell(c4);
		Cell c5 = new Cell(1,3);
		c5.add(new Paragraph("")).setFont(font);
		table.addCell(c5);
		Cell c6 = new Cell();
		c6.add(new Paragraph("��ְ����")).setFont(font);
		table.addCell(c6);
		Cell c12 = new Cell(1,4);
		c12.add(new Paragraph("")).setFont(font);
		table.addCell(c12);
		
		//�����±�
		Table table2 = new Table(new float[]{250,250,250,250});
		Cell c13 = new Cell(1,4);
		c13.add(new Paragraph("�������").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c13);
		String[]cells2={"ʱ��","��ѵ����","רҵ","ѧ��"};
		for(int i=1;i<=cells2.length;i++){
			 table2.addCell(new Cell().add(new Paragraph(cells2[i-1])).setFont(font));
		}
		for(int i=0;i<8;i++) {
			Cell cell=new Cell().setTextAlignment(TextAlignment.LEFT).setHeight(20F);
			table2.addCell(cell);
		}
		Cell c14 = new Cell(1,4);
		c14.add(new Paragraph("�����س�").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c14);
		Cell c15 = new Cell(2,4).setTextAlignment(TextAlignment.LEFT).setHeight(40F);
		
		table2.addCell(c15);
		Cell c16 = new Cell(1,4);
		c16.add(new Paragraph("��������").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c16);
		String[]cells3={"ʱ��","��˾����","ְλ","��������"};
		for(int i=1;i<=cells3.length;i++){
			 table2.addCell(new Cell().add(new Paragraph(cells3[i-1])).setFont(font));
		}
		for(int i=0;i<4;i++) {
			Cell cell=new Cell().setTextAlignment(TextAlignment.LEFT).setHeight(20F);
			table2.addCell(cell);
		}
		Cell c17 = new Cell(1,4);
		c17.add(new Paragraph("Ӣ�ġ������ˮƽ").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c17);
		Cell c18 = new Cell(2,4);
		c18.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c18);
		Cell c19 = new Cell(1,4);
		c19.add(new Paragraph("��������").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c19);
		Cell c20 = new Cell(2,4);
		c20.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c20);
		Cell c21 = new Cell(1,4);
		c21.add(new Paragraph("��������").setFont(font).setBackgroundColor(Color.LIGHT_GRAY));
		table2.addCell(c21);
		Cell c22 = new Cell(2,4);
		c22.add(new Paragraph("")).setFont(font).setHeight(40F);
		table2.addCell(c22);
		doc.add(table);
		doc.add(table2);
		doc.close();
	}
	
	
}
