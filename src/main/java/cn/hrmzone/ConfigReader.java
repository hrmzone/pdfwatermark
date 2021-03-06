package cn.hrmzone;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigReader {
    Configurations configs = new Configurations();
    Configuration config;
    //字体位置
    int leftPostition,widthPosition,bottomPosition;
    //字体颜色
    int cR,cG,cB;
    //字体角度、透明度
    float angle,opacity;
    //字体大小
    int size;


    public ConfigReader() {
        try {
            config=configs.properties("conf.ini");
            leftPostition=config.getInt("leftPostition");
            widthPosition=config.getInt("widthPosition");
            bottomPosition=config.getInt("bottomPosition");
            angle=config.getFloat("angle");
            opacity=config.getFloat("opacity");
            size=config.getInt("size");
            cR=config.getInt("cR");
            cG=config.getInt("cG");
            cB=config.getInt("cB");
        } catch (ConfigurationException e) {
            System.out.println("使用默认水印样式配置");
            leftPostition=3;
            widthPosition=3;
            bottomPosition=5;
            angle=120f;
            opacity=0.4f;
            size=15;
            cR=190;
            cG=190;
            cB=250;
//            e.printStackTrace();
        }
//        System.out.println(leftPostition+"-"+widthPosition+"-"+bottomPosition+"-"+angle);
    }


    public static void main(String[] args) {
        ConfigReader reader=new ConfigReader();
    }
}
