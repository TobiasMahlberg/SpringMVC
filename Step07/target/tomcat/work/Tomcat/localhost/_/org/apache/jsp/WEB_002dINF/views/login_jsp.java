/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-09 11:34:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/navigation.jspf", Long.valueOf(1531136021672L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1531134532979L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1531134563541L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Todos Application</title>\r\n");
      out.write("\t\t<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"rel=\"stylesheet\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>");
      out.write('\n');
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t<a href=\"http://www.in28minutes.com\" class=\"navbar-brand\">in28Minutes</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li><a href=\"/login\">Home</a></li>\r\n");
      out.write("\t\t\t<li class=\"active\" ><a href=\"/list-todos\">Todos</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("\t.login-container{\n");
      out.write("\t    position: relative;\n");
      out.write("\t    width: 400px;\n");
      out.write("\t    margin: 80px auto;\n");
      out.write("\t    padding: 20px 40px 40px;\n");
      out.write("\t    text-align: center;\n");
      out.write("\t    background: #fff;\n");
      out.write("\t    border: 1px solid #ccc;\n");
      out.write("\t}\n");
      out.write("\t.login-container::before,.login-container::after{\n");
      out.write("\t    content: \"\";\n");
      out.write("\t    position: absolute;\n");
      out.write("\t    width: 100%;\n");
      out.write("\t    height: 100%;\n");
      out.write("\t    top: 3.5px;left: 0;\n");
      out.write("\t    background: #fff;\n");
      out.write("\t    z-index: -1;\n");
      out.write("\t    -webkit-transform: rotateZ(4deg);\n");
      out.write("\t    -moz-transform: rotateZ(4deg);\n");
      out.write("\t    -ms-transform: rotateZ(4deg);\n");
      out.write("\t    border: 1px solid #ccc;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.login-container::after{\n");
      out.write("\t    top: 5px;\n");
      out.write("\t    z-index: -2;\n");
      out.write("\t    -webkit-transform: rotateZ(-2deg);\n");
      out.write("\t     -moz-transform: rotateZ(-2deg);\n");
      out.write("\t     -ms-transform: rotateZ(-2deg);\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.form-box input{\n");
      out.write("\t    width: 100%;\n");
      out.write("\t    padding: 10px;\n");
      out.write("\t    text-align: center;\n");
      out.write("\t    height:40px;\n");
      out.write("\t    border: 1px solid #ccc;;\n");
      out.write("\t    background: #fafafa;\n");
      out.write("\t    transition:0.2s ease-in-out;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.form-box input:focus{ outline: 0; background: #eee; }\n");
      out.write("\t.form-box input[type=\"text\"]{ border-radius: 5px 5px 0 0; text-transform: lowercase; }\n");
      out.write("\t.form-box input[type=\"password\"]{ border-radius: 0 0 5px 5px; border-top: 0; }\n");
      out.write("\t.form-box button.login{ margin-top:15px; padding: 10px 20px; }\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\n");
      out.write("   \t\n");
      out.write("   \t<form action=\"login\" method=\"POST\">\n");
      out.write("\t  <div class=\"login-container\">\n");
      out.write("\t\t<div class=\"form-box\">\n");
      out.write("   \t\t  <fieldset class=\"form-group\">\n");
      out.write("\t\t\t<label>Name</label> <input name=\"name\" type=\"text\" class=\"form-control\" />\n");
      out.write("\t\t  </fieldset>\n");
      out.write("\t\t  <fieldset class=\"form-group\">\n");
      out.write("\t\t\t<label>Password</label> <input name=\"password\" type=\"password\" class=\"form-control\" />\n");
      out.write("\t\t  </fieldset>\n");
      out.write("   \t\t  <button class=\"btn btn-info btn-block login\" type=\"submit\">Login</button>\n");
      out.write("   \t  \t</div>\n");
      out.write(" \t  </div>\n");
      out.write("   \t</form>\n");
      out.write("  \n");
      out.write("\t\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
