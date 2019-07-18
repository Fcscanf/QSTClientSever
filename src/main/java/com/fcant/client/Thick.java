package com.fcant.client;
import com.fcant.util.FcantUtils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Thick
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description 测厚仪
 * @date 上午 11:06 2019-07-18/0018
 */
public class Thick {

    /**
     * 采集厚度数据-即随机生成的12组随机数
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 11:36 2019-07-18/0018
     */
    public double[] getThickData() {
        double[] currentData = new double[12];
        for (int i = 0; i < currentData.length; i++) {
            currentData[i] = FcantUtils.createRandomDouble();
        }
        return currentData;
    }

    /**
     * 保存从测厚仪提取的数据到文本
     *
     * @author Fcscanf
     * @date 下午 13:57 2019-07-18/0018 
     */
    public void saveDataToTxt(double[] data) throws IOException {
        String filePath = FcantUtils.checkFileExist("data.txt");
        FileWriter fileWriter = new FileWriter(filePath, true);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            fileWriter.write(String.valueOf(data[i]));
            fileWriter.write(" ");
        }
        fileWriter.write("\n");
        fileWriter.close();
    }

}
