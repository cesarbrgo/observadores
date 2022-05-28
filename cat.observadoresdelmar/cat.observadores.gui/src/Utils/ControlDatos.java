package Utils;
//package javamysql;
import Entitites.ModeloDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * ControlDatos
 * la clase control de datos sirve para hacer un control de los datos previo a inserción de los datos a la base de datos
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */

public class ControlDatos {
    private Connectat conectar;
    private ModeloDatos modelo;
    private Connection con;


    public ControlDatos(){
        conectar = new Connectat();
        modelo = new ModeloDatos();
    }
    /**
     * insertar
     * El metodo insertar introduce una serie de parametros de quien lo invoca para  inserccion de estos en la base de datos
     * con un try except  intenta inserir en con un preparestatment todos los get del objeto modelo, que en este caso es
     * el modelo generico de objeto. En caso de insercion correcta de los datos nos devolvera que se insertaron correctamente,
     * en caso contrario, nos dara error.
     * @return void
     */
    public void insertar(String fecha, String latitud, String longitud, String especie, String profundidad, String abundancia, String sizefish, String selecthabitat, String s, String sizefish1){
        PreparedStatement ps;
        String sql;
        modelo.setFecha(fecha);
        modelo.setLatitud(latitud);
        modelo.setLongitud(longitud);
        modelo.setEspecie(especie);
        modelo.setProfundidad(profundidad);
        modelo.setAbundancia(abundancia);
        modelo.setSize(sizefish);
        modelo.setHabitat(selecthabitat);

        try{
            con = conectar.getConexion();
            sql = "insert into datos(fecha, latitud, longitud, especie, profundidad, abundancia, size, habitat) values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, modelo.getFecha());
            ps.setString(2, modelo.getLatitud());
            ps.setString(3, modelo.getLongitud());
            ps.setString(4, modelo.getEspecie());
            ps.setString(5, modelo.getProfundidad());
            ps.setString(6, modelo.getAbundancia());
            ps.setString(7, modelo.getSize());
            ps.setString(8,modelo.getSize());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}