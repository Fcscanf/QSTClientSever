package com.fcant.client;

import java.io.IOException;

/**
 * ClientStart
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:51 2019-07-18/0018
 */
public class ClientStart {

    public static void main(String[] args) throws IOException {
        Thick thick = new Thick();
        thick.sendDataBySocket(thick.getThickData());
    }
}
