/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class ManejoDeArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        File file = new File("myfile.txt");
        
            if(!file.exists()){
                try{
                    file.createNewFile();
                    System.out.println(file.getName()+"Archivo creado");
                    }catch(IOException ex){
                        ex.printStackTrace();
                        }
                }
            }
}
