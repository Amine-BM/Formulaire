/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amine.bigpro;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author amine
 */
public class DVDFORM extends javax.swing.JFrame {
    private ArrayList<Film> films;

    
    //faut organier présentation synopsys dans le fichier aussi = TO DO 
    //retirer : effacer dans le fichier = DONE 
    //enlever la photo de modofications = DONE 
    //fermeture de la fenêtre <=> sortie du programme?? = DONE
    //empêcher la fermeture des fenêtres Ajouter et Modifications = DONE
    //faire une méthode qui permet de vérifier qu'on ajoute pas un film qui existe déjà (vérifier même titre et même date voir même durée) = TO DO
    
    public DVDFORM() {
        initComponents();
        LectureF f = new LectureF();
        f.Segmenter();
        
        String[][] result = f.Getresult();
        films = new ArrayList<Film>();
        
        jComboBox1.removeAllItems(); 
        
        for(int i=0; i<result.length; i++){
            films.add(new Film(result[i][0], result[i][1], result[i][2], result[i][3], result[i][4]));
            jComboBox1.addItem(result[i][0]);
        }
        setChampsNULL();//ouverture on ne voit pas de photo tant qu'on a pas sélectionné le film
    }
    
    
    public void setChampsNULL(){
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextArea1.setText(null);
        jLabel1.setText(null);
        jLabel1.setIcon(null);
    }
    /*
        méthode qui permet d'affecter une valeur null aux champs, afin d'obtenir des champs vides
    */
    
    public ArrayList<Film> GetFilms(){
        return films;
    }
    
    /*
        méthode qui permet de récupérer la liste de films
    */
    
    public void addComboBox(Film f){
        jComboBox1.addItem(f.getNom());
    }
    
    /*
        méthode qui permet d'ajouter un item à la ComboBox (ajouter un titre de film)
    */
    
    public int index(){
        return jComboBox1.getSelectedIndex();
    }
    
    /*
        méthode qui permet de récupérer l'indice de la ComboBox sur lequel on se trouve
    */
    
    public int NBItem(){
        return jComboBox1.getItemCount();
    }
    
    /*
        méthode qui permet de récupérer le nombre d'item de la ComboBox (soit le nombre de films restant dans la liste)
    */
    
    public void setButtonVisibleTrue(){
        ModifierInfos.setEnabled(true);
        ModifierJaquette.setEnabled(true);
        RetirerFilm.setEnabled(true);
    }
    
    /*
        méthode qui permet de rendre accessible les boutons (qui ont pu être désactiver dans la méthode RetirerFilm)
    */
    
    public void WriteSynopsysInTextArea(int position){
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextArea1.setLineWrap(true);
        jTextArea1.append(films.get(position).getSynopsys());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FilmSuivant = new javax.swing.JButton();
        ModifierInfos = new javax.swing.JButton();
        Ajouter = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        ModifierJaquette = new javax.swing.JButton();
        RetirerFilm = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(120, 120));
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 160));

        jTextField1.setEditable(false);
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("DATE");

        jLabel3.setText("DUREE");

        jLabel4.setText("SYNOPSYS");

        FilmSuivant.setText("film suivant");
        FilmSuivant.setToolTipText("");
        FilmSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilmSuivantActionPerformed(evt);
            }
        });

        ModifierInfos.setText("Modifier les informations");
        ModifierInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierInfosActionPerformed(evt);
            }
        });

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        Quitter.setText("Quitter");
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });

        ModifierJaquette.setText("Modifier la jaquette");
        ModifierJaquette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierJaquetteActionPerformed(evt);
            }
        });

        RetirerFilm.setText("Retirer film");
        RetirerFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirerFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModifierInfos)
                        .addGap(18, 18, 18)
                        .addComponent(ModifierJaquette))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(FilmSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RetirerFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifierInfos)
                    .addComponent(Ajouter)
                    .addComponent(ModifierJaquette)
                    .addComponent(RetirerFilm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilmSuivant))
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int position_item = 0;
        position_item = index();
        if(position_item >= 0 && films.get(position_item)!=null){
            jTextField1.setText(films.get(position_item).getDate());
            jTextField2.setText(films.get(position_item).getDuree());
            jTextArea1.setText("Voici le Synopsys de cette oeuvre:\n"); 
            WriteSynopsysInTextArea(position_item);
            ImageIcon icone = new ImageIcon(new ImageIcon(films.get(position_item).getPicturePath()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
            jLabel1.setIcon(icone);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    /*
        méthode qui permet de remplir tous les autres champs de la fenêtre en méthode de l'indice récupérer (lorsqu'on clique sur l'un des items de la ComboBox).
    */
    private void FilmSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilmSuivantActionPerformed
        int position = index();
        if(position < NBItem()-1)
            jComboBox1.setSelectedIndex(position+1);
        else {
            JOptionPane Infos = new JOptionPane();
            Infos.showMessageDialog(null, "Vous êtes à la fin de la liste vous ne pouvez plus \navancer !", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_FilmSuivantActionPerformed
    /*
        méthode qui permet d'accéder au film suivant de la liste et indique lorsqu'on est arrivé au bout de la liste
    */
    private void ModifierInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierInfosActionPerformed
        int position = index();
        int taille_combo = NBItem();
        if(taille_combo > 0 && position >=0 ){ 
            JOptionPane Infos = new JOptionPane();
            Infos.showMessageDialog(null, "Veuillez bien remplir toute les cases!!\n Dans les champs Date et Duree il faut mettre que des entiers", "Informations", JOptionPane.INFORMATION_MESSAGE);
            
            Modifications film = new Modifications(this); 
            film.afficher();
            this.setVisible(false); // on fait disparaître la fenêtre principale pendant tout le processus de modification.         
        }
        else {
            ModifierInfos.setEnabled(false);
            JOptionPane Infos = new JOptionPane();
            Infos.showMessageDialog(null, "Il n'y a pas de films dans votre gestionnaire", "Informations", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ModifierInfosActionPerformed
    /*
        méthode qui permet de modifier l'ensemble des informations du film sur lequel on se trouve (grâce à l'index de la ComboBox récupérer). 
        Elle permet d'ouvrir une nouvelle fenêtre dans laquelle l'utilisateur peut modfier les informations qu'il souhaite
    */
    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        JOptionPane Infos = new JOptionPane();
        Infos.showMessageDialog(null, "Veuillez bien remplir toute les cases!!\n Dans les champs Date et Duree il faut mettre que des entiers", "Informations", JOptionPane.INFORMATION_MESSAGE);
        
        AjouterFilm film = new AjouterFilm(this);
        film.Afficher();
        this.setVisible(false);
    }//GEN-LAST:event_AjouterActionPerformed
    /*
        méthode qui permet d'ajouter un film, on ouvre une nouvelle fenêtre dans laquelle il est possible de saisir l'ensemble des informations nécessaire pour enregistrer
    */
    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_QuitterActionPerformed
    /*
        méthode qui permet de fermer la fenêtre en question
    */
    private void RetirerFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirerFilmActionPerformed

        int position = index();
        int taille_combo = NBItem();
        
        if(taille_combo > 0 && position >=0){
            JOptionPane confirmation = new JOptionPane();
            int option = confirmation.showConfirmDialog(null, "Voulez-vous vraiment retirer le films de la base ?","Supression film", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(option == JOptionPane.OK_OPTION){
                jComboBox1.removeItemAt(position);
                films.remove(position);
                if(taille_combo==1){
                    setChampsNULL(); // on efface tous les champs quand on retire le dernier film de la liste (La ComboBox est donc désormais vide)
                }
                EcritureF movie = new EcritureF();
                movie.Retirer(films);
            }
        }
        
        else {
            RetirerFilm.setEnabled(false); // on bloque le bouton à l'utilisateur si la ComboBox est vide
            JOptionPane Infos = new JOptionPane();
            Infos.showMessageDialog(null, "Il n'y a pas de films dans votre gestionnaire", "Informations", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_RetirerFilmActionPerformed
    /*
        méthode qui permet de retirer le film sélectionné dans la fenêtre mais aussi dans le fichier
    */
    private void ModifierJaquetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierJaquetteActionPerformed
        int taille_combo = NBItem();
        
        if(taille_combo > 0){
            JFileChooser Photo = new JFileChooser(); // ouvre un explorateur de fichier
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png"); // initialise un filtre de format pour que seul les fichiers avec les formats jpg et png soient proposé
            Photo.setFileFilter(filter); // applique ce filtre
            if(Photo.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){ // permet de vérifier que le fichier a été selectionner
                int position = index();
                films.get(position).ModifierImage(Photo.getSelectedFile().getAbsolutePath());
                ImageIcon icone = new ImageIcon(new ImageIcon(films.get(position).getPicturePath()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                jLabel1.setIcon(icone);
                
                EcritureF f= new EcritureF();
                f.Modifier(films); //on modifie le film dans le fichier
            }     
            else {
                JOptionPane Warning = new JOptionPane();
                Warning.showMessageDialog(null, "Le fichier n'a pas été ouvert veuillez recommencez", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            ModifierJaquette.setEnabled(false); // on bloque le bouton à l'utilisateur si la ComboBox est vide
            JOptionPane Infos = new JOptionPane();
            Infos.showMessageDialog(null, "Il n'y a pas de films dans votre gestionnaire", "Informations", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ModifierJaquetteActionPerformed
    /*
        méthode qui permet de modifier la photo du film sélectionné (à la fois sur l'interface et sur le fichier) 
    */
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DVDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DVDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DVDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DVDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DVDFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton FilmSuivant;
    private javax.swing.JButton ModifierInfos;
    private javax.swing.JButton ModifierJaquette;
    private javax.swing.JButton Quitter;
    private javax.swing.JButton RetirerFilm;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
