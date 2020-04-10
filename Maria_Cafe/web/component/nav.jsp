<%-- 
    Document   : nav
    Created on : Apr 4, 2020, 6:21:13 PM
    Author     : ThinkPro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="nav-bar">
    <nav>
        <ul class="nav">
            <li class="nav-item">
                <a href="home" class="nav-link <c:if test="${page eq 1}">active</c:if>">Home</a>
            </li>
            <li class="nav-item">
                <a href="about" class="nav-link <c:if test="${page eq 2}">active</c:if>">About my Cakes</a>
            </li>
            <li class="nav-item">
                <a href="contact" class="nav-link <c:if test="${page eq 3}">active</c:if>">Find Maria's Cafe</a>
            </li>
        </ul>
    </nav>
</div>
