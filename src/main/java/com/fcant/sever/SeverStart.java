package com.fcant.sever;

/**
 * SeverStart
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:51 2019-07-18/0018
 */
public class SeverStart {
    public static void main(String[] args) {
        SocketSever socketSever = new SocketSever();
        socketSever.receiveDataBySocket();
    }
}
