/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amine.bigpro;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;


public class EcritureF {
    
    public void Ajouter(ArrayList<Film> films){
        File F = new File("C:\\Users\\amine\\OneDrive\\Bureau\\PROJET\\nom.txt");
        
        try{
            FileWriter Newfilm = new FileWriter(F,true);
            BufferedWriter out = new BufferedWriter(Newfilm);
            
            int pos = films.size()-1;
            String line = films.get(pos).getNom() + ";" + films.get(pos).getDate() + ";" + films.get(pos).getDuree() + ";" +films.get(pos).getSynopsys() + ";" + films.get(pos).getPicturePath();
            
            out.newLine();
            out.write(line);
            
            out.flush();
            out.close();
        }
        catch(IOException e){
            System.out.println("Erreur " + e);
        }
        
    }
    /*
        méthode qui permet d'écrire dans le fichier sans écraser les données (on écris juste le dernnier film ajouté à la fin du film) 
    */
    
    public void Modifier(ArrayList<Film> films){
        File F = new File("C:\\Users\\amine\\OneDrive\\Bureau\\PROJET\\nom.txt");
        
        try{
            FileWriter film = new FileWriter(F);
            BufferedWriter out = new BufferedWriter(film);
            
            for (int i=0; i< films.size();i++){
                String line = films.get(i).getNom() + ";" + films.get(i).getDate() + ";" + films.get(i).getDuree() + ";" +films.get(i).getSynopsys() + ";" + films.get(i).getPicturePath();
                out.write(line);
                out.newLine();
            }
            out.flush();
            out.close();
            
        }
        catch(IOException e){
            System.out.println("Erreur " + e);
        }
    }
    
    /*
        méthode qui permet d'écrire dans le fichier (en écrasant les données), les modifications étant enregistré dans la liste on a juste besoin de recopier celle ci dans le fichier 
    */
    
    public void Retirer(ArrayList<Film> films){
        File F = new File("C:\\Users\\amine\\OneDrive\\Bureau\\PROJET\\nom.txt");
        
        try{
            FileWriter film = new FileWriter(F);
            BufferedWriter out = new BufferedWriter(film);
            
            for (int i=0; i< films.size();i++){
                String line = films.get(i).getNom() + ";" + films.get(i).getDate() + ";" + films.get(i).getDuree() + ";" +films.get(i).getSynopsys() + ";" + films.get(i).getPicturePath();
                out.write(line);
                out.newLine();
            }
            out.flush();
            out.close();
            
        }
        catch(IOException e){
            System.out.println("Erreur " + e);
        }
    }
    /*
        méthode qui permet d'écrire dans le fichier (en écrasant les données), le film étant retiré dans la liste on a juste besoin de recopier celle ci dans le fichier
    */
}
