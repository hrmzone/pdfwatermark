package cn.hrmzone;

import java.io.File;
import java.util.ArrayList;
/**
 * @Author:张生
 * @Blog:http://hrmnzone.cn
 * @Organization:荆州青年教育平台(https://jzyouth.com),专注职业资格培训、学历提升
 * @Description:遍历目录下的全部文件，返回pdf文件列表
 */
public class FileUtil {
    private String dir;
    private ArrayList<String> fileList;
    public FileUtil(String s) {
        this.dir=s;
        fileList=new ArrayList<String>();
    }

    private boolean isPDF(File file) {
        String fileName=file.getName();
        boolean flag=false;
        if(fileName.endsWith(".pdf") || fileName.endsWith(".PDF")) {
            flag=true;
        }
        return flag;
    }

    public ArrayList<String> getFileList() {
        File file=new File(dir);
        File[] files=file.listFiles();
        for(int i=0;i<files.length;i++) {
            File f=files[i];
            if(f.isFile() && isPDF(f)) {
                fileList.add(dir+File.separator+f.getName());
            }
        }
        return fileList;
    }

    public static void main(String[] args) {
//        FileUtil fileUtil=new FileUtil("/home/neal/doc/单招试题/打印");
//        System.out.println(fileUtil.getFileList());
    }
}
