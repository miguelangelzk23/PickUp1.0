/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.Mod_proveedor;
import modelo.Mod_proveedor_get_set;
import modelo.Mod_show_provedor_get_set;
import modelo.Mod_tipo_proveedor;
import modelo.Mod_tipo_proveedor_get_set;

/**
 *
 * @author usuario
 */
@WebServlet(name = "con_proveedor", urlPatterns = {"/con_proveedor"})
public class con_proveedor extends HttpServlet {

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
        
        if(request.getParameter("registrar_proveedor") != null)
        {
            insertar_proveedor(request, response);   
        }
         if(request.getParameter("editar_proveedor") != null)
        {
            actualizar_proveedor(request, response);
            JOptionPane.showMessageDialog(null, "esta llegando");
        }
        
        
    }
    
      protected void insertar_proveedor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String prove_nit,prove_nombre,prove_telefono,prove_email,prove_horario,prove_direccion;
        int prove_usu_id,prove_tipo_codigo;
        boolean dat;
        
        prove_nit = request.getParameter("prove_nit");
        prove_nombre = request.getParameter("prove_nombre");
        prove_telefono = request.getParameter("prove_email");
        prove_email = request.getParameter("prove_email");
        prove_horario = request.getParameter("prove_horario");
        prove_direccion = request.getParameter("prove_direccion");
        prove_usu_id = Integer.parseInt(request.getParameter("prove_usu_id"));
        prove_tipo_codigo =Integer.parseInt(request.getParameter("prove_tipo_codigo"));
        
      
        
          Mod_proveedor_get_set datosProveedor = new Mod_proveedor_get_set(prove_nit, prove_nombre, prove_telefono, prove_email, prove_horario, prove_direccion, prove_usu_id,prove_tipo_codigo);
          Mod_proveedor inserta = new Mod_proveedor();
          dat = inserta.insertarProveedor(datosProveedor);
          
        if(dat)
        {
            JOptionPane.showMessageDialog(null, "Proveedor Insertado");
            response.sendRedirect("proveedor/index_proveedor.jsp");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se registro el usuario");
             response.sendRedirect("proveedor/index_proveedor.jsp");
        }
        
    }
      
      
      protected void actualizar_proveedor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String prove_nit,prove_nombre,prove_telefono,prove_email,prove_horario,prove_direccion,usu_estado,usu_foto;
        int prove_usu_id,prove_tipo_codigo;
        boolean dat;
        
        usu_foto = request.getParameter("usu_foto");
        usu_estado = request.getParameter("usu_estado");
        prove_nit = request.getParameter("prove_nit");
        prove_nombre = request.getParameter("prove_nombre");
        prove_telefono = request.getParameter("prove_telefono");
        prove_email = request.getParameter("prove_email");
        prove_horario = request.getParameter("prove_horario");
        prove_direccion = request.getParameter("prove_direccion");
       // prove_usu_id = Integer.parseInt(request.getParameter("prove_usu_id"));
        prove_tipo_codigo =Integer.parseInt(request.getParameter("prove_tipo_codigo"));
        
      JOptionPane.showMessageDialog(null, "llegando al controlador");
        
            Mod_show_provedor_get_set datos_proveedor = new Mod_show_provedor_get_set(usu_estado, usu_foto, prove_nit, prove_nombre, prove_telefono, prove_email, prove_horario, prove_direccion, prove_tipo_codigo);
            Mod_proveedor update_prove = new Mod_proveedor();
            dat = update_prove.actualizarProveedor(datos_proveedor);
            
          
        if(dat)
        {
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado");
            response.sendRedirect("proveedor/index_proveedor.jsp");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se actualizo el proveedor");
             response.sendRedirect("proveedor/index_proveedor.jsp");
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
