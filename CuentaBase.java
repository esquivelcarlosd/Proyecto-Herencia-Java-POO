/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocuatro;

/**
 *
 * @author esqui
 */
public class CuentaBase {
    //creamos atributos, mismos que serán heredados
    //tiene un modificador de acceso privado
    private double montoActual;
    double apertura;
    double cantidad;
    
    //Creamos constantes de intereses
    final double QUINCE_PORCIENTO = 0.15;
    final double DIEZ_PORCIENTO = 0.10;
    
    
    //creamos un constructor para inicializar los atributos
    //para esto, se le pide al usuario apertura y cantidad a agregar
  
    CuentaBase(double apertura, double cantidad){
        this.cantidad = cantidad;
        this.apertura = apertura;
    }
    
    //creamos los métodos SET Y GET para el atribúto montoActual. 
    //(encapsulado)
    public void setMontoActual(double montoActual){
        this.montoActual = montoActual;        
    }
    public double getMontoActual(){
        return montoActual;
    }
    //Creamos los métodos de los atributos no privados   
    
   
    double depositar(){
        return cantidad ;
    }
    //4to metodo
    public double sumaInteres(){
        //El método de sumarInterés aumenta el 15% del monto actual a la deuda.
        montoActual = (apertura + cantidad) * QUINCE_PORCIENTO;
        /*if (montoActual < 0){    
            return apertura + cantidad + montoActual ; ????           
        }*/
        return apertura + cantidad + montoActual ; 
    }
    public double retirar(){
        //El método retirar resta la cantidad indicada al monto actual.
        montoActual = apertura;
        return montoActual - cantidad;
    }
    public double invertir(){
        //El método invertir aumenta el 10% al monto actual.
        montoActual = (apertura + cantidad) * DIEZ_PORCIENTO;
        return apertura + cantidad + montoActual;
    }
    
    
    
    
    
   
}
