/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-10-07 17:04:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>\r\n");
      out.write("\t<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>\r\n");
      out.write("\t<link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>\r\n");
      out.write("\t<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t<script src=\"js/index.js\"></script>\r\n");
      out.write("\t<title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url('imges/banking1.jpg'); background-repeat: no-repeat;\">\r\n");
      out.write("\t<div class=\"animation01\">\r\n");
      out.write("        <div class=\"rhombus_small\">\r\n");
      out.write("            <div class=\"rhombus\">\r\n");
      out.write("                <div class=\"border_box\">\r\n");
      out.write("                    <span class=\"line line01\"></span>\r\n");
      out.write("                    <span class=\"line line02\"></span>\r\n");
      out.write("                    <span class=\"line line03\"></span>\r\n");
      out.write("                    <span class=\"line line04\"></span>\r\n");
      out.write("                    <span class=\"circle circle01\"></span>\r\n");
      out.write("                    <span class=\"circle circle02\"></span>\r\n");
      out.write("                    <span class=\"circle circle03\"></span>\r\n");
      out.write("                    <span class=\"circle circle04\"></span>\r\n");
      out.write("                    <span class=\"animation_line animation_line01\"></span>\r\n");
      out.write("                    <span class=\"animation_line_wrapper animation_line02_wrapper\"><span class=\"animation_line animation_line02\"></span></span>\r\n");
      out.write("                    <span class=\"animation_line animation_line03\"></span>\r\n");
      out.write("                    <span class=\"animation_line_wrapper animation_line04_wrapper\"><span class=\"animation_line animation_line04\"></span></span>\r\n");
      out.write("                    <span class=\"animation_line animation_line05\"></span>\r\n");
      out.write("                    <span class=\"animation_line_wrapper animation_line06_wrapper\"><span class=\"animation_line animation_line06\"></span></span>\r\n");
      out.write("                    <span class=\"animation_line animation_line07\"></span>\r\n");
      out.write("                    <span class=\"animation_line_wrapper animation_line08_wrapper\"><span class=\"animation_line animation_line08\"></span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"wave\">\r\n");
      out.write("                    <div class=\"wave_wrapper\"><div class=\"wave_box\"></div></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"animation02\">\r\n");
      out.write("        <div class=\"rhombus_box\">\r\n");
      out.write("            <span class=\"rhombus_item_wrapper rhombus_item01_wrapper\"><span class=\"rhombus_item\"></span></span>\r\n");
      out.write("            <span class=\"rhombus_item_wrapper rhombus_item02_wrapper\"><span class=\"rhombus_item\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"double_content\">\r\n");
      out.write("            <div class=\"double_wrapper02 dotted02\"><div class=\"dotted_hide\"><div class=\"double_wrapper01 dotted01\"><span class=\"dotted_right\"></span></div></div></div>\r\n");
      out.write("            <div class=\"double_wrapper02 white02\"><div class=\"double_wrapper01 white01\"></div></div>\r\n");
      out.write("            <div class=\"double_wrapper02 gray02\"><div class=\"double_wrapper01 gray01\"></div></div>\r\n");
      out.write("            <div class=\"double_wrapper02 orange02\"><div class=\"double_wrapper01 orange01\"></div></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"name\">\r\n");
      out.write("\t\t\t<p>Sparks Foundation : Banking App\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/customers?action=ViewCustomers\"><button type=\"button\" id=\"animatebutton\" class=\"btn btn-info btn-icon-text animatebutton\"><i class=\"fa fa-check btn-icon-prepend\"></i>View Customers</button></a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("            <span class=\"name_circle01\"></span>\r\n");
      out.write("            <span class=\"name_circle02\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
