<%@ page import="com.wsdaoy.bean.MyCloudMusicBean" %>
<%@ page import="com.wsdaoy.test.HelloServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%-- Created by IntelliJ IDEA. --%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
  </head>
  <body>
  <div>123456</div>
  <%
    HelloServlet helloServlet = new HelloServlet();

    MyCloudMusicBean myCM = new MyCloudMusicBean();
    myCM.setsName("天外飞物");
    myCM.loopSearch(false);

  %>
  <div>456</div>
  </body>
</html>