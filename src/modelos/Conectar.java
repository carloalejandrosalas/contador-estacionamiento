package modelos;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/simulador";
    
    public Conectar(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            
            if(conn != null){
                System.out.println("Conexion exitosa");
            }
            else{
                System.out.println("Conexion fallida, revise que paso");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("Conexion terminada");
        }
    }
}
