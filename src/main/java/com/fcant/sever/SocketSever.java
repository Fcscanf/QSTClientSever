package com.fcant.sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * SocketSever
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:17 2019-07-18/0018
 */
public class SocketSever {

    /**
     * 通过Socket接收数据
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 16:25 2019-07-18/0018
     */
    public void receiveDataBySocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("Fcant--Socket--Start");
            System.out.println("Host Address : " + serverSocket.getInetAddress() + "," + "Socket Port : " + serverSocket.getLocalPort());
            //侦听并接受到此套接字的连接,返回一个Socket对象
            Socket socket = serverSocket.accept();
            //得到一个输入流，接收客户端传递的信息
            InputStream inputStream = socket.getInputStream();
            //提高效率，将自己字节流转为字符流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            //加入缓冲区
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println("已接收到客户端连接");
                System.out.println("服务端接收到客户端信息：" + temp + ",当前客户端ip为：" + socket.getInetAddress().getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
