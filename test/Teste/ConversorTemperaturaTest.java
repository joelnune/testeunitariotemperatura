/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;


import org.junit.Test;
import static org.junit.Assert.*;
import conversor.ConversorTemperatura;

/**
 *
 * @author LAB202
 */
public class ConversorTemperaturaTest {
    @Test
    public void converteCelsiusParaFahrenheit() {
       double celciusEnt = 20;
       double fahrenheitEsp = 68;
      
       ConversorTemperatura ct = new  ConversorTemperatura(); 
       double resultado = ct.converteCelsiusParaFahrenheit(celciusEnt);
    
       assertEquals(fahrenheitEsp, resultado, 0);

}
     @Test
    public void converteFahrenheitParaCelcius() {
       double FahrenheitEnt = 20;
       double CelsiusEsp = 68;
      
       ConversorTemperatura ct = new  ConversorTemperatura(); 
       double resultado = ct.converteCelsiusParaFahrenheit(FahrenheitEnt);
    
       assertEquals(CelsiusEsp, resultado, 0.00);

}
}
