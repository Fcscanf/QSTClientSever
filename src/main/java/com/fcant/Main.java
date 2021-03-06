package com.fcant;

import com.fcant.client.Thick;
import com.fcant.sever.SocketSever;

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
        SocketSever socketSever = new SocketSever();
        Thick thick = new Thick();
        socketSever.receiveDataBySocket();
        thick.sendDataBySocket(thick.getThickData());
    }
}
