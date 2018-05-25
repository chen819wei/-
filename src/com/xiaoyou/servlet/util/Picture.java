package com.xiaoyou.servlet.util;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

/*
* 图片上传接口
* */
@WebServlet(urlPatterns = {"/Picture"},name = "Picture")
public class Picture extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        //采用UUID来作为图片的唯一标识
        UUID formatStr = UUID.randomUUID();
        //图片存储路径
        String path = "C:/Users/Administrator/Downloads/apache-tomcat-9.0.8-windows-x86/apache-tomcat-9.0.8/webapps/image/" + formatStr+".JPEG";
        //存储图片的完整路径
        String imagePath="http://47.106.64.12:8080/image/"+ formatStr+".JPEG";

        //利用request对象返回客户端来的输入流
        try (ServletInputStream sis = request.getInputStream()) {
            //将图片存放到指定的路径
            OutputStream os = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] buf = new byte[1024];
            int length = 0;
            //使用sis的读取数据的方法
            length = sis.readLine(buf, 0, buf.length);
            while (length != -1) {
                bos.write(buf, 0, length);
                length = sis.read(buf);
            }
            sis.close();
            bos.close();
            os.close();
            //回复给客户端图片地址
            out.write("{\"picture\":0,\"message\":"+"\""+imagePath+"\"}");

           out.close();
        } catch (Exception e) {
            //回复给客户端图片存储错误信息
            out.write("{\"picture\":1,\"message\":\"图片存储失败\"}");
            out.close();
        }
    }
}
