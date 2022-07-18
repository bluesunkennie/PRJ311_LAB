<%-- 
    Document   : index
    Created on : Oct 12, 2020, 3:42:55 PM
    Author     : Admin
--%>

<%@page import="Model.Image"%>
<%@page import="Model.Entry"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ImageDAO"%>
<%@page import="DAO.EntryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/bootstrap.css" />
        <link rel="stylesheet" href="./css/bootstrap-grid.css" />
        <link rel="stylesheet" href="./css/bootstrap-reboot.css" />
        <link rel="stylesheet" href="./css/style.css" />
    </head>
    <body style="text-align: justify">
        <%
            EntryDAO edao = new EntryDAO();
            ImageDAO idao = new ImageDAO();
            ArrayList<Entry> entrys = edao.getEntrys();
            ArrayList<Image> images = idao.getImages();
        %>
        <div class="container-fluid site-wrapper">
            <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper">
                <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title">Salon Nails &amp; Beauty</div>
                        <div class="subtitle">Welcome to our website</div>
                    </div>
                    <!-- this is the Menu content -->
                </div>
            </div><!-- this is the Header content -->
            <div class="container-fluid header-wrapper kk">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <button class="navbar-toggler ml-auto btn-menu" data-toggle="collapse" data-target="#menu">Menu</button>
                    <div class="navbar-collapse collapse" id="menu">
                        <ul class="navbar-nav">
                            <li class="nav-item"><b><a href="index.jsp">Home</a></b></li>
                            <li class="nav-item"><a href="list-price.jsp">Price List</a></li>
                            <li class="nav-item "><a href="contact.jsp">Contact and Location</a></li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="container-fluid content-wrapper">
                <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row content-inner">
                        <div id="left" class="col-lg-9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                            <div class="wrapper ">
                                <div class="content">
                                    <div class="section">
                                        <div class="content">
                                            <ul class="thumbnails column-article-section row">
                                                <% for (Image i : images) {%>
                                                <li class="span4 p-3">
                                                    <div class="img-simple span12 ">
                                                        <div class="image">
                                                            <!--<a rel="nofollow" data-ss="imagemodal" data-href="./img/img1.jpg">-->
                                                            <img class="roundeds" src="./img/<%= i.getImage()%>"></a>
                                                        </div>
                                                    </div>
                                                </li>
                                                <% } %>

                                            </ul>
                                        </div>
                                    </div>
                                    <% for (Entry e : entrys) {%>
                                    <%if (e.getId() == 1) {%>
                                    <div class="section article">
                                        <div class="heading">
                                            <h3><%= e.getTitle()%></h3>
                                        </div>                                                                             
                                        <div class="content">
                                            <div class="col-6 float-right" >
                                                <img class="" src="./img/<%= e.getImage()%>">
                                            </div>
                                            <p class="col-6 float-left" ><%= e.getContent()%></p> <p>&nbsp;</p>                                                  
                                        </div>
                                    </div>
                                    <% } else {%>

                                    <div class="section article">
                                        <div class="heading">
                                            <h3><%= e.getTitle()%></h3>
                                        </div>
                                        <div class="row">
                                            <div class="img-simple col-3 float-left">
                                                <div class="image">
                                                    <!--<a rel="nofollow" data-ss="imagemodal" data-href="http://cdn.simplesite.com/i/81/99/285697109906987393/i285697114360484982._szw1280h1280_.jpg">-->
                                                    <img src="./img/<%=e.getImage()%>"></a>
                                                </div>
                                            </div>
                                            <p class="col-9 float-right"><span><%= e.getContent()%>&nbsp;</span></p>   
                                        </div>
                                    </div>
                                    <% } %>
                                    <% }%>
                                    <div class="section">
                                        <div class="content">
                                            <ul class="thumbnails column-article-section row">
                                                <li class="col-6">

                                                    <h4>
                                                        Salon Nails &amp; Beauty</h4>

                                                    <p>Address:<br>City:<br>Tel: 12345<br>Email: your-email@your-email.com</p>
                                                </li>
                                                <li class="col-6">
                                                    <h4>
                                                        Opening Hours:</h4>
                                                    <p>Monday-Friday: 10 am – 6 pm<br>Saturday: 10 am – 4 pm</p>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="right" class="col-lg-3">
                            <div class="sidebar">
                                <div class="box">
                                    <h4 class="heading">Share this page</h4>
                                    <div class="content">
                                        <ul>
                                            <li><a href="#">Share on Facebook</a></li>
                                            <li><a href="#">Share on Twitter</a></li>
                                            <li><a href="#">Share on Google+</a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="box">
                                    <h4 class="heading">Create a website</h4>
                                    <div class="content">
                                        <p>Everybody can create a website, it's easy.</p>
                                        <a class="btn btn-block" href="#">Try it for FREE now</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- the controller has determined which view to be shown in the content -->
            <div class="container-fluid footer-wrapper" id="footer">
                <!-- this is the Footer Wrapper -->
                <div class="container">
                    <hr>
                    <div class="footer-powered-by">
                        <p>This website was created with SimpleSite</p>
                        <a href="http://www.simplesite.com/">Get Your own FREE website. Click here!</a>

                    </div>
                </div>
            </div>
            <!-- this is the Footer content -->
        </div> 
        <script src="./js/jquery.slim.min.js"></script>
        <script src="./js/bootstrap.js"></script>
        <script src="./js/bootstrap.bundle.js"></script>

    </body>
</html>
