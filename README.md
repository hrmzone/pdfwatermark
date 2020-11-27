# 欢迎使用pdfwatermark工具

**pdfwatermark是一个pdf水印工具**
>我喜欢开箱即用的工具，pdfwatermark就是一个下载即可使用的工具，可为一个pdf文件添加水印，也可批量为pdf文件添加水印。

## 功能
* 为指定pdf文件添加文字水印
* 为指定目录下的pdf文件批量添加水印
* 可自定义水印的文字大小、颜色、位置、透明度、倾斜角度等

## 缺点
* 只能添加文字水印，无法添加图片水印。--有时间再折腾吧^_^

## 用法
* 单文件添加水印：`java -jar pdfwatermark.jar -f 文件名 水印文字`
* 批量添加水印：`java -jar pdfwatermark.jar -d 目录名 水印文字`

## 自定义水印文字样式
1. 下载conf.ini文件，放到pdfwatermark相同目录下。
2. 按照ini文件的说明，可调整文字大小、颜色等。
1. conf.ini是可选文件，如默认水印样式可以满足需求，可不用下载和配置。
