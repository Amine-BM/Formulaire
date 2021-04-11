/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amine.bigpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author amine
 */
public class LectureF {
    private String[][] result;
    
    
    public void Segmenter()
    {
        File fic = new File("C:\\Users\\amine\\OneDrive\\Bureau\\PROJET\\nom.txt");
        try
        {

            FileReader f = new FileReader(fic);
            BufferedReader in = new BufferedReader(f);  
            String ligne = null;
            ArrayList<String> tmp = new ArrayList<String>();
              
            while (in.ready())
            {
                ligne = in.readLine();
                tmp.add(ligne);
            }
            in.close();
            result = new String[tmp.size()][5];
            for(int i=0; i<tmp.size(); i++){
                result[i] = tmp.get(i).split(";");
            }
            
            /*for(String[] s : result){
         
                for(String j : s){
                    System.out.println(j);
                }
                System.out.println("finis!!\n");
            }*/
           
                    
            
        }
	catch(FileNotFoundException e)
	{
	    // Exception lancée par FileReader f = new FileReader(fic);
	    System.out.format("Le fichier %s n'existe pas !\n",fic.getAbsolutePath());
	}	
        catch(IOException e)
        {
	    // Exception lancée par les opérations de lecture / fermeture du fichier
            System.out.format("Erreur d'E/S : %s\n",fic.getAbsolutePath());
        }

    }
    
    /*
        Méthode qui permet de lire le fichier qui constitue la base de donnée et de segmenter chaque ligne (chaque ligne représente l'ensemble des informations d'un film).
        
    */ 
    
    public String[][] Getresult(){
        return result;
    }
    
    /*
        Accesseur en lecture du tableau à deux dimensions contenant l'ensemble des films et leurs informations
    */ 
    
    
    /*public static void main(String[] args) {
        LectureF f = new LectureF();
        f.Segmenter();
    }*/
    
    
}
