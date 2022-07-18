package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Image;
import Model.Entry;
import java.util.ArrayList;
import DAO.ImageDAO;
import DAO.EntryDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-grid.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-reboot.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body style=\"text-align: justify\">\n");
      out.write("        ");

            EntryDAO edao = new EntryDAO();
            ImageDAO idao = new ImageDAO();
            ArrayList<Entry> entrys = edao.getEntrys();
            ArrayList<Image> images = idao.getImages();
        
      out.write("\n");
      out.write("        <div class=\"container-fluid site-wrapper\">\n");
      out.write("            <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper\">\n");
      out.write("                <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"title\">Salon Nails &amp; Beauty</div>\n");
      out.write("                        <div class=\"subtitle\">Welcome to our website</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- this is the Menu content -->\n");
      out.write("                </div>\n");
      out.write("            </div><!-- this is the Header content -->\n");
      out.write("            <div class=\"container-fluid header-wrapper kk\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <button class=\"navbar-toggler ml-auto btn-menu\" data-toggle=\"collapse\" data-target=\"#menu\">Menu</button>\n");
      out.write("                    <div class=\"navbar-collapse collapse\" id=\"menu\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\"><b><a href=\"index.jsp\">Home</a></b></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"list-price.jsp\">Price List</a></li>\n");
      out.write("                            <li class=\"nav-item \"><a href=\"contact.jsp\">Contact and Location</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid content-wrapper\">\n");
      out.write("                <!-- this is the Content Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row content-inner\">\n");
      out.write("                        <div id=\"left\" class=\"col-lg-9\"> <!-- ADD \"span12\" if no sidebar, or \"span9\" with sidebar -->\n");
      out.write("                            <div class=\"wrapper \">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <ul class=\"thumbnails column-article-section row\">\n");
      out.write("                                                ");
 for (Image i : images) {
      out.write("\n");
      out.write("                                                <li class=\"span4 p-3\">\n");
      out.write("                                                    <div class=\"img-simple span12 \">\n");
      out.write("                                                        <div class=\"image\">\n");
      out.write("                                                            <!--<a rel=\"nofollow\" data-ss=\"imagemodal\" data-href=\"./img/img1.jpg\">-->\n");
      out.write("                                                            <img class=\"roundeds\" src=\"./img/");
      out.print( i.getImage());
      out.write("\"></a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
 for (Entry e : entrys) {
      out.write("\n");
      out.write("                                    ");
if (e.getId() == 1) {
      out.write("\n");
      out.write("                                    <div class=\"section article\">\n");
      out.write("                                        <div class=\"heading\">\n");
      out.write("                                            <h3>");
      out.print( e.getTitle());
      out.write("</h3>\n");
      out.write("                                        </div>                                                                             \n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <div class=\"col-6 float-right\" >\n");
      out.write("                                                <img class=\"\" src=\"./img/");
      out.print( e.getImage());
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <p class=\"col-6 float-left\" >");
      out.print( e.getContent());
      out.write("</p> <p>&nbsp;</p>                                                  \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
 } else {
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"section article\">\n");
      out.write("                                        <div class=\"heading\">\n");
      out.write("                                            <h3>");
      out.print( e.getTitle());
      out.write("</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"img-simple col-3 float-left\">\n");
      out.write("                                                <div class=\"image\">\n");
      out.write("                                                    <!--<a rel=\"nofollow\" data-ss=\"imagemodal\" data-href=\"http://cdn.simplesite.com/i/81/99/285697109906987393/i285697114360484982._szw1280h1280_.jpg\">-->\n");
      out.write("                                                    <img src=\"./img/");
      out.print(e.getImage());
      out.write("\"></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <p class=\"col-9 float-right\"><span>");
      out.print( e.getContent());
      out.write("&nbsp;</span></p>   \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <ul class=\"thumbnails column-article-section row\">\n");
      out.write("                                                <li class=\"col-6\">\n");
      out.write("\n");
      out.write("                                                    <h4>\n");
      out.write("                                                        Salon Nails &amp; Beauty</h4>\n");
      out.write("\n");
      out.write("                                                    <p>Address:<br>City:<br>Tel: 12345<br>Email: your-email@your-email.com</p>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"col-6\">\n");
      out.write("                                                    <h4>\n");
      out.write("                                                        Opening Hours:</h4>\n");
      out.write("                                                    <p>Monday-Friday: 10 am – 6 pm<br>Saturday: 10 am – 4 pm</p>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"right\" class=\"col-lg-3\">\n");
      out.write("                            <div class=\"sidebar\">\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h4 class=\"heading\">Share this page</h4>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\">Share on Facebook</a></li>\n");
      out.write("                                            <li><a href=\"#\">Share on Twitter</a></li>\n");
      out.write("                                            <li><a href=\"#\">Share on Google+</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"box\">\n");
      out.write("                                    <h4 class=\"heading\">Create a website</h4>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <p>Everybody can create a website, it's easy.</p>\n");
      out.write("                                        <a class=\"btn btn-block\" href=\"#\">Try it for FREE now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- the controller has determined which view to be shown in the content -->\n");
      out.write("            <div class=\"container-fluid footer-wrapper\" id=\"footer\">\n");
      out.write("                <!-- this is the Footer Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"footer-powered-by\">\n");
      out.write("                        <p>This website was created with SimpleSite</p>\n");
      out.write("                        <a href=\"http://www.simplesite.com/\">Get Your own FREE website. Click here!</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- this is the Footer content -->\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"./js/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"./js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"./js/bootstrap.bundle.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
