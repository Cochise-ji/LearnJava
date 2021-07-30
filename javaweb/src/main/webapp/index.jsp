
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2021/7/28
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>

<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <script src="/javaweb/resources/jquery.min.js"></script>
</head>
<body>
<a href="/javaweb/servlet1?action=forward" >请求转发</a>
<br>
<a href="/javaweb/servlet1?action=redirect">请求重定向</a>
<br>

<button id="ajaxRequest1">发送Ajax(javascript)</button>
<br>
<button id="ajaxRequest2">发送Ajax(jQuery)</button>


</body>

<script type="text/javascript">
    $(document).ready(function(){
        $("#ajaxRequest1").click(function(){
            // 创建XMLHttpRequest对象
            let xmlHttpRequest = new XMLHttpRequest();

            // 设置请求方式和请求路径
            xmlHttpRequest.open("GET", "http://localhost:8080/javaweb/servlet1?action=jsAjaxRequest", true);

            // 实现响应方法
            xmlHttpRequest.onreadystatechange = function (){
                if(xmlHttpRequest.status == 200 && xmlHttpRequest.readyState == 4 ){
                    alert(xmlHttpRequest.responseText);
                }
            }

            // 发送异步请求
            xmlHttpRequest.send();
        });
    });

</script>

</html>
