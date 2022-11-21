package ModelLinkeTinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConeccaoDAO {

    public static Connection conectar() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        props.setProperty("ssl", "yes");
        String URL_SERVIDOR = "jdbc:postgresql://localhost:5432/postgres";

        return DriverManager.getConnection(URL_SERVIDOR, props);
    }
     public static void desconectar(Connection conn) throws SQLException{
            if (conn != null) {
                conn.close();
                }else {
                System.out.println("Verifique a sua conexão com o Banco de Dados");
        }
    }
}