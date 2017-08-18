package modelos;

import java.sql.*;

public class conexion {
    Connection cn;
    Statement st;

public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simulador","root","");
            if(cn != null){
                System.out.println("Conexion exitosa");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return cn;
    }
    
}


