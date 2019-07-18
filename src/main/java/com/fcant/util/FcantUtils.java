package com.fcant.util;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * FcantUtils
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:07 2019-07-18/0018
 */
public class FcantUtils {

    /**
     * 生成Double类型的数据并初始化
     *
     * @return double
     * @author Fcscanf
     * @date 上午 11:51 2019-07-18/0018
     */
    public static double createRandomDouble() {
        Random random = new Random();
        double randomData = random.nextDouble();
        double formatRandomData = Double.parseDouble(String.format("%.3f", randomData * 100));
        return formatRandomData;
    }

    /**
     * 检查文件是否存在，不存在则在当前目录下创建新文件
     *
     * @param fileName
     * @return filePath
     * @author Fcscanf
     * @date 下午 14:54 2019-07-18/0018
     */
    public static String checkFileExist(String fileName) throws IOException {
        File directory = new File(".");
        String newFilePath = null;
        try {
            // 获取当前路径
            newFilePath = directory.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        newFilePath += "\\" + fileName;
        System.out.println(newFilePath);
        //如果文件夹不存在则创建
        File file = new File(newFilePath);
        if  (!file.exists() && !file.isDirectory())
        {
            System.out.println("//文件不存在");
            file.createNewFile();
            System.out.println("//文件已创建");
        } else {
            System.out.println("//文件存在");
        }
        return newFilePath;
    }
}
