/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-24 08:54:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import productCategory.model.vo.ProductCategory;
import member.model.service.MemberService;
import member.model.vo.Member;

public final class uploadImage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1598192553945L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1598108372851L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.service.MemberService");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("productCategory.model.vo.ProductCategory");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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

      out.write('\r');
      out.write('\n');
      out.write('	');
String msg = (String)request.getAttribute("msg"); 
	String brand = (String)request.getAttribute("brand");
	String productCode = (String)request.getAttribute("productCode");
	String category = (String)request.getAttribute("category");
	
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Member memberLoggedIn = (Member)session.getAttribute("memberLoggedIn");

	//쿠키확인 : 요청과 함께 전송된 쿠키확인
	boolean saveId = false;
	String memberId = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			String key = c.getName();
			String value = c.getValue();
			System.out.println(key + " = " + value);
	
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>ELECSEMIPROJECT</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\" https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("   \t<link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.js\" integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" $(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#loginL\").submit(function(){\r\n");
      out.write("\t\t\tvar $memberId = $(\"#memberId\");\r\n");
      out.write("\t\t\tvar $password = $(\"#password\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(/^.{4,}$/.test($memberId.val()) == false){\r\n");
      out.write("\t\t\t\talert(\"유효한 아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(/^.{4,}$/.test($password.val()) == false){\r\n");
      out.write("\t\t\t\talert(\"유효한 패스워드를 입력하세요.\");\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t \r\n");
      out.write("\r\n");
      out.write("    //login\r\n");
      out.write("     $(document).ready(function(){\r\n");
      out.write("       $(\"#login\").click(function(){\r\n");
      out.write("         $(\".login-form\").toggleClass('active')\r\n");
      out.write("\r\n");
      out.write("       })\r\n");
      out.write("     })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("      $(\"#search\").click(function(){\r\n");
      out.write("        $(\".menuA\").toggleClass('hide-item')\r\n");
      out.write("        $('.search-form').toggleClass('active')\r\n");
      out.write("      })\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write(" \r\n");
      out.write("  <!--header 시작-->\r\n");
      out.write("  <div id=\"container\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"won\">\r\n");
      out.write("    <header id=\"header\">           \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("      <!-- nav :  메뉴, 네비게이션등을 제공하는 태그. header, aside, footer등 자유롭게 사용가능 -->\r\n");
      out.write("      <nav class=\"w_na\" style=\"margin-top: 10px;\">\r\n");
      out.write("        <ul class=\"w_u\">\r\n");
      out.write("          <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\" ><class class=\"fa fa-bolt fa-2x\" aria-hidden=\"true\"></class></i></a></li>\r\n");
      out.write("          <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/list?category=N\" class=\"menuA\">Product</a>        \r\n");
      out.write("            <ul class=\"w_u\">\r\n");
      out.write("               <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/list?category=N\"class=\"menuA\" ><i class=\"fa fa-laptop\" aria-hidden=\"true\"></i>Laptop</a></li>\r\n");
      out.write("              <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/list?category=P\" class=\"menuA\"><i class=\"fa fa-mobile fa-2x\" aria-hidden=\"true\"></i>Phone</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         \r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/cList?brand=APPLE\" class=\"menuA\">Brand</a>           \r\n");
      out.write("              <ul class=\"w_u\">\r\n");
      out.write("\t           \t   <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/cList?brand=APPLE\" class=\"menuA\"><i class=\"fa fa-apple\" aria-hidden=\"true\"></i>Apple </a></li> \r\n");
      out.write("\t               <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/cList?brand=SAMSUNG\" class=\"menuA\"><i class=\"fa fa-scribd\" aria-hidden=\"true\"></i>Samsung </a></li> \r\n");
      out.write("\t               <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/product/cList?brand=LG\"class=\"menuA\"><i class=\"fa fa-gg\" aria-hidden=\"true\"></i>LG </a></li>\r\n");
      out.write("              </ul>       \r\n");
      out.write("          \r\n");
      out.write("          </li>  \r\n");
      out.write("          \t");
 if(memberLoggedIn != null 
					   && MemberService.SELLER_MEMBER_ROLE.equals(memberLoggedIn.getMemberRole())){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"w_l\" ><a href=\"");
      out.print( request.getContextPath() );
      out.write("/seller/list?memberId=");
      out.print(memberLoggedIn.getMemberName() );
      out.write("\" class=\"menuA\">SellerList</a></li>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\t\t\t\t\t\r\n");
      out.write("          \t\t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/cart/view\"class=\"menuA\">Cart</a></li>\r\n");
      out.write("            ");
 }  
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          \t");
 if(memberLoggedIn != null 
					   && MemberService.ADMIN_MEMBER_ROLE.equals(memberLoggedIn.getMemberRole())){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/admin/memberList\" class=\"menuA\">AdminPage</a>\r\n");
      out.write("\t\t\t\t\t <ul class=\"w_u\">\r\n");
      out.write("              \t\t\t <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/admin/memberList\" class=\"menuA\">MemberList </a></li> \r\n");
      out.write("              \t\t\t\t <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/admin/stateView\" class=\"menuA\">StateView </a></li> \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("          <li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\" class=\"menuA\">MyPage</a>\r\n");
      out.write("         <ul class=\"w_u\">\r\n");
      out.write("            ");
if(memberLoggedIn != null) {
      out.write("\r\n");
      out.write("            \t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/orderList\" class=\"menuA\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i>List </a></li>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("            \t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\" class=\"menuA\" onclick=\"alert('로그인 후에 이용하실 수 있습니다!');\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i>List </a></li>\r\n");
      out.write("            ");
} 
      out.write(" \r\n");
      out.write("            ");
 if(memberLoggedIn == null){ 
      out.write("\t\r\n");
      out.write("            \t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/member/view?memberId=\" class=\"menuA\"><i class=\"fa fa-info\" aria-hidden=\"true\"></i> Info </a></li>  \r\n");
      out.write("           ");
 } else { 
      out.write("\r\n");
      out.write("            \t<li class=\"w_l\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/member/view?memberId=");
      out.print( memberLoggedIn.getMemberId() );
      out.write("\" class=\"menuA\"><i class=\"fa fa-info\" aria-hidden=\"true\"></i> Info </a></li>  \r\n");
      out.write("          ");
 } 
      out.write("\t\r\n");
      out.write("           </ul>    \r\n");
      out.write("          </li> \r\n");
      out.write("          ");
 }  
      out.write("\r\n");
      out.write("          <!-- <li class=\"w_l\"><a href=\"#\" id=\"search\">Search</a></li> -->\r\n");
      out.write("          \r\n");
      out.write("          \t");
 if(memberLoggedIn != null) { 
      out.write(" \r\n");
      out.write("\t\t\t\t\t<span style =\"color : white;\">");
      out.print( memberLoggedIn.getMemberId() );
      out.write(" 님 \r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"로그아웃\" id =\"log-out\"onclick=\"location.href = '");
      out.print( request.getContextPath() );
      out.write("/member/logout';\"/>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t \t\t");
} else{
      out.write("\r\n");
      out.write("         \t\t <li class=\"w_l\"><a href=\"#\" id=\"login\">Login</a></li>\r\n");
      out.write("          \r\n");
      out.write("                    \r\n");
      out.write("            ");
} 
      out.write("              \r\n");
      out.write("                   \t\r\n");
      out.write("\t\t      \r\n");
      out.write("        </ul>   \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("          <div id=\"search-product\" class=\"search-form\">\r\n");
      out.write("          <form action=\"");
      out.print( request.getContextPath() );
      out.write("/productFinder\" >\r\n");
      out.write("           <input type=\"text\" placeholder=\"Search\" name=\"searchKeyword\">\r\n");
      out.write("             \r\n");
      out.write("                  <button id=\"w_sfB\"><i class=\"fa fa-search\" aria-hidden=\"true\"  onclick=\"");
      out.print( request.getContextPath() );
      out.write("/ProductCategory\"></i></button>\r\n");
      out.write("\t\t\t</form> \r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-form\">\r\n");
 if(memberLoggedIn == null){ 
      out.write("\r\n");
      out.write("          <form id=\"loginL\" \r\n");
      out.write("          action=\"");
      out.print( request.getContextPath() );
      out.write("/member/login\" \r\n");
      out.write("          method=\"POST\"\t\r\n");
      out.write("          class=\"input-group\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" name=\"memberId\" class=\"input-field\" placeholder=\"User ID\" required >\r\n");
      out.write("           \r\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"input-field\" placeholder=\"Enter Password\" required>\r\n");
      out.write("            <!-- <input type=\"checkbox\" class=\"check-box\"><span> Remember Password </span> -->\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("          \r\n");
      out.write("            <button type=\"submit\" class=\"submit-btn\">LogIn</button>\r\n");
      out.write("              \r\n");
      out.write("        </form>          \r\n");
      out.write("\t      <button type=\"submit\" class=\"submit-btn\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/enroll';\">Register</button>\r\n");
      out.write("             \r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("      ");
 } 
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <div style=\"height:70px; background-color:#000000d9; width: 1280px; \"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <section id=\"content_WH\" >\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/form.css\" />\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("   ");
if(msg!=null){
      out.write("\r\n");
      out.write("   \talert('");
      out.print(msg);
      out.write("');\r\n");
      out.write("   ");
}
      out.write("\r\n");
      out.write("}); \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("        $(\"input[type=file]\").on(\"change\", handleImgFileSelect);\r\n");
      out.write("    }); \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function handleImgFileSelect(e) {\r\n");
      out.write("\r\n");
      out.write("        var $img;\r\n");
      out.write("        var $span;\r\n");
      out.write("        if(e.target == thum){\r\n");
      out.write("            $img = $(\"#img_thum\");\r\n");
      out.write("            $span = $(\"#span_thum\");\r\n");
      out.write("        }else if(e.target == adImg1){\r\n");
      out.write("            $img = $(\"#img_adImg1\");\r\n");
      out.write("            $span = $(\"#span_adImg1\");\r\n");
      out.write("        }else{\r\n");
      out.write("            $img = $(\"#img_adImg2\");\r\n");
      out.write("            $span = $(\"#span_adImg2\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var files = e.target.files;\r\n");
      out.write("        var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("\r\n");
      out.write("        filesArr.forEach(function(f) {\r\n");
      out.write("\r\n");
      out.write("            if(!f.type.match(\"image.*\")) {\r\n");
      out.write("                alert(\"이미지만 올릴 수 있습니다.\"+f.name);\r\n");
      out.write("                $span.css(\"opacity\", \"1\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            $span.css(\"opacity\", \"0\");\r\n");
      out.write("\r\n");
      out.write("            sel_file = f;\r\n");
      out.write("\r\n");
      out.write("            var reader = new FileReader();\r\n");
      out.write("            reader.onload = function(e) {\r\n");
      out.write("                $img.attr(\"src\", e.target.result);\r\n");
      out.write("            }\r\n");
      out.write("            reader.readAsDataURL(f);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    \t$(\"[name=imageUpload]\").submit(function(){\r\n");
      out.write("    \t\tif(confirm(\"이미지를 등록하시겠습니까?\"))\r\n");
      out.write("    \t\t\treturn true;\r\n");
      out.write("    \t\telse\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t});\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"contentB\">\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/DJ/st1.jpg\"\r\n");
      out.write("\t\tclass=\"imBB\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/product/uploadImage\" method=\"POST\" name=\"imageUpload\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"brand\" value=\"");
      out.print(brand);
      out.write("\" />\r\n");
      out.write("\t\t<div class=\"inaveB\">\r\n");
      out.write("\t\t\t<h2 class=\"SumB\">썸네일 등록</h2>\r\n");
      out.write("\t\t\t<input type=\"file\" accept=\"image/*\" class=\"img-btnB\" name=\"thum\"\r\n");
      out.write("\t\t\t\tid=\"thum\"> <span id=\"span_thum\"></span>\r\n");
      out.write("\t\t\t<div class=\"thum_wrap\">\r\n");
      out.write("\t\t\t\t<img id=\"img_thum\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h2 class=\"SumB\">광고이미지 등록</h2>\r\n");
      out.write("\t\t\t<input type=\"file\" accept=\"image/*\" class=\"img-btnB\" name=\"adImg1\"\r\n");
      out.write("\t\t\t\tid=\"adImg1\"><span id=\"span_adImg1\"></span>\r\n");
      out.write("\t\t\t<div class=\"adImg1_wrap\">\r\n");
      out.write("\t\t\t\t<img id=\"img_adImg1\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h2 class=\"SumB\">광고이미지 등록</h2>\r\n");
      out.write("\t\t\t<input type=\"file\" accept=\"image/*\" class=\"img-btnB\" name=\"adImg2\"\r\n");
      out.write("\t\t\t\tid=\"adImg2\"><span id=\"span_adImg2\"></span>\r\n");
      out.write("\t\t\t<div class=\"adImg2_wrap\">\r\n");
      out.write("\t\t\t\t<img id=\"img_adImg2\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<button type=\"submit\" id=\"submitB\">이미지 등록</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("<div>\r\n");
      out.write("\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t<p style=\"color:white;\">&lt;Copyright 1998-2020 <strong>KH정보교육원</strong>. All rights reserved.&gt;</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
