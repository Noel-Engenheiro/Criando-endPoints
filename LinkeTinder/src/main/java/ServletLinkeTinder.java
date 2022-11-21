import ModelLinkeTinder.ConeccaoDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(urlPatterns = "/candidatoslinketinder")
public class ServletLinkeTinder extends HttpServlet {

     ConeccaoDAO conectar = new ConeccaoDAO();
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter print = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123" );
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM candidato");
            while (result.next()){
                String nome = result.getString("nome");
                print.println(nome);
            }
            conn.close();
        }catch (Exception e){
            print.println("Erro");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeStr = request.getParameter("nome");
        String sobrenomeStr = request.getParameter("sobrenome");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Olá<h3>"+ nomeStr + " "+sobrenomeStr + " ");
    }
}
