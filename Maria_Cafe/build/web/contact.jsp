<%-- 
    Document   : contact
    Created on : Apr 4, 2020, 6:44:50 PM
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
                    <div class="find">
                        <div class="find-title">
                            Find Maria's Cafe
                        </div>
                        <div class="contact-and-schedule">
                            <div class="find-contact">
                                <div class="find-contact-header">
                                    Address and contact:
                                </div>
                                <p class="detail">${contactMap.get("Address")}</p>
                                <p>Tel:<a class="tel">${contactMap.get("Tel")}</a></p>
                                <p>Email:<a class="email">${contactMap.get("Email")}</a></p>
                            </div>
                            <div class="find-schedule">
                                <div class="schedule-header">
                                    Opening hours:
                                </div>
                                <p>Monday: ${contactMap.get("Monday")}</p>
                                <p>Tuesday-Friday: ${contactMap.get("Tuesday - Friday")}</p>
                                <p>Saturday and Sunday: ${contactMap.get("Saturday and Sunday")}</p>
                            </div>
                        </div>
                        <div class="map">
                            <img src="images/9.jpg" alt="">
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
