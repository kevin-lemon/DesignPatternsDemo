package com.pioneer.polaris.polaris.demo.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by wxk on 2018/5/16.
 * socket 客户端
 */

public class SocketDemo {

    public void socket(){
        try {
            //连接服务器 并设置连接超时为5秒
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("1.1.9.30", 30000), 5000);
            //获取输入输出流
            OutputStream ou = socket.getOutputStream();
            BufferedReader bff = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            //读取发来服务器信息
            String line = null;
            String buffer="";
            while ((line = bff.readLine()) != null) {
                buffer = line + buffer;
            }

            //向服务器发送信息
            ou.write("android 客户端".getBytes("gbk"));
            ou.flush();
            //关闭各种输入输出流
            bff.close();
            ou.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
