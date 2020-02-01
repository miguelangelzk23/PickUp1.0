package org.apache.jsp.mensajero;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Mod_mensajeros;
import modelo.Mod_mensajeros_get_set;
import java.util.ArrayList;

public final class vi_005findex_005fmensajeros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">  \n");
      out.write("         <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("        <title>index mensajero</title>\n");
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
      out.write("        \n");
      out.write("        <div class=\"container\" >\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        <table class=\"table\" id=\"tabla_mensajero\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"8\">Datos mensajeros</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Cedula</th>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>direccion</th>\n");
      out.write("                <th>Barrio</th>\n");
      out.write("                <th>Descripcion</th>\n");
      out.write("                <th>Telefono</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Confi</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                ArrayList<Mod_mensajeros_get_set> listaMensajeros = new ArrayList<>();
                Mod_mensajeros_get_set datos_mensajeros = new Mod_mensajeros_get_set();
                Mod_mensajeros consulta_mensajero = new Mod_mensajeros();
                listaMensajeros=consulta_mensajero.consultarMensajero();
                
                for(int j= 0; j < listaMensajeros.size();j++)
                {
                    datos_mensajeros = listaMensajeros.get(j);
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_cedula());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_nombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_direccion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_barrio());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_descripcion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_telefono());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(datos_mensajeros.getMen_email());
      out.write("</td>\n");
      out.write("                <form action=\"editar_mensajero.jsp\">\n");
      out.write("                    <input type=\"hidden\" name=\"men_id\" value=\"");
      out.print(datos_mensajeros.getMen_id());
      out.write("\">\n");
      out.write("                    <td> <button type=\"submit\" name=\"editar_mensajero\" style=\"background-color: #ffffff\"> <i class=\"fas fa-cog\"></i></button></td>\n");
      out.write("                </form>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
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
