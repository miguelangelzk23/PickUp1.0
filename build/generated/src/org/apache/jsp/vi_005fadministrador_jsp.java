package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vi_005fadministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <title>Administrador pick up</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light \" id=\"nav_user\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" id=\"logo\">PickUp</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Adminnistrador<span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("   \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\" id=\"nombre\">Miguel</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("         <li class=\"nav-item dropdown\" id=\"colap\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fas fa-user-cog\" id=\"icon_confi\"></i>\n");
      out.write("        </a>\n");
      out.write("          <div class=\"dropdown-menu \" aria-labelledby=\"navbarDropdownMenuLink\" id=\"contenedor_congi\">\n");
      out.write("         \n");
      out.write("          <a class=\"dropdown-item\" href=\"#\"><form action=\"con_cerrar\">\n");
      out.write("                  <input type=\"submit\" name=\"cerrar\" value=\" cerrar session\" style=\"background-color: #33d9b2; color: #ffffff;border: none; width: 100%;text-align: end\">\n");
      out.write("        </form></a>\n");
      out.write("          \n");
      out.write("          </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("         <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#nuevoUsuario\">\n");
      out.write("         + Nuevo \n");
      out.write("         </button>\n");
      out.write("        <a href=\"mensajero/vi_index_mensajeros.jsp\"> <button>Mensajeros</button> </a>\n");
      out.write("        <a href=\"proveedor/index_proveedor.jsp\"><button>Restaurantes</button> </a>\n");
      out.write("        <a> <button>Usuarios</button> </a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"nuevoUsuario\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Registro nuevo Usuario</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"con_usuarios\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label for=\"\">Nombre de Usuario</label>\n");
      out.write("                     <input type=\"text\" name=\"usu_nombre\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\" ej: miguelzk23\">\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label for=\"\">Contraseña</label>\n");
      out.write("                     <input type=\"password\" name=\"usu_password\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"******\">\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label for=\"exampleInputEmail1\">Confirmar contraseña</label>\n");
      out.write("                     <input type=\"password\" name=\"usu_confirmar\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"******\">\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label for=\"\">Rol</label>\n");
      out.write("                     <select id=\"\" class=\"form-control\" name=\"usu_rol\">\n");
      out.write("                         <option value=\"Mensajero\">Mensajero</option>\n");
      out.write("                         <option value=\"Proveedor\">Proveedor</option>\n");
      out.write("                         <option value=\"Administrador\">Administrador</option>\n");
      out.write("                    </select>\n");
      out.write("                     <input type=\"hidden\" name=\"usu_estado\" value=\"Activo\">\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                     <label for=\"exampleInputPassword1\">Foto</label>\n");
      out.write("                     <input type=\"text\" name=\"usu_foto\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"foto\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" name=\"registrar_usuario\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
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
