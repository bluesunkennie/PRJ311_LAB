<%@page import="DAO.EntryDAO"%>
<%@page import="java.util.ArrayList"%>

<%@page import="Model.Entry"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="./css/bootstrap.css" />
        <link rel="stylesheet" href="./css/bootstrap-grid.css" />
        <link rel="stylesheet" href="./css/bootstrap-reboot.css" />
        <link rel="stylesheet" href="./css/style.css" />
        <title>Home - us-123sushi.simplesite.com</title>
    </head>
    <body>
        <%
            EntryDAO edao = new EntryDAO();
            ArrayList<Entry> entrys = edao.getEntrys();
        %>
        <div class="container-fluid site-wrapper">
            <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper">
                <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="">
                            <div class="title">The Sushi Restaurant</div>
                            <div class="subtitle">Welcome to this website</div>
                        </div>
                    </div>

                    <!-- these are the titles -->
                    <div class="navbar">
                        <div class="container">
                            <!-- Everything you want hidden at 940px or less, place within here -->
                            <div class="navbar-collapse">
                                <ul class="nav">
                                    <li class="active"><a href="index.jsp">Home</a></li>
                                    <li class=""><a href="list-price.jsp">Menu and Price list</a></li>
                                    <li class=""><a href="find-us.jsp">Find us</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- this is the Menu content -->
                    </div>
                </div>
            </div>
            <div class="container-fluid content-wrapper">
                <!-- this is the Content Wrapper -->
                <div class="row">
                    <div id="left">
                        <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                        <div class="wrapper">
                            <div class="content">
                                <%for (Entry e : entrys) {%>
                                <%if (e.getId() == 1) {%>
                                <div class="article"><img class="image" src="./img/<%=e.getImage()%>"<p class="dot"></p></div>
                                    <%} else {%>
                                <div class="article">
                                    <div class="heading"><h3><%=e.getTitle()%></h3></div>
                                    <div class="content">
                                        <img src="./img/<%=e.getImage()%>">
                                        <span class="text" style="text-align: justify">
                                            <%=e.getContent()%>
                                        </span>
                                    </div>
                                </div>
                                <%}%>
                                <%}%>
                            </div>
                        </div>
                    </div>
                    <div id="right">
                        <div class="sidebar">
                            <h4>Share this page</h4>
                            <div class="content">
                                <ul>
                                    <li><a href="#">Share on Facebook</a></li>
                                    <li><a href="#">Share on Twitter</a></li>
                                    <li><a href="#">Share on Google+</a></li>
                                </ul>
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
                        <a href="http://www.simplesite.com/">Created with SimpleSite</a>
                    </div>
                </div>
            </div>
            <!-- this is the Footer content -->
        </div>
        <script src="./js/bootstrap.js"></script>
        <script src="./js/bootstrap.bundle.js"></script>
    </body>
</html>