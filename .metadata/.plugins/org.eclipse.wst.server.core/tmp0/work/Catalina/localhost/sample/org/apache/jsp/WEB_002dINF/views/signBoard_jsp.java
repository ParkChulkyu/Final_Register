/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2020-03-27 04:42:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/Park/Documents/SourceTree/Final_Register/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sample/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1579479209986L));
    _jspx_dependants.put("jar:file:/C:/Users/Park/Documents/SourceTree/Final_Register/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sample/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/Park/Documents/SourceTree/Final_Register/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sample/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src='https://www.google.com/recaptcha/api.js'></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction goPopup() {\r\n");
      out.write("\t\t// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("\t\tvar pop = window.open(\"./jusoPopup.do\", \"juso\",\r\n");
      out.write("\t\t\t\t\"width=570,height=420, scrollbars=yes, resizable=yes\");\r\n");
      out.write("\r\n");
      out.write("\t\t// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("\t\t//var pop = window.open(\"/popup/jusoPopup.jsp\",\"pop\",\"scrollbars=yes, resizable=yes\"); \r\n");
      out.write("\t}\r\n");
      out.write("\t/** API 서비스 제공항목 확대 (2017.02) **/\r\n");
      out.write("\r\n");
      out.write("\tfunction jusoCallBack(roadAddrPart1, addrDetail, zipNo) {\r\n");
      out.write("\t\t// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.\r\n");
      out.write("\t\t$(\"#addr\").val(\"(\" + zipNo + \") \" + roadAddrPart1);\r\n");
      out.write("\t\t$(\"#addr2\").val(addrDetail);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t   //ID 유효성 검사\r\n");
      out.write("\t   function idChkConfirm() {\r\n");
      out.write("\t      var chk = document.getElementsByName('m_id')[0].title\r\n");
      out.write("\t      if (chk == \"n\") {  // 아이디중복체크 했으면 \r\n");
      out.write("\t         alert(\"아이디 중복체크를 먼저해주세요\");\r\n");
      out.write("\t         document.getElementsByName(\"m_id\")[0].focus();\r\n");
      out.write("\t      } else {\r\n");
      out.write("\t      }\r\n");
      out.write("\t   }\r\n");
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\t   var EmailCode = \"\";\r\n");
      out.write("\t   \r\n");
      out.write("\t   //이메일 인증 SMTP\r\n");
      out.write("\t   function verifyEmail(){\r\n");
      out.write("\t      $.ajax({\r\n");
      out.write("\t         url : \"sendMail.do?to=\"+$(\"#m_email\").val(),\r\n");
      out.write("\t         type: \"post\",\r\n");
      out.write("\t         contentType:\"application/json\",\r\n");
      out.write("\t         dataType : 'json',\r\n");
      out.write("\t         success : function(data) {\r\n");
      out.write("\t            alert(\"인증코드가 발급되었습니다.\");\r\n");
      out.write("\t            EmailCode = data;\r\n");
      out.write("\t            console.log(EmailCode);\r\n");
      out.write("\t         },\r\n");
      out.write("\t         error : function(err) {\r\n");
      out.write("\t            alert(\"에러가 발생했습니다.\\n브라우저 콘솔의 내용을 확인하세요.\");\r\n");
      out.write("\t            console.log(err);\r\n");
      out.write("\t         }\r\n");
      out.write("\t      });\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   //인증코드 확인 함수\r\n");
      out.write("\t   function emailChk(){\r\n");
      out.write("\t   \r\n");
      out.write("\t      if($(\"#VerifyNum\").val() == \"\"){\r\n");
      out.write("\t         alert(\"인증코드를 써주세요.\");\r\n");
      out.write("\t      }else if($(\"#VerifyNum\").val() != EmailCode){\r\n");
      out.write("\t         alert(\"인증코드가 일치하지 않습니다.\");\r\n");
      out.write("\t      }else if ($(\"#VerifyNum\").val() == EmailCode){\r\n");
      out.write("\t         alert(\"인증코드가 일치합니다.\");\r\n");
      out.write("\t         $(\"#verifyBox\").prop(\"checked\", true);\r\n");
      out.write("\t      }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   //id중복체크 하지않으면 회원가입이 안됨\r\n");
      out.write("\t\t$(document).ready(function(e){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar idx = false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#check').click(function(){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl: \"idCheck.do?m_id=\"+$(\"#m_id\").val(),\r\n");
      out.write("\t\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\tif(data == 'true'){\r\n");
      out.write("\t\t\t\t\t\t\tidx=true;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#m_id\").attr(\"readonly\",true);\r\n");
      out.write("\t\t\t\t\t\t\tvar html=\"<tr><td colspan='3' style='color: green'>사용가능</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#idCheck\").empty();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#idCheck\").append(html);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#m_id\").attr(\"title\",'y');\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tvar html=\"<tr><td colspan='3' style='color: red'>사용불가능한 아이디 입니다.</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#idCheck\").empty();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#idCheck\").append(html);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror: function(){\r\n");
      out.write("\t\t\t\t\t\talert(\"서버에러\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<h1>회원가입</h1>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"sign.do\" method=\"post\" name=\"signFrm\" id=\"signFrm\">\r\n");
      out.write("\t\t<table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t<th>아이디 :</th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input title=\"n\" id=\"m_id\" type=\"text\" name=\"m_id\" placeholder=\"ID\" required />\r\n");
      out.write("\t\t\t\t\t<input id=\"check\" type=\"button\"value=\"중복\" >\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=3 id=\"idCheck\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t<th>비밀번호 :</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"m_pw\" placeholder=\"PW\"\r\n");
      out.write("\t\t\t\t\tonclick=\"idChkConfirm();\" ></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t<th>이름 :</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"m_name\" placeholder=\"이름\"\r\n");
      out.write("\t\t\t\t\tonclick=\"idChkConfirm();\" ></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t<th>이메일 :</th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"m_email\" name=\"m_email\" onclick=\"idChkConfirm();\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Verify\" onclick=\"verifyEmail();\" id=\"verifyBtn\"><br> Verify\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" value=\"Completed\" disabled=\"disabled\" id=\"verifyBox\"> 인증번호: \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"\" id=\"VerifyNum\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"확인\" onclick=\"emailChk();\" id=\"verifyChk\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<th>도로명 주소 :</th>\r\n");
      out.write("\t\t\t\t<td><input id=\"addr\" type=\"text\" size=\"60\" name=\"m_address\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\tonclick=\"goPopup();\" readonly placeholder=\"클릭하면 도로명주소 입력가능!\"><br />\r\n");
      out.write("\t\t\t\t\t<input id=\"addr2\" type=\"text\" size=\"30\" name=\"m_address2\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"상세 주소를 입력해주세요\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t<td colspan=\"7\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"가입하기\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"location.href='index.jsp'\" value=\"돌아가기\" ></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/signBoard.jsp(150,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty dto}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.m_addr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/signBoard.jsp(153,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty dto}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.m_addr2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
