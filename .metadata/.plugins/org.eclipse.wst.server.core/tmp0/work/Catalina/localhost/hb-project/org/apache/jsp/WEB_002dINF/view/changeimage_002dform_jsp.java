/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2564-05-04 18:10:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeimage_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Lenovo/Desktop/Project%20ENTERPRISE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hb-project/WEB-INF/lib/spring-webmvc-5.3.3.jar!/META-INF/spring-form.tld", Long.valueOf(1610407654000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.3.jar", Long.valueOf(1618896088266L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fonClick_005fnobody;

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
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fonClick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fonClick_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Save Item</title>\r\n");
      out.write("\r\n");
      out.write("\t<!-- reference our style sheet -->\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/add-inventory-style.css\" />  \r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- <link href=\"css/bootstrap.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<h2>Inventory Manager</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<h3>Change Image Item</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"clear; both;\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inventory/list\">Back to Home</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/changeimage-form.jsp(34,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("saveItem");
      // /WEB-INF/view/changeimage-form.jsp(34,2) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("inventory");
      // /WEB-INF/view/changeimage-form.jsp(34,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("GET");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\r\n");
            out.write("\t\t\t<!--  need to associate this data with inventory id -->\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\r\n");
            out.write("\t\t\t<table>\r\n");
            out.write("\t\t\t\t<tbody>\r\n");
            out.write("\t\t\t\t\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr >\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td>\t\t\t\t\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</td> \r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td><input type=\"submit\" value=\"Save\" class=\"save\" /></td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t</tbody>\r\n");
            out.write("\t\t\t</table>\r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f0_reused = false;
    try {
      _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(37,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f0.setPath("id");
      int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
        if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
      _jspx_th_form_005fhidden_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f1_reused = false;
    try {
      _jspx_th_form_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(43,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f1.setPath("name");
      // /WEB-INF/view/changeimage-form.jsp(43,10) null
      _jspx_th_form_005fhidden_005f1.setDynamicAttribute(null, "placeholder", "Name Product");
      // /WEB-INF/view/changeimage-form.jsp(43,10) null
      _jspx_th_form_005fhidden_005f1.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005fhidden_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f1 = _jspx_th_form_005fhidden_005f1.doStartTag();
        if (_jspx_th_form_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f1);
      _jspx_th_form_005fhidden_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f1, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f2_reused = false;
    try {
      _jspx_th_form_005fhidden_005f2.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(47,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f2.setPath("type");
      // /WEB-INF/view/changeimage-form.jsp(47,10) null
      _jspx_th_form_005fhidden_005f2.setDynamicAttribute(null, "placeholder", "Can or Bottle");
      // /WEB-INF/view/changeimage-form.jsp(47,10) null
      _jspx_th_form_005fhidden_005f2.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005fhidden_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f2 = _jspx_th_form_005fhidden_005f2.doStartTag();
        if (_jspx_th_form_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f2);
      _jspx_th_form_005fhidden_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f2, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f3 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f3_reused = false;
    try {
      _jspx_th_form_005fhidden_005f3.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(51,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f3.setPath("size");
      // /WEB-INF/view/changeimage-form.jsp(51,10) null
      _jspx_th_form_005fhidden_005f3.setDynamicAttribute(null, "placeholder", "Unit ml.");
      // /WEB-INF/view/changeimage-form.jsp(51,10) null
      _jspx_th_form_005fhidden_005f3.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005fhidden_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f3 = _jspx_th_form_005fhidden_005f3.doStartTag();
        if (_jspx_th_form_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f3);
      _jspx_th_form_005fhidden_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f3, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f4 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f4_reused = false;
    try {
      _jspx_th_form_005fhidden_005f4.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(55,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f4.setPath("quantity");
      // /WEB-INF/view/changeimage-form.jsp(55,10) null
      _jspx_th_form_005fhidden_005f4.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005fhidden_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f4 = _jspx_th_form_005fhidden_005f4.doStartTag();
        if (_jspx_th_form_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f4);
      _jspx_th_form_005fhidden_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f4, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f5 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    boolean _jspx_th_form_005fhidden_005f5_reused = false;
    try {
      _jspx_th_form_005fhidden_005f5.setPageContext(_jspx_page_context);
      _jspx_th_form_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(59,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fhidden_005f5.setPath("price");
      // /WEB-INF/view/changeimage-form.jsp(59,10) null
      _jspx_th_form_005fhidden_005f5.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005fhidden_005f5 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fhidden_005f5 = _jspx_th_form_005fhidden_005f5.doStartTag();
        if (_jspx_th_form_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fhidden_005f5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fhidden_005f5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fhidden_005f5.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005frequired_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f5);
      _jspx_th_form_005fhidden_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fhidden_005f5, _jsp_getInstanceManager(), _jspx_th_form_005fhidden_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fonClick_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f0_reused = false;
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/changeimage-form.jsp(63,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("image");
      // /WEB-INF/view/changeimage-form.jsp(63,10) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "file");
      // /WEB-INF/view/changeimage-form.jsp(63,10) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "onClick", "this.form.reset()");
      // /WEB-INF/view/changeimage-form.jsp(63,10) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "required", "required");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005frequired_005fpath_005fonClick_005fnobody.reuse(_jspx_th_form_005finput_005f0);
      _jspx_th_form_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f0_reused);
    }
    return false;
  }
}
