
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.Mod_usuarios;
import modelo.Mod_usuarios_get_set;

/**
 *
 * @author usuario
 */
@WebServlet(name = "con_usuarios", urlPatterns = {"/con_usuarios"})
public class con_usuarios extends HttpServlet {
    
    private String usu_nombre;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if(request.getParameter("registrar_usuario") != null)
        {
            insertar_Usuario(request, response);
        }
        
        
    }
    
     protected void insertar_Usuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String usu_nom;
        
        boolean dat;
       
         
        String usu_password,usu_rol,usu_estado,usu_foto,usu_confirma;
        
        usu_nombre = request.getParameter("usu_nombre");
        usu_password = request.getParameter("usu_password");
        usu_rol = request.getParameter("usu_rol");
        usu_estado = request.getParameter("usu_estado");
        usu_foto = request.getParameter("usu_foto");
        
         Mod_usuarios_get_set datos = new Mod_usuarios_get_set(usu_nombre, usu_password, usu_rol, usu_estado, usu_foto);
         Mod_usuarios inserta = new Mod_usuarios();
         dat = inserta.insertarUusario(datos);
         
         if(dat)
         {
             if(usu_rol.equals("Mensajero"))
             {
                 
                 JOptionPane.showMessageDialog(null, "enviando datos");
                
                 HttpSession nom_usuario = request.getSession(true);
                 nom_usuario.setAttribute("nom_user", usu_nombre);
                 
                 response.sendRedirect("mensajero/insert_mensajero.jsp");
             }
             else if (usu_rol.equals("administrador"))
             {
                 response.sendRedirect("vi_administrador.jsp");
             }
         }
         
        
     }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
