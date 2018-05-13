package com.xiaoyou.servlet;

import com.sun.jimi.core.Jimi;
import com.sun.jimi.core.JimiException;
import com.sun.jimi.core.JimiWriter;
import com.sun.jimi.core.options.JPGOptions;
import com.xiaoyou.Util.RandomString;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.ImageProducer;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* ͼƬ�ϴ��ӿ�
* */
@WebServlet(name = "Picture")
public class Picture extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        //�þ�ȷ�������ʱ���һ����λ������ַ�������ͼƬ����
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String formatStr = formatter.format(new Date())+RandomString.randomString(6);
        //ͼƬ�洢·��
        String path = "C:/Users/Administrator/Desktop/apache-tomcat-9.0.7/apache-tomcat-9.0.7/webapps/image/" + formatStr+".JPEG";
        //�洢ͼƬ������·��
        String imagePath="http://47.106.64.12:8080/image/"+ formatStr+".JPEG";
        //����request���󷵻ؿͻ�������������

        try (ServletInputStream sis = request.getInputStream()) {
            //��ͼƬ��ŵ�ָ����·��
            OutputStream os = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] buf = new byte[1024];
            int length = 0;
            //ʹ��sis�Ķ�ȡ���ݵķ���
            length = sis.readLine(buf, 0, buf.length);
            while (length != -1) {
                bos.write(buf, 0, length);
                length = sis.read(buf);
            }
            sis.close();
            bos.close();
            os.close();
            //�ظ����ͻ���ͼƬ��ַ
            out.write("{\"picture\":\"0\",\"message\":"+"\""+imagePath+"\"}");

           out.close();
        } catch (Exception e) {
            //�ظ����ͻ���ͼƬ�洢������Ϣ
            out.write("{\"picture\":\"1\",\"message\":\"ͼƬ�洢ʧ��\"}");
            out.close();
        }
    }
}
