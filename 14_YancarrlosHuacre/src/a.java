/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yancarlos
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calcular {
     //atributos     
    int a;
    int b;
    int totalsuma;
    int totalresta;
    int totaldividir;
    int totalmultiplicar;
    //Multiplicar:
     public void preguntar(){
        Scanner o =new Scanner(System.in);
     System.out.println("Ingrese el primer numero: ");   
     a = o.nextInt();
   
    System.out.println("Ingrese el segundo numero: ");
     b = o.nextInt();
    
    }
    public void multiplicar(){
    totalmultiplicar = a*b;
        System.out.println("La multiplicaion es: "+totalmultiplicar);
    }
    public void sumar(){
    totalsuma= a+b;
        System.out.println("La suma es: "+totalsuma);
    }
    public void restar(){
    totalresta = a-b;
        System.out.println("La resta es: "+totalresta);
    }
    public void dividir(){
    totaldividir =a/b;
        System.out.println("La division es : "+totaldividir);
    }
   
    public void responde(){
    JOptionPane.showMessageDialog(null,"La suma yis: "+totalsuma);
    JOptionPane.showMessageDialog(null,"La resta yis: "+totalresta);
    JOptionPane.showMessageDialog(null,"La multiplicacion yis: "+totalmultiplicar);
    JOptionPane.showMessageDialog(null,"La division yis: "+totaldividir);
    }
}