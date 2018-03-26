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
public class VerificadorCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char[]cI=new char[10];
        int[]cE=new int[10];
        System.out.println("Bienvenido al verificador de cedulas ecuador");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cedula = br.readLine();
        if(cedula != null){
            if(!cedula.equals("")){
                if(cedula.length()<=10){
                    cedula.getChars(0, 9,cI, 0);
                    for (int i=0;i<=9;i++){
                        cE[i]=cI[i]-48;
                    }
                    if (cE[2]<6){
                        
                        
                    }else{
                        System.out.println("error en la cedula");
                    }
                }
            }
        }
        
        
    }
    
}
