package cn.itcase.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo4")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get");
        //1、获取参数值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + password);


        //map集合
        Map<String, String[]> parameterMap = request.getParameterMap();

        Set<String> strings = parameterMap.keySet();
        for (String name : strings) {
            String[] strings1 = parameterMap.get(name);
            for (String s : strings1) {
                System.out.println(s);
            }


            System.out.println("-----------------------");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username );
    }
}
