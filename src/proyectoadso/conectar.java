/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoadso;

import java.sql.Connection;
import java.sql.DriverManager;
public class conectar {
    
    Connection conectar = null ;
    public Connection conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/pruebajava","root","");
    }catch(Exception e){
        System.out.print(e.getMessage());
    }
    return conectar;
    }
    
}
