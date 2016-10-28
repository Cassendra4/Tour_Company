package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hotelConfirmation2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <title> Hotel Bookings </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hotel Bookings</h1>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("       \n");
      out.write(" \n");
      out.write("<form method=\"post\" action=\"checkAvailability\">\n");
      out.write("   <table cellpadding=\"2\" cellspacing=\"0\" border=\"1\" width=\"500\">\n");
      out.write("     \n");
      out.write("      <tr>\n");
      out.write("         <td width=\"300\">Tour Reference Number::</td>\n");
      out.write("         <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"tour_ID\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tours}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td>Tour Date:</td>\n");
      out.write("         <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"date\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tours_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Hotel Name:</td>\n");
      out.write("         <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"hotname\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotel_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Hotel Email:</td>\n");
      out.write("         <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"hotnum\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotel_num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td>No of passengers:</td>\n");
      out.write("         <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"numPas\" value=\"\"  style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("       <tr>\n");
      out.write("          <td>No of rooms:</td>\n");
      out.write("          <td colspan=\"3\"><input class=\"left\" type=\"text\" name=\"roomNo\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  style=\"width: 150px;\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("         <td>Room Type:</td>\n");
      out.write("         <td>Single: <input type=\"checkbox\" name=\"single\" style=\"border: 0px\"></td>\n");
      out.write("         <td>Double: <input type=\"checkbox\" name=\"double\" style=\"border: 0px\"></td>\n");
      out.write("         <td>Triple: <input type=\"checkbox\" name=\"triple\" style=\"border: 0px\"></td>\n");
      out.write("      </tr>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("      <tr>\n");
      out.write("          <td colspan=\"4\" align=\"center\"><input type=\"submit\" value=\"Check Availability\" style=\"margin-left: 20px; width: 160px \"></td>\n");
      out.write("    \n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("  \n");
      out.write("   </table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("tourDetails");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passengers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
