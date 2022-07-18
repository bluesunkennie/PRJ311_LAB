package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.EntryDAO;
import java.util.ArrayList;
import Model.Entry;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-grid.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-reboot.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" />\n");
      out.write("        <title>Home - us-123sushi.simplesite.com</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            EntryDAO edao = new EntryDAO();
            ArrayList<Entry> entrys = edao.getEntrys();
        
      out.write("\n");
      out.write("        <div class=\"container-fluid site-wrapper\">\n");
      out.write("            <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper\">\n");
      out.write("                <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <div class=\"title\">The Sushi Restaurant</div>\n");
      out.write("                            <div class=\"subtitle\">Welcome to this website</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- these are the titles -->\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!-- Everything you want hidden at 940px or less, place within here -->\n");
      out.write("                            <div class=\"navbar-collapse\">\n");
      out.write("                                <ul class=\"nav\">\n");
      out.write("                                    <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li class=\"\"><a href=\"list-price.jsp\">Menu and Price list</a></li>\n");
      out.write("                                    <li class=\"\"><a href=\"find-us.jsp\">Find us</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- this is the Menu content -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- this is the Header content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid content-wrapper\">\n");
      out.write("                <!-- this is the Content Wrapper -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div id=\"left\">\n");
      out.write("                        <!-- ADD \"span12\" if no sidebar, or \"span9\" with sidebar -->\n");
      out.write("                        <div class=\"wrapper\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                ");
for (Entry e : entrys) {
      out.write("\n");
      out.write("                                ");
if (e.getId() == 1) {
      out.write("\n");
      out.write("                                <div class=\"article\"><img class=\"image\" src=\"./img/");
      out.print(e.getImage());
      out.write("\"<p class=\"dot\"></p></div>\n");
      out.write("                                    ");
} else {
      out.write("\n");
      out.write("                                <div class=\"article\">\n");
      out.write("                                    <div class=\"heading\"><h3>");
      out.print(e.getTitle());
      out.write("</h3></div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <img src=\"./img/");
      out.print(e.getImage());
      out.write("\">\n");
      out.write("                                        <span class=\"text\" style=\"text-align: justify\">\n");
      out.write("                                            ");
      out.print(e.getContent());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"right\">\n");
      out.write("                        <div class=\"sidebar\">\n");
      out.write("                            <h4>Share this page</h4>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Share on Facebook</a></li>\n");
      out.write("                                    <li><a href=\"#\">Share on Twitter</a></li>\n");
      out.write("                                    <li><a href=\"#\">Share on Google+</a></li>\n");
      out.write("                                </ul>\n");
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
      out.write("                        <a href=\"http://www.simplesite.com/\">Created with SimpleSite</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- this is the Footer content -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
