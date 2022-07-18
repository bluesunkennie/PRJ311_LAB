<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Blog"%>
<%@page import="Model.Blog"%>
<%@page import="DAO.BlogDAO"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/bootstrap.css" />
        <link rel="stylesheet" href="./css/bootstrap-grid.css" />
        <link rel="stylesheet" href="./css/bootstrap-reboot.css" />
        <link rel="stylesheet" href="./css/style.css" />
        <title>My Blog - us-123my-life.simplesite.com</title>
    </head>
    <body style="text-align: justify">
        <%
            //create new bdao blog
            BlogDAO bdao = new BlogDAO();
            //store list of blog
            ArrayList<Blog> blogs = bdao.getBlogs();
            //format date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        %>
        <div class="container-fluid site-wrapper">
            <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper">
                <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title">Blogging About My Life</div>
                        <div class="subtitle">Welcome to my blog</div>
                    </div>
                    <!-- this is the Menu content -->
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <button class="navbar-toggler ml-auto btn-menu" data-toggle="collapse" data-target="#menu">Menu</button>
                        <div class="navbar-collapse collapse" id="menu">
                            <ul class="navbar-nav">
                                <li class="nav-item active"><a href="index.jsp">My Blog</a></li>
                                <li class="nav-item"><a href="about.jsp">About Me</a></li>
                            </ul>
                        </div>
                    </nav>

                </div>
            </div><!-- this is the Header content -->
            <div class="container-fluid content-wrapper">
                <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row content-inner">
                        <div id="left" class="col-lg-9">
                            <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                            <div class="wrapper blog">
                                <h3 class="blog-title">My Blog</h3>

                                <%
                                String id = request.getParameter("id");
                                if (id != null) {
                                    Blog b = bdao.getBlog(Integer.parseInt(id));
                                    if (b == null) {
                                        return;
                                    } %>
                                <% if (b.getId() == 2) {%>


                                <div class="content">
                                    <div class="row">
                                        <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                        <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                    </div>
                                    <blockquote class="pull-right">
                                        <p><%=b.getContent()%></p>
                                        <small><cite>Villian W.perky</cite></small>
                                    </blockquote>
                                </div>
                                <% } else if (b.getId() == 3) {%>
                                <div class="content">
                                    <div class="row">
                                        <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                        <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                    </div>
                                    <div>
                                        <div> <img class="photo" src="<%=b.getPicture()%>"></div>
                                    </div>
                                </div>

                                <% } else {%>
                                <div>
                                    <div class="content">
                                        <div class="row">
                                            <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                            <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                        </div>
                                    </div>

                                    <div>
                                        <div class="image"><img src="<%=b.getPicture()%>"></div>
                                        <p><%=b.getContent()%></p>
                                    </div>
                                    <p class="dot"></p>
                                </div>

                                <% } %>

                                <% } else { %>

                                <% for (Blog b : blogs) { %>

                                <% if (b.getId() == 2) {%>
                                <div class="content">
                                    <div class="row">
                                        <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                        <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                    </div>
                                    <blockquote class="pull-right">
                                        <p><%=b.getContent()%></p>
                                        <small><cite>Villian W.perky</cite></small>
                                    </blockquote>
                                </div>

                                <% } else if (b.getId() == 3) {%>
                                <div class="content">
                                    <div class="row">
                                        <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                        <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                    </div>
                                    <div>
                                        <div> <img class="photo" src="<%=b.getPicture()%>"></div>
                                    </div>
                                </div>

                                <% } else {%>
                                <div>
                                    <div class="content">
                                        <div class="row">
                                            <h4 class="col-md-9 blog-heading"><a href="index.jsp?id=<%=b.getId()%>"><%=b.getName()%></a></h4>
                                            <p class="col-md-3 date"><i><%=sdf.format(b.getDate())%></i></p>
                                        </div>
                                    </div>

                                    <div>
                                        <div class="image"><img src="<%=b.getPicture()%>"></div>
                                        <p><%=b.getContent()%></p>
                                    </div>
                                    <p class="dot"></p>
                                </div>

                                <% } %>

                                <% } %>

                                <% }%>
                                <div class="content overview">
                                    <a href="overview.jsp">Overview</a>
                                </div>                                    
                            </div>
                        </div>
                        <div id="right" class="col-md-3">
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