package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Model.Blog;
import Model.Blog;
import DAO.BlogDAO;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-grid.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-reboot.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" />\n");
      out.write("        <title>My Blog - us-123my-life.simplesite.com</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"text-align: justify\">\n");
      out.write("        ");

            //create new bdao blog
            BlogDAO bdao = new BlogDAO();
            //store list of blog
            ArrayList<Blog> blogs = bdao.getBlogs();
            //format date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
      out.write("\n");
      out.write("        <div class=\"container-fluid site-wrapper\">\n");
      out.write("            <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper\">\n");
      out.write("                <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"title\">Blogging About My Life</div>\n");
      out.write("                        <div class=\"subtitle\">Welcome to my blog</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- this is the Menu content -->\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                        <button class=\"navbar-toggler ml-auto btn-menu\" data-toggle=\"collapse\" data-target=\"#menu\">Menu</button>\n");
      out.write("                        <div class=\"navbar-collapse collapse\" id=\"menu\">\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item active\"><a href=\"index.jsp\">My Blog</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a href=\"about.jsp\">About Me</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div><!-- this is the Header content -->\n");
      out.write("            <div class=\"container-fluid content-wrapper\">\n");
      out.write("                <!-- this is the Content Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row content-inner\">\n");
      out.write("                        <div id=\"left\" class=\"col-lg-9\">\n");
      out.write("                            <!-- ADD \"span12\" if no sidebar, or \"span9\" with sidebar -->\n");
      out.write("                            <div class=\"wrapper blog\">\n");
      out.write("                                <h3 class=\"blog-title\">My Blog</h3>\n");
      out.write("\n");
      out.write("                                ");

                                String id = request.getParameter("id");
                                if (id != null) {
                                    Blog b = bdao.getBlog(Integer.parseInt(id));
                                    if (b == null) {
                                        return;
                                    } 
      out.write("\n");
      out.write("                                ");
 if (b.getId() == 2) {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                        <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <blockquote class=\"pull-right\">\n");
      out.write("                                        <p>");
      out.print(b.getContent());
      out.write("</p>\n");
      out.write("                                        <small><cite>Villian W.perky</cite></small>\n");
      out.write("                                    </blockquote>\n");
      out.write("                                </div>\n");
      out.write("                                ");
 } else if (b.getId() == 3) {
      out.write("\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                        <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div> <img class=\"photo\" src=\"");
      out.print(b.getPicture());
      out.write("\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                            <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"image\"><img src=\"");
      out.print(b.getPicture());
      out.write("\"></div>\n");
      out.write("                                        <p>");
      out.print(b.getContent());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"dot\"></p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 } else { 
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 for (Blog b : blogs) { 
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 if (b.getId() == 2) {
      out.write("\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                        <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <blockquote class=\"pull-right\">\n");
      out.write("                                        <p>");
      out.print(b.getContent());
      out.write("</p>\n");
      out.write("                                        <small><cite>Villian W.perky</cite></small>\n");
      out.write("                                    </blockquote>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
 } else if (b.getId() == 3) {
      out.write("\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                        <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div> <img class=\"photo\" src=\"");
      out.print(b.getPicture());
      out.write("\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <h4 class=\"col-md-9 blog-heading\"><a href=\"index.jsp?id=");
      out.print(b.getId());
      out.write('"');
      out.write('>');
      out.print(b.getName());
      out.write("</a></h4>\n");
      out.write("                                            <p class=\"col-md-3 date\"><i>");
      out.print(sdf.format(b.getDate()));
      out.write("</i></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"image\"><img src=\"");
      out.print(b.getPicture());
      out.write("\"></div>\n");
      out.write("                                        <p>");
      out.print(b.getContent());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"dot\"></p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                <div class=\"content overview\">\n");
      out.write("                                    <a href=\"overview.jsp\">Overview</a>\n");
      out.write("                                </div>                                    \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"right\" class=\"col-md-3\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            <!-- the controller has determined which view to be shown in the content -->\n");
      out.write("            <div class=\"container-fluid footer-wrapper\" id=\"footer\">\n");
      out.write("                <!-- this is the Footer Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"footer-powered-by\">\n");
      out.write("                        <p>This website was created with SimpleSite</p>\n");
      out.write("                        <a href=\"http://www.simplesite.com/\">Get Your own FREE website. Click here!</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- this is the Footer content -->\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"./js/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"./js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"./js/bootstrap.bundle.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
