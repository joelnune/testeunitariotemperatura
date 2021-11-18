/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author LAB202
 */
public class ConversorTemperatura {
    public static double converteCelsiusParaFahrenheit(double celsius){
double fahrenheit = 1.8*celsius+32;
return fahrenheit;
}
public static double converteFahrenheitParaCelsius(double fahrenheit){
double celsius = (5/9)*(fahrenheit-32);
return celsius;
}   
}
