package cn.hrmzone;

import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author:张生
 * @Blog:http://hrmnzone.cn
 * @Organization:荆州青年教育平台(https://jzyouth.com),专注职业资格培训、学历提升
 * @Description:使用itext7.0为pdf文件添加水印
 */
public class PDFUtil {
    void addMark(String is, String os, String text) throws IOException {
        int textLeft=0;
        int textWidth=0;
        int textBottom=0;
        int n=0;
        Document doc=null;
        PdfDocument pdfDoc=new PdfDocument(new PdfReader(is),new PdfWriter(os));
        doc=new Document(pdfDoc);
        n=pdfDoc.getNumberOfPages();
        for(int i=0;i<n;i++) {
            Rectangle pageSize=pdfDoc.getPage(i+1).getPageSize();
            //设置文字位置
            textLeft=(int)(pageSize.getWidth()/3);
            textWidth=(int)(pageSize.getWidth()/2);
            textBottom=(int)(pageSize.getHeight()/5);
//            System.out.println(textLeft+":"+textWidth+":"+textBottom);
//            设置字体
            PdfFont font= PdfFontFactory.createFont("STSong-Light", "UniGB-UCS2-H", true);
            Paragraph p=new Paragraph().setFont(font);
//            设置字体颜色
            DeviceRgb rgbColor = new DeviceRgb(192, 192, 250);
            p.setFontColor(DeviceRgb.makeDarker(rgbColor));
//            设置字体倾斜角度
            p.setRotationAngle(120f);
//            设置字体透明度
            p.setOpacity(0.6f);
//            设置对齐方式
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFixedPosition(i+1, textLeft, textBottom, textWidth);
            p.add(text);
            doc.add(p);

        }
        doc.close();

    }
}
