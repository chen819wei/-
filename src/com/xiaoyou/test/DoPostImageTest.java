package com.xiaoyou.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DoPostImageTest {
    public static void main(String[] args) throws Exception {
        //����ط������Լ���ʵ����������ģ��������Լ���IP��ַ���Լ�����tomcat�еĹ��̲���
        //����ĵ�ַҪ��web.xml���е�����ƥ��
        String url = "http://47.106.64.12:8080/xy/Picture";
        String result = doPost(url);
        System.out.println(result);
    }

    public static String doPost(String urlString)
            throws Exception {
        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        //try�����õ������������˾��Ƿ�������
        try (BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream())) {
            //��java��������Windows�����еģ�ͼƬ·�������������
            InputStream is = new FileInputStream("d:/gd.JPG");
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buf = new byte[1024];
            int length = 0;
            length = bis.read(buf);
            while (length != -1) {
                bos.write(buf, 0, length);
                length = bis.read(buf);
            }
            bis.close();
            is.close();
        }
        //�����Ƿ�����������з������ݵĻ����������õ�
        StringBuilder response = new StringBuilder();
        try (Scanner in = new Scanner(connection.getInputStream())) {
            while (in.hasNextLine()) {
                response.append(in.nextLine());
                response.append("\n");
            }
        } catch (Exception e) {
            if (!(connection instanceof HttpURLConnection))
                throw e;
            InputStream err = ((HttpURLConnection) connection).getErrorStream();
            if (err == null)
                throw e;
            Scanner in = new Scanner(err);
            response.append(in.nextLine());
            response.append("\n");
            in.close();
        }

        return response.toString();
    }
}
