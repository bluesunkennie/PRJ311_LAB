<%@page import="Model.Price"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.PriceDAO"%>
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
             PriceDAO pdao = new PriceDAO();
             ArrayList<Price> prices = pdao.getPrices();

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
                            <li class="nav-item"><a href="index.jsp">Home</a></li>
                            <li class="nav-item"><b><a href="list-price.jsp">Price List</a></b></li>
                            <li class="nav-item "><a href="contact.jsp">Contact and Location</a></li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="container-fluid content-wrapper">
                <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row content-inner">
                        <div id="left" class="col-lg-9">
                            <h3> Price list</h3>
                            <div class="list-prices">
                                <% for (Price p : prices) { %>
                                <div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th class="col-md-9">Service</th>
                                                <th class="col-md-3">Price</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td class="col-md-9"><%=p.getTitle() %></td>
                                                <td class="col-md-3 price">$<%=p.getPrice() %></td>
                                            </tr>
                                        </tbody>
                                    </table>
<!--                                            <p class="dot"></p>-->
                                </div>
                                            <% } %>
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
            </div>
            <script src="./js/bootstrap.js"></script>
            <script src="./js/bootstrap.bundle.js"></script>
    </body>
</html>