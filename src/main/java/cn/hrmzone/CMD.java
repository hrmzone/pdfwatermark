package cn.hrmzone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author:张生
 * @Blog:http://hrmnzone.cn
 * @Organization:荆州青年教育平台(https://jzyouth.com),专注职业资格培训、学历提升
 * @Description:
 */
public class CMD {
    private ArrayList<String> fileList;
    private PDFUtil pdfUtil=new PDFUtil();
    private FileUtil fileUtil;
    void doFile(String is,String text) throws IOException {
        String os=rename(is.trim());
        pdfUtil.addMark(is,os,text);
    }

    void doDir(String dir,String text) throws IOException {
        fileUtil=new FileUtil(dir.trim());
        fileList=fileUtil.getFileList();
        for(String s:fileList) {
            pdfUtil.addMark(s,rename(s),text);
        }
    }

    String rename(String s) {
        s=s.trim();
        String fileName=s.substring(s.lastIndexOf(File.separator)+1);
        String dir=s.substring(0,s.lastIndexOf(File.separator));
        return dir+ File.separator+"pdf_"+fileName;
    }

    public static void main(String[] args) throws IOException {
        CMD cmd=new CMD();
//        System.out.println(cmd.rename("/home/neal/doc/单招试题/打印/2017年单招考试一类文化水平考试试题.pdf"));
//        cmd.doFile("/home/neal/doc/单招试题/打印/2017年单招考试一类文化水平考试试题.pdf","fuck");
//        cmd.doDir("/home/neal/doc/单招试题/打印","石家庄理工职业学院\n招生电话：13933885316\nQQ：30710311");
    }

}
