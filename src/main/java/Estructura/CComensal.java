/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import EDL.ListaDE;

/**
 *
 * @author Mau
 */
public class CComensal extends Cuenta{
public ListaDE<String> seguidores;
    public ListaDE<String> seguir;
    public ListaDE<PComensal> publicaciones;
    // constructor
    public CComensal(){
        tipo = "comensal";
    }
    public CComensal(String nombre, String usuario, String contraseña, String email){
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;      
        tipo = "comensal";
    }    
    public void seguir(String nombre){
        seguir.add(nombre);// cambiar a solo escribir en archivos
    }
    public void deleteSeguir(String nombre){
        seguir.eliminar(nombre);
    }
    
    public void  seguidor(String nombre){
        seguidores.add(nombre);        
    }
        public void deleteSeguidor(String nombre){
        seguidores.eliminar(nombre);
    }
    
    
    public String toString(){
        return nombre +"-"+usuario+"-"+contraseña+"-"+email+"-"+tipo;
    }    
}
