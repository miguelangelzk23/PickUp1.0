
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.Mod_mensajeros;
import modelo.Mod_mensajeros_get_set;
import modelo.Mod_show_mensajero_get_set;

/**
 *
 * @author usuario
 */
@WebServlet(name = "con_mensajeros", urlPatterns = {"/con_mensajeros"})
public class con_mensajeros extends HttpServlet {

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
        
        if(request.getParameter("registrar_mensajero") != null)
        {
            insertarMensajero(request, response);
        }
        if(request.getParameter("editar_mensajero") != null)
        {
            editar_mensajero(request, response);
        }
        
    }
    
     protected void insertarMensajero(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String men_cedula,men_nombre,men_direccion,men_barrio,men_descripcion,men_telefono,men_email,men_usu_id;
        boolean dat;
        men_cedula = request.getParameter("men_cedula");
        men_nombre = request.getParameter("men_nombre");
        men_direccion = request.getParameter("men_direccion");
        men_barrio = request.getParameter("men_barrio");
        men_descripcion = request.getParameter("men_descripcion");
        men_telefono = request.getParameter("men_celular");
        men_email = request.getParameter("men_email");
        men_usu_id = request.getParameter("men_usu_id");
        
         Mod_mensajeros_get_set datos_mensajeros = new Mod_mensajeros_get_set(men_cedula, men_nombre, men_direccion, men_barrio, men_descripcion, men_telefono, men_email, men_usu_id);
         Mod_mensajeros inserta = new Mod_mensajeros();
         dat = inserta.insertarMensajero(datos_mensajeros);
         
         if(dat)
         {
             JOptionPane.showMessageDialog(null, "datos registrados");
             response.sendRedirect("mensajero/vi_index_mensajeros.jsp");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "datos de mensajero no registrados");
             response.sendRedirect("vi_administrador.jsp");
         }
        
        
    }
      protected void editar_mensajero(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
            int men_id;
           String usu_foto,usu_estado,men_nombre,men_direccion,men_barrio,men_descripcion,men_telefono,men_email;
        boolean dat;
        
        usu_foto = request.getParameter("usu_foto");
        usu_estado = request.getParameter("usu_estado");
        men_nombre = request.getParameter("men_nombre");
        men_direccion = request.getParameter("men_direccion");
        men_barrio = request.getParameter("men_barrio");
        men_descripcion = request.getParameter("men_descripcion");
        men_telefono = request.getParameter("men_celular");
        men_email = request.getParameter("men_email");
        men_id = Integer.parseInt(request.getParameter("men_id"));
        
        Mod_show_mensajero_get_set datos_mensajero = new Mod_show_mensajero_get_set(men_id, usu_estado, usu_foto, men_nombre, men_direccion, men_barrio, men_descripcion, men_telefono, men_email);
        Mod_mensajeros update_men = new Mod_mensajeros();
        dat = update_men.actualizarMensajero(datos_mensajero);
        
        if(dat)
        {
            JOptionPane.showMessageDialog(null, "mensajero actualizado correctamente");
            response.sendRedirect("mensajero/vi_index_mensajeros.jsp");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "mensajero no se actualizo");
            response.sendRedirect("mensajero/vi_index_mensajeros.jsp");
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
