/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025c4;

import javax.swing.JOptionPane;

/**
 * asdsad asd sa sadas
 * asdsadasd 
 * asdasd a
 * @author viti
 */
public class Persona {
    //atributos
    public int edad;
    public String nacionalidad;
    public double altura;
    private String colorDePiel;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String genero;
    int id;
    
    /**
     * Esto es una funcion que me indica si puedo correr
     * @return retorna correcto si la persona es menor 60 anio
     */
    public boolean puedeCorrer(){
        boolean resultado=false;
        if (edad < 60){
            resultado=true;
        }
        return resultado;
    
    }
    
    /**
     * Indica si se una persona habla dependiendo de su naciondalidad
     * @return sadjsadjkdsa
     */
    public String hablar(){
        String resultado="";
        if (nacionalidad.compareTo("Tico")==0){
            resultado="MAE";
        }
        return resultado;
    }
    
    /**
     * Funcion indica si la persona estudia o no 
     * @param materia la materia que esta estudiando
     */
    public void estudiar(String materia){
        if (materia == null || materia.compareTo("")==0){
            JOptionPane.showConfirmDialog(null, "NO ME DIO LA GANA ESTUDIAR Y DEBERIA DE TENER TERNER 13 * 4 HORAS ESTUDIADAS");
        }else
            JOptionPane.showConfirmDialog(null, "Estoy estudiando "+ materia);
        
    }
    
}
