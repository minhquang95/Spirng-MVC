<%--
  Created by IntelliJ IDEA.
  User: Ki Thuat 88
  Date: 8/30/2017
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%@ page language="java" contentType="text/html; charset=UTF-8"
                    pageEncoding="UTF-8"%>
        <%@include file="/common/taglib.jsp"%>

        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

        <div id="navbar" class="navbar navbar-default          ace-save-state">
            <div class="navbar-container ace-save-state" id="navbar-container">
                <div class="navbar-header pull-left">
                    <a href="#" class="navbar-brand">
                        <small>
                            <i class="fa fa-leaf"></i>
                            Trang quản trị
                        </small>
                    </a>
                </div>
                <div class="navbar-buttons navbar-header pull-right collapse navbar-collapse" role="navigation">
                    <ul class="nav ace-nav">
                        <li class="light-blue dropdown-modal">
                            <a data-toggle="dropdown" href="#" class="dropdown-toggle">

                            </a>
                        <li class="light-blue dropdown-modal">
                            <a href="LogoutController">
                                <i class="ace-icon fa fa-power-off"></i>
                                <fmt:message key="label.logout" bundle="${lang}"/>
                            </a>
                        </li>
                        </li>
                    </ul>
                </div>
            </div>
        </div></title>
</head>
<body>

</body>
</html>
