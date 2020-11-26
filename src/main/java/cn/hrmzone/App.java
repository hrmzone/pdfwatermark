package cn.hrmzone;

import com.itextpdf.kernel.font.PdfFontFactory;

import java.io.IOException;

/**
 * 生成jar包，META-INF目录必须在根目录下面，不能在src目录下，否则无法生成有效的jar可执行文件
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        CMD cmd=new CMD();
        if(args[0].equalsIgnoreCase("-f")) {
            cmd.doFile(args[1],args[2]);
        } else if(args[0].equalsIgnoreCase("-d")) {
            cmd.doDir(args[1],args[2]);
        } else {
            System.out.println("使用说明：");
            System.out.println("java -jar pdfwatermark -f filename"+"为指定文件添加水印");
            System.out.println("java -jar pdfwatermark -d filepath"+"为指定目录批量添加水印");
        }

    }
}
