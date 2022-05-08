/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class operaciones {
    private double valor, resultado;
    private int Lista_monedas2,Lista_monedas;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getLista_monedas2() {
        return Lista_monedas2;
    }

    public void setLista_monedas2(int Lista_monedas2) {
        this.Lista_monedas2 = Lista_monedas2;
    }

    public int getLista_monedas() {
        return Lista_monedas;
    }

    public void setLista_monedas(int Lista_monedas) {
        this.Lista_monedas = Lista_monedas;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    //

    public operaciones() {
    }
    //metodos y operaciones
    
    public double convertir() {
        
        if (Lista_monedas2 ==0 && Lista_monedas ==1 ){ //de quetazales a dolares
        resultado = valor * 0.13;}
        else if (Lista_monedas2 ==0 && Lista_monedas ==0) {
            resultado = valor;
        }
        if (Lista_monedas2 ==0 && Lista_monedas ==2 ){ //de quetazales a euros
        resultado = valor * 0.12;}
        else if (Lista_monedas2 ==0 && Lista_monedas ==0) {
            resultado = valor;}
        
        if (Lista_monedas2 ==0 && Lista_monedas ==3 ){ //de quetazales a pesos
        resultado = valor * 2.63;}
        else if (Lista_monedas2 ==0 && Lista_monedas ==0) {
            resultado = valor;}
        
        
        // DOLARES
        
        
        if (Lista_monedas2 ==1 && Lista_monedas ==0 ){ //DE DOLARES A QUETZALES
        resultado = valor * 7.67;}
        else if (Lista_monedas2 ==1 && Lista_monedas ==1) {
            resultado = valor;
        }
        if (Lista_monedas2 ==1 && Lista_monedas ==2 ){ //DE DOLARES A EUROS
        resultado = valor * 0.85;}
        else if (Lista_monedas2 ==1 && Lista_monedas ==1) {
            resultado = valor;}
        
        if (Lista_monedas2 ==1 && Lista_monedas ==3 ){ //DOLARES A PESOS
        resultado = valor * 20.18;}
        else if (Lista_monedas2 ==1 && Lista_monedas ==1) {
            resultado = valor;}
        
        //EUROS
        
         if (Lista_monedas2 ==2 && Lista_monedas ==0 ){ //DE EUROS A QUETZALES
        resultado = valor * 8.08;}
        else if (Lista_monedas2 ==2 && Lista_monedas ==2) {
            resultado = valor;
        }
        if (Lista_monedas2 ==2 && Lista_monedas ==1 ){ //DE EUROS A DOLARES
        resultado = valor * 1.05;}
        else if (Lista_monedas2 ==2 && Lista_monedas ==2) {
            resultado = valor;}
        
        if (Lista_monedas2 ==2 && Lista_monedas ==3 ){ //DE EUROS A PESOS
        resultado = valor * 21.26;}
        else if (Lista_monedas2 ==2 && Lista_monedas ==2) {
            resultado = valor;}
        
        
        //PESOS
        
        if (Lista_monedas2 ==3 && Lista_monedas ==0 ){ //DE PESOS A QUETZALES
        resultado = valor * 0.38;}
        else if (Lista_monedas2 ==3 && Lista_monedas ==3) {
            resultado = valor;
        }
        if (Lista_monedas2 ==3 && Lista_monedas ==1 ){ //DE PESO A DOLARES
        resultado = valor * 0.050;}
        else if (Lista_monedas2 ==3 && Lista_monedas ==3) {
            resultado = valor;}
        
        if (Lista_monedas2 ==3 && Lista_monedas ==2 ){ //DE PESOS A EUROS
        resultado = valor * 0.047;}
        else if (Lista_monedas2 ==3 && Lista_monedas ==3) {
            resultado = valor;}
        
        
        
        
        return resultado;
    }
}
