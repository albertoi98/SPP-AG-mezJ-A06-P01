/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a06.p1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPAGómezJA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num;
     num=solicitarNumero ("número");
     System.out.println("Número = " + num);
           
    }
    public static int solicitarNumero(String mensaje){
    Scanner kb = new Scanner(System.in);
    int numero > 0;
    boolean flag;
        
        do{
        System.out.println("Introducir " + mensaje);
        try{
        numero = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("numero negativo " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return numero;
}
    
    }
    
