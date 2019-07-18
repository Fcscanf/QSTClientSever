package com.fcant.util;
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

    public static double createRandomDouble() {
        Random random = new Random();
        double randomData = random.nextDouble();
        double formatRandomData = Double.parseDouble(String.format("%.3f", randomData * 100));
        return formatRandomData;
    }
}
