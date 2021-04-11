
package amine.bigpro;

/**
 *
 * @author amine
 */
public class Film {
    private String nom;
    private String date;
    private String duree;
    private String synopsys;
    private String PicturePath;
    
    /*
        Ensemble des attributs qui constituent un film
    */ 
    
    public Film(String nom, String date, String duree, String synopsys, String PicturePath){
        this.nom = nom;
        this.date = date;
        this.duree = duree;
        this.synopsys = synopsys;
        this.PicturePath = PicturePath;
    }
    
    /*
        Initialisation dans le constructeur des données que contiennent un film
    */ 
    
    public void ModifierFilm(String nom, String date, String duree, String synopsys){
        this.nom = nom;
        this.date = date;
        this.duree = duree;
        this.synopsys = synopsys;      
    }
    
    /*
        Méthode qui permet de modifier les informations d'un film
    */ 
    
    public void ModifierImage(String PicturePath){
        this.PicturePath = PicturePath;
    }
    
    /*
        Méthode qui permet de modifier le chemin d'une photo
    */ 
    
    public String getNom(){
        return nom;
    }
    
    /*
        Accesseur en lecture du nom du film
    */ 
    
    public String getDate(){
        return date;
    }
    
    /*
        Accesseur en lecture de la date du film
    */ 
    
    public String getDuree(){
        return duree;
    }

    /*
        Accesseur en lecture de la durée du film
    */ 
    
    public String getSynopsys(){
        return synopsys;
    }
    
    /*
        Accesseur en lecture du synopsys du film
    */     
    
    public String getPicturePath(){
        return PicturePath;
    }
    
    /*
        Accesseur en lecture du chemin de la photo du film
    */ 
    
}
