package org.apache.jsp.proveedor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Mod_tipo_proveedor;
import modelo.Mod_tipo_proveedor_get_set;
import modelo.Mod_usuarios;
import java.util.ArrayList;
import modelo.Mod_usuarios_get_set;

public final class insert_005fproveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("       ");

        String nombre_usu;
        HttpSession nom_usuario = request.getSession(false);
        nombre_usu = (String)nom_usuario.getAttribute("nom_user");
       
      out.write("\n");
      out.write("    <body>\n");
      out.write("           <nav class=\"navbar navbar-expand-lg navbar-light \" id=\"nav_user\">\n");
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
      out.write("        ");

            
         ArrayList<Mod_usuarios_get_set> listaProveedor = new ArrayList<>();
         Mod_usuarios_get_set datosProveedor = new Mod_usuarios_get_set();
         Mod_usuarios consultaUno = new Mod_usuarios();
         listaProveedor = consultaUno.consultarUnUsuario(nombre_usu);
         for (int i = 0 ; i<listaProveedor.size();i++)
         {
             datosProveedor = listaProveedor.get(i);
             
      out.write("\n");
      out.write("           \n");
      out.write("             <hr>\n");
      out.write("             \n");
      out.write("              <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("             <h3> Registrar Mensajero</h3>\n");
      out.write("             <form action=\"../con_mensajeros\" method=\"POST\">\n");
      out.write("    \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("    <label for=\"\">men_usu_id</label>\n");
      out.write("    <input class=\"form-control\" type=\"hidden\" name=\"men_usu_id\" value=\"");
      out.print(datosProveedor.getUsu_id());
      out.write("\">\n");
      out.write("    </div>             \n");
      out.write("            \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Nombre de usuario</label>\n");
      out.write("    <input class=\"form-control\" type=\"text\" placeholder=\"");
      out.print(datosProveedor.getUsu_nombre());
      out.write("\" readonly>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Nit</label>\n");
      out.write("    <input type=\"text\" name=\"prove_nit\" class=\"form-control\" id=\"insert_mensajero\" aria-describedby=\"emailHelp\" placeholder=\"11,338,854-3\" >\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Nombre Proveedor</label>\n");
      out.write("    <input type=\"number\"  name=\"prove_nombre\" class=\"form-control\" id=\"insert_mensajero\" aria-describedby=\"emailHelp\" placeholder=\"Restaurante bar la Carreta\" >\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Direccion</label>\n");
      out.write("    <input type=\"text\" name=\"prove_direccion\" class=\"form-control\" id=\"insert_mensajero\" aria-describedby=\"emailHelp\" placeholder=\"Calle 5 # 21 -30\" >\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Celular</label>\n");
      out.write("    <input type=\"text\" name=\"prove_celular\" class=\"form-control\" id=\"insert_mensajero\" aria-describedby=\"emailHelp\" placeholder=\"3202363690\" >\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"\">Email</label>\n");
      out.write("    <input type=\"text\" name=\"prove_email\" class=\"form-control\" id=\"insert_mensajero\" aria-describedby=\"emailHelp\" placeholder=\"mensajero@gmail.com\" >\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"form-group \">\n");
      out.write("        ");

           ArrayList<Mod_tipo_proveedor_get_set> listaTipoProvedor = new ArrayList<>();
           Mod_tipo_proveedor_get_set datosTipo = new Mod_tipo_proveedor_get_set();
           Mod_tipo_proveedor consultaTipo = new  Mod_tipo_proveedor();
           listaTipoProvedor  = consultaTipo.consultarTipoProveedor();
           for(int j = 0; j < listaTipoProvedor.size();j++)
           {
               datosTipo = listaTipoProvedor.get(j);
               
      out.write("\n");
      out.write("               <label for=\"\">Categoria del Proveedor</label>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <select class=\"form-control\" name=\"usu_estado\" >\n");
      out.write("        <option value=\"");
      out.print(datosTipo.getTipo_codigo());
      out.write('"');
      out.write('>');
      out.print(datosTipo.getTipo_nombre());
      out.write("</option>\n");
      out.write("        \n");
      out.write("    </select>\n");
      out.write("           ");
    
           }
           
      out.write("\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <button type=\"submit\" name=\"registrar_proveedor\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("        ");
     
         }
        
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
