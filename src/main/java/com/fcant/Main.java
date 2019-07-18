package com.fcant;

import com.fcant.client.Thick;

import java.io.IOException;

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

    public static void main(String[] args) throws IOException {
        Thick thick = new Thick();
        thick.saveDataToTxt(thick.getThickData());
    }
}
