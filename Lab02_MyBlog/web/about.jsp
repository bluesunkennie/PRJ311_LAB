<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/bootstrap.css" />
        <link rel="stylesheet" href="./css/bootstrap-grid.css" />
        <link rel="stylesheet" href="./css/bootstrap-reboot.css" />
        <link rel="stylesheet" href="./css/style.css" />
        <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
        <title>My Blog - us-123my-life.simplesite.com</title>
    </head>
    <body style="text-align: justify">
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
                                <li class="nav-item"><a href="index.jsp">My Blog</a></li>
                                <li class="nav-item active"><a href="about.jsp">About Me</a></li>
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
                                <h3 class="blog-title">About Me</h3>
                                <div>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
                                        nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat
                                        volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation
                                        ullamcorper suscipit lobortis nisl ut aliquip
                                        ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in
                                        vulputate velit esse molestie consequat, vel illum dolore eu feugiat
                                        nulla facilisis at vero eros et accumsan et iusto odio dignissim qui
                                        blandit praesent luptatum zzril delenit augue
                                        duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis
                                        eleifend option congue nihil imperdiet doming id quod mazim placerat
                                        facer possim assum. 
                                    </p>
                                    <p>
                                        Typi non habent claritatem insitam; est usus legentis in iis qui facit
                                        eorum
                                        claritatem. Investigationes demonstraverunt lectores legere me lius quod
                                        ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur
                                        mutationem consuetudium lectorum. Mirum est notare quam littera gothica,
                                        quam nunc putamus parum claram, anteposuerit
                                        litterarum formas humanitatis per seacula quarta decima et quinta
                                        decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant
                                        sollemnes in futurum.
                                    </p>
                                </div>
                                <p class="dot"></p>
                            </div>

                            <div class="content">
                                <p>Kind regards</p>
                                <p class="signature">Vivianne Russell</p>
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