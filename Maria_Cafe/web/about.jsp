<%-- 
    Document   : about
    Created on : Apr 4, 2020, 6:35:05 PM
    Author     : ThinkPro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
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
                    <div class="about">
                        <div class="about-title">
                            ${about.title}
                        </div>
                        <div class="about-content">
                            <p>
                                <img src="images/${about.image}" class="image-right" alt="">
                                ${about.content}
                            </p>
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
    </body>
</html>
