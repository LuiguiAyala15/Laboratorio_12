/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author emers
 */
public class Operacion {
    
    private float valor1;
    private float valor2;

    public Operacion(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public Operacion(){}
    
    public void setValor1DesdeCaja(JTextField caja, JLabel labelError){
    
        this.valor1 = getNumero(caja, labelError);
    }
    
    public void setValor2DesdeCaja(JTextField caja, JLabel labelError){
    
        this.valor2 = getNumero(caja, labelError);
    }
    
    public void mostrarResultadoDiv(JTextField caja, JLabel labelError){
        
        if(valor1 == 0 && valor2 == 0){
            String text="No se puede dividir cero entre cero";
            labelError.setText(text);
        caja.setText("");
       }else if (valor2 == 0){
           String text="No se puede entre cero";
            labelError.setText(text);
        caja.setText("");
       }else{
           float div = div();
        caja.setText(div+" ");
       }
    }
    
   
    
      public float getNumero(JTextField caja, JLabel labelError) {
        labelError.setText("");
        
        String num2 = caja.getText();
    
    try {
        return Float.parseFloat(num2);
    } catch (NumberFormatException ex) {
        labelError.setText("Número inválido");
    }
    return 0;
}
    
    
    
   public float mul (){
        
        return valor1 * valor2;
    }
    
    public float div (){
        
        return valor1/valor2;
    }
    
    public float resta (){
        
        return valor1-valor2;
    }
    
    public float suma (){
        
        return valor1+valor2;
    }
}
