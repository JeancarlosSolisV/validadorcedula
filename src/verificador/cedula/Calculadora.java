/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificador.cedula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erick.rocafuerte
 */
public class Calculadora {
    public int Sumador(int x,int y){
        int suma= x+y;
        return suma;
    }    
    public int Resta(int x,int y){
        int resta=x-y;
        return resta;
    }
    public int Multiplicacion(int x,int y){
        int multiplicacion=x*y;
        return multiplicacion;
    }
    public double Division(int x,int y){
        double division=x/y;
        return division;
    }
    
    public static void main(String []args)throws IOException{
        Calculadora c=new Calculadora();
        int opt;
        do{
            System.out.println("Bienvenido a la calculadora 1.0");
            System.out.println("Seleccione una opcion");
            System.out.println("0-Salir\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            opt = br.read()-48;
            if (opt==1){
             int num,total=0;
             boolean bandera=true;
                while(bandera=true){
                    System.out.println("Para salir presione una letra");
                    System.out.print("Ingrese el numero a sumar: ");
                    br=new BufferedReader(isr);
                    String str=br.readLine();
                    for(int i=0;i<str.length();i++){
                        if(str.charAt(i)<48||str.charAt(i)>57){
                            bandera=false;
                        }
                    }
                    if(bandera==true){
                        num=Integer.parseInt(str);
                        total=c.Sumador(total, num);    
                    }
                } 
                System.out.println("el resultado de la suma es: "+total);
            }
        }while(opt!=0);
    }
}
