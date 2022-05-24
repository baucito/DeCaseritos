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
public class CRestaurante {
public String rutaIcon;
    public ListaDE<PRestaurante> publicaciones;
    public ListaDE<String> zonas;
    
    
    public CRestaurante(){
        publicaciones = new ListaDE();
    }
    
    public void addZonas(String zona){
        zonas.add(zona);
    }
    
        
}
