package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Conectat
 * La clase Connectat es una clase util que sirve para generar una conexion con el servidor de bbdd y comprovar que se
 * puedan insertar los datos correctametne
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */
public class Connectat {
    /**
     * Frase corta descriptiva
     * conexió nos permitira conectar con una base de datos que hayaos descrito en get conection en caso que funcione
     * nos devolvera conectat, en caso cntrario excepcion.
     * @return null
     * @exception error descrito por java
     */
        public static Connection Conexio(){


            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/observadors","root","usuari");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("show databases;");
                System.out.println("Connectat");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return null;
        }
    /**
     * getConection
     * El metodo get conection conecta con la base de datos  especifica para preparar la insercción de datos
     *      * @return  objeto connection que por defecto es null
     * @exception error con error mensage generado por java
     */
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/observadors","root","usuari");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
