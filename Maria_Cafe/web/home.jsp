<%-- 
    Document   : home
    Created on : Apr 4, 2020, 6:17:08 PM
    Author     : ThinkPro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
        <script src="js/submitForm.js" type="text/javascript"></script>
    </head>
    <body>

        <div class="container">
            <!-- header -->
            <%@include file="../component/header.jsp" %>

            <!-- navigation -->
            <%@include file="../component/nav.jsp" %>
            <!-- main-content -->
            <div class="main">
                <div class="main-left">
                    <div class="article">
                        <div class="image">
                            <img src="images/${introduction.image}" alt="">
                        </div>
                        <div class="article-description">
                            <p class="article-tilte">${introduction.title}</p>
                            <p>${introduction.content}</p>

                        </div>
                    </div>
                    <div class="top-3-listed">
                        <c:forEach items="${listProduct}" var="product">
                            <div class="product">
                                <div class="image">
                                    <a onclick="submitForm('detail', ['id'], [${product.id}])"><img src="images/${product.image}" alt=""></a>
                                </div>
                                <div class="top-3-description">
                                    <div class="top-3-header">
                                        ${product.name}
                                    </div>
                                    <div class="top-3-content">
                                        ${product.content}
                                    </div>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                    <div class="contact">
                        <div class="visit">
                            ${introduction.titleDes}
                        </div>
                        <p>${introduction.description}</p>
                        <p>${introduction.address}</p>
                        <p>Phone: ${introduction.phone}</p>
                    </div>
                    <div class="regard">
                        <p>Kind regards</p>
                        <div class="signature">
                            Maria Bagnarelli
                        </div>
                    </div>
                </div>
                <div class="main-right">
                    <div class="share-box">
                        <div class="share-header">
                            Share this page
                        </div>
                        <div class="share-content">
                            <img src="images/6.jpg" alt="">
                            Share on Facebook
                        </div>
                        <div class="share-content">
                            <img src="images/7.jpg" alt="">
                            Share on Twitter
                        </div>
                    </div>
                </div>
            </div>

            <!--footer-->
            <%@include file="../component/footer.jsp" %>


        </div>
        <form id="frm" method="POST">
        </form>     
    </body>
</html>
