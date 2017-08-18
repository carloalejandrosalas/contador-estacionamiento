package modelos;

import java.sql.*;

public class procesos {
    conexion conectar= new conexion();
    Connection cn  = conectar.conexion();

    public void entradaVehiculo(String vehiculo,String id_caso){
        try{
            PreparedStatement query = cn.prepareStatement("INSERT INTO entrada(id_caso,vehiculo_e) VALUES(?,?)");
            query.setString(1, id_caso);
            query.setString(2, vehiculo);
            
            
            query.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
    
    public void salidaVehiculo(String vehiculo,String id_caso){
        try{
            PreparedStatement query = cn.prepareStatement("INSERT INTO salida(id_caso,vehiculo_s) VALUES(?,?)");
            query.setString(1, id_caso);
            query.setString(2, vehiculo);
            
            query.executeUpdate();
            
            PreparedStatement actualizar = cn.prepareStatement("UPDATE entrada set usado_e= -1 where vehiculo_e='"+vehiculo+"' and id_caso="+id_caso+"");
            actualizar.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    

    public String registrarCaso(String nombre, String descripcion){
        String id_caso = "";
        try{
            PreparedStatement query = cn.prepareStatement("INSERT INTO caso(nombre_caso,descripcion_caso) VALUES(?,?)");
            query.setString(1, nombre);
            query.setString(2, descripcion);
            query.executeUpdate();
            
            Statement buscarId =  cn.createStatement();
            ResultSet respuesta = buscarId.executeQuery("SELECT LAST_INSERT_ID()");
            while (respuesta.next()){
                id_caso = respuesta.getString(1);
            }
            
            
            //System.out.println(id_caso);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }   
        
        return id_caso;
    }
    
    public String tiempoEntradaVehiculo(String id_caso){
        String entrada_vehiculo = "";
        try{
            Statement buscar_entrada =  cn.createStatement();
            ResultSet respuesta = buscar_entrada.executeQuery("SELECT fecha_registro from entrada where usado_e = 0 and id_caso='"+id_caso+"' ORDER BY fecha_registro LIMIT 1");
            while (respuesta.next()){
                entrada_vehiculo = respuesta.getString(1);
            }
            
            PreparedStatement actualizar = cn.prepareStatement("UPDATE entrada set usado_e= 1 where fecha_registro='"+entrada_vehiculo+"' and id_caso="+id_caso+"");
            actualizar.executeUpdate();
            //System.out.println(id_caso);
            entrada_vehiculo = entrada_vehiculo.substring(0, entrada_vehiculo.length()-2);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }   
        System.out.println(entrada_vehiculo);
        return entrada_vehiculo;
    }
    
    public String tiempoLiberarseEspacio(String tiempo_entrada,String tiempo_salida){
        System.out.println("Tiempo en liberarse");
        String tiempo_liberarse = "";
        try{
            Statement buscar_entrada =  cn.createStatement();
            ResultSet respuesta = buscar_entrada.executeQuery("SELECT timediff(now(),'"+tiempo_entrada+"')");
            while (respuesta.next()){
                tiempo_liberarse = respuesta.getString(1);
            }
            
            //System.out.println(id_caso);
            
            Statement buscar_salida =  cn.createStatement();
            ResultSet respuesta2 = buscar_salida.executeQuery("SELECT timediff('"+tiempo_salida+"','"+tiempo_liberarse+"')");
            while (respuesta.next()){
                tiempo_liberarse = respuesta2.getString(1);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }   
        System.out.println(tiempo_liberarse);
        return tiempo_liberarse;   
    }
    
    public String pasarSegundosTiempo(String segundos){
        System.out.println("==> Pasar segundos a tiempo");
        String tiempo="";
        System.out.println(segundos);
        segundos = segundos.substring(0, segundos.length()-2);
        try{
            Statement buscar_salida =  cn.createStatement();
            ResultSet respuesta = buscar_salida.executeQuery("SELECT SEC_TO_TIME("+segundos+")");
            while (respuesta.next()){
                 tiempo= respuesta.getString(1);
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
        return tiempo;
    }
    
    public String [] extraerTiempo(String tiempo){
        String hora="";
        String minuto="";
        String segundo="";
        
        try {
            Statement buscar_entrada =  cn.createStatement();
            ResultSet respuesta = buscar_entrada.executeQuery("SELECT hour('"+tiempo+"'),minute('"+tiempo+"'),second('"+tiempo+"')");
            while (respuesta.next()){
                hora = respuesta.getString(1);
                minuto = respuesta.getString(2);
                segundo = respuesta.getString(3);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        String [] datos= {hora,minuto,segundo};
        return datos;
    }
}


