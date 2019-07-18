package com.fcant.client;

import com.fcant.util.FcantUtils;

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
     * 采集厚度数据-即生成随机的12组随机数
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 11:36 2019-07-18/0018
     */
    public double[] getThickData() {
        double currentData[] = new double[12];
        for (int i = 0; i < currentData.length; i++) {
            currentData[i] = FcantUtils.createRandomDouble();
        }
        return currentData;
    }
}
