
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    @WebServlet(urlPatterns = {"/Clave"})
public class Clave extends HttpServlet {
    
    int lado1 , lado2;
    float res;


    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        
        lado1 = Integer.parseInt(peticion.getParameter("lado1"));
        lado2 = Integer.parseInt(peticion.getParameter("lado2"));
        String opcion = peticion.getParameter("Ope");
        String figura = peticion.getParameter("Fig");

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());

        respuesta.setContentType("text/html;charset=UTF-8");
                   out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cuadrado(Area y Perimetro)</title>");  
            out.println("</head>");
            out.println("<body>");
            if(figura.equals("Cuadrado")){
            if(opcion.equals("Area")){
                res = lado1 * lado1;
            }if(opcion.equals("Perimetro")){
                res = lado1*4;
            }
            }
            else
                if(figura.equals("Rectangulo"))
                {
                     if(opcion.equals("Area")){
                res = lado1 * lado2;
            }if(opcion.equals("Perimetro")){
                res = lado1*2 + lado2*2;
            }
                }
            if(opcion.equals("Salir"))
            {
                out.close();
            }
            
            out.println("<h1>Servlet Cuadrado at " + peticion.getContextPath() + "</h1>");
            
            out.println("</body>");
            out.println("</html>");
        
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
  

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
