package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Entities.User;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/admin/Header.jsp");
    _jspx_dependants.add("/admin/Slidebar.jsp");
    _jspx_dependants.add("/admin/Footer.jsp");
    _jspx_dependants.add("/admin/Notify.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"online shopping website using javaEE\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Your Cart</title>\r\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"../js/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"../js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->       \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"../images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header id=\"header\"><!--header-->\r\n");
      out.write("            <div class=\"header_top\"><!--header_top-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"contactinfo\">\r\n");
      out.write("                                <ul class=\"nav nav-pills\">\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +84 35 373 8125</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i>KVTGroup@gmail.com</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"social-icons pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header_top-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"logo pull-left\">\r\n");
      out.write("                                <a href=\"index.jsp\"><img src=\"../images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <div class=\"shop-menu pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a href=\"../\"><i class=\"fa fa-ravelry\"></i> Site</a></li>\r\n");
      out.write("                                    <li><a href=\"logout1\"><i class=\"fa fa-lock\"></i> Logout</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-middle-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mainmenu pull-left\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("                                    <li><a href=\"index.jsp\" class=\"active\">Panel</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-bottom-->\r\n");
      out.write("        </header><!--/header-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"cart_items\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("       \n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"left-sidebar\">\n");
      out.write("                    <h2>Admin Panel</h2>\n");
      out.write("                    <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminProductServlet\">Products</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminUserServlet\">Users</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminCategoryServlet\">Category</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminHistoryServlet\">History</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"SlidersShow\">Slider</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"charge.jsp\">Scratch Cards</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"ShowAdvertisement\">Ads</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div><!--/category-products-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-9 padding-right\">\r\n");
      out.write("            <h2>\r\n");
      out.write("                Products\r\n");
      out.write("                <a class=\"btn tbn-default\" style=\"float: right\" href=\"AddProduct.jsp\">New Product</a>\r\n");
      out.write("            </h2>\r\n");
      out.write("            <div class=\"table-responsive cart_info\">\r\n");
      out.write("                <table class=\"table table-condensed\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr class=\"cart_menu\">\r\n");
      out.write("                            <td class=\"image\">Item</td>\r\n");
      out.write("                            <td class=\"description\"></td>\r\n");
      out.write("                            <td class=\"price\">Price</td>\r\n");
      out.write("                            <td class=\"quantity\">Quantity</td>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\"><!--Footer-->\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"companyinfo\">\n");
      out.write("                        <h2><span>KVT</span>Group</h2>\n");
      out.write("                        <p>Address: 600, Nguyen Van Cu street, An Binh ward, Ninh Kieu district, Can Tho city\n");
      out.write("                            Phone: +84 35.373.8125\n");
      out.write("                            Email:KTV_Group6@gmail.com</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"address\">\n");
      out.write("                        <img src=\"../images/home/map.png\" alt=\"\" />\n");
      out.write("                        <p>VietNam , CanTho</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <p class=\"pull-left\">FPT University</p>\n");
      out.write("                <p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"https://www.facebook.com/profile.php?id=100007033081682\">KVT</a></span> | Developed By KVT Team </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer><!--/Footer-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("<script src=\"js/price-range.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/myLoginValidation.js\"></script>\n");
      out.write("<script src=\"js/bootstrap-notify.min.js\"></script>\n");
      out.write("<script src=\"js/notify.js\"></script>\n");
      out.write("<script src=\"js/addtocart.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("    ");
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty requestScope.listOfProducts}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listOfProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td class=\"cart_product\">\r\n");
          out.write("                                        <a href=\"\"><img src=\"../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"/></a>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td class=\"cart_description\">\r\n");
          out.write("                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td class=\"cart_price\">\r\n");
          out.write("                                        <h4>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td class=\"cart_quantity\">\r\n");
          out.write("                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td class=\"cart_delete\">\r\n");
          out.write("                                        <a class=\"cart_quantity_delete\" href=\"DeleteProduct?pId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-times\"></i></a>\r\n");
          out.write("                                        <a class=\"cart_quantity_delete\" href=\"AdminProduct?pId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-pencil\"></i></a>\r\n");
          out.write("                                        <a class=\"cart_quantity_delete\" href=\"AddSlider?pId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-star\"></i></a>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty AlertMessage}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <script>showNotification('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AlertMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AlertType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("');</script>\n");
        out.write("    ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_remove_0.setVar("AlertMessage");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}
