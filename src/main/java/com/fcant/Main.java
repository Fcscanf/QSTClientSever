package com.fcant;

import com.fcant.client.Thick;

/**
 * Main
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:16 2019-07-18/0018
 */
public class Main {

    public static void main(String[] args) {
        Thick thick = new Thick();
        double[] thickData = thick.getThickData();
        for (int i = 0; i < thickData.length; i++) {
            System.out.println(thickData[i]);
        }
    }
}
