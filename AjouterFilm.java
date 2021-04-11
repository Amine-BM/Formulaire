
package amine.bigpro;
import java.awt.Color;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
/**
 *
 * @author amine
 */
public class AjouterFilm extends javax.swing.JFrame{
    private DVDFORM D;
    private ArrayList<Film> tmpFilms;

    public AjouterFilm(DVDFORM D) {
        this.D = D;
        tmpFilms = D.GetFilms();
        
        initComponents();
        Windowlistenner();
        
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        Synopsys.setLineWrap(true);
                
        Titre.setText(null);
        Date.setText(null);
        Duree.setText(null);
        Synopsys.setText(null);
        Path.setText(null);
    }
    
    

    public void Windowlistenner(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent we){
                if(we.WINDOW_CLOSING == we.getID()){
                    dispose();
                    D.setVisible(true);
                }
            }
        });
    }
    
    public boolean Isnumber(){
        try{
            int x = Integer.parseInt(Date.getText().strip());
            int y = Integer.parseInt(Duree.getText().strip());
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    
    /*
        Méthode qui permet de vérifier si les données inscrites dans les champs date et durée sont des bien des Integer (elle retourne true si c'est le cas et false dans le cas contraire)
    */
    
    public boolean IsNotEmpty(){
        if(Titre.getText().isBlank() || Date.getText().isBlank() || Duree.getText().isBlank() || Synopsys.getText().isBlank() || Path.getText().isBlank()){
            return false; //peut mettre les labels en rouge pour signaler quand l'utilisateur a mal rempli
        }else return true; 
    }
    
    /* 
        Méthode qui vérifie si l'ensemble des champs sont remplies, elle retourne true si c'est le cas et false dans le cas ou le champs seraient nulle ou juste rempli d'espace.
    */
    
    public Boolean Verificationfilm(String titre, String date){
        for(int i=0;i<tmpFilms.size();i++){
            if(tmpFilms.get(i).getNom().equalsIgnoreCase(titre.strip())&& tmpFilms.get(i).getDate().equalsIgnoreCase(date.strip())){
                return false;
            }
        }
        return true;
    }

    public String WriteSysnopsysInFile(String synopsys){
        String[] lines = synopsys.split("\n");
        String Synopfile = "";
        for(String i : lines){
            Synopfile += i + " ";
        }
        return Synopfile;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Titre = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Duree = new javax.swing.JTextField();
        Path = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsys = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Valider = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        ChoixPhoto = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitreActionPerformed(evt);
            }
        });

        Path.setEditable(false);
        Path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathActionPerformed(evt);
            }
        });

        Synopsys.setColumns(20);
        Synopsys.setRows(5);
        jScrollPane1.setViewportView(Synopsys);

        jLabel1.setText("Titre");

        jLabel2.setText("Date");

        jLabel3.setText("Durée");

        jLabel4.setText("Synopsys");

        Valider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        Quitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Quitter.setText("Quitter");
        Quitter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });

        ChoixPhoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChoixPhoto.setText("Choisir photo");
        ChoixPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Duree, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(ChoixPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChoixPhoto)
                    .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitreActionPerformed
        
    }//GEN-LAST:event_TitreActionPerformed

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
        this.dispose();
        D.setVisible(true);
    }//GEN-LAST:event_QuitterActionPerformed
    /*
        Méthode qui permet de fermer cette fenêtre et de ré-afficher la fenêtre principale
    */ 
    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if(IsNotEmpty() && Isnumber()){
            if(Verificationfilm(Titre.getText().strip(), Date.getText().strip())){
                tmpFilms.add(new Film(Titre.getText().strip(), Date.getText().strip(), Duree.getText().strip(), WriteSysnopsysInFile(Synopsys.getText().strip()), Path.getText().strip()));
                D.addComboBox(tmpFilms.get(tmpFilms.size()-1)); // on ajoute le titre du film qu'on vient d'enregistrer à la ComboBox

                EcritureF Ajouterfilm = new EcritureF();
                Ajouterfilm.Ajouter(tmpFilms);// on ajoute ce nouveau film dans le fichier

                this.dispose();
                D.setVisible(true);
                D.setButtonVisibleTrue();// on rend accessible les boutons lors d'un ajout (pour prévenir le cas où ils aient été désactivé)
            }
            else {
                JOptionPane erreur = new JOptionPane();
                erreur.showMessageDialog(null, "IMPOSSIBLE! Ce film existe déjà dans notre gestionnaire\n Vous ne pouvez pas je rajouter", "Warning", JOptionPane.ERROR_MESSAGE); 
                this.dispose();
                D.setVisible(true);
            }
        }
        else {
            JOptionPane erreur = new JOptionPane();
            erreur.showMessageDialog(null, "Vous n'avez pas ou mal rempli certaines cases !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ValiderActionPerformed
    /*
        Méthode qui permet de valider l'ajout du film (dans l'interface et dans le fichier) uniquement si les champs sont rempli et contiennent le bon format
    */ 
    private void ChoixPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixPhotoActionPerformed
        JFileChooser Photo = new JFileChooser(); //ouvre un explorateur de fichier
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png"); // initialise un filtre de format pour que seul les fichiers avec les formats jpg et png soient proposé
        Photo.setFileFilter(filter); // applique ce filtre
        if(Photo.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){ // permet de vérifier que le fichier a été selectionner
            Path.setText(Photo.getSelectedFile().getAbsolutePath());
        }
        else {
            JOptionPane Warning = new JOptionPane();
            Warning.showMessageDialog(null, "Le fichier n'a pas été ouvert veuillez recommencez", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ChoixPhotoActionPerformed
    /*
        méthode qui permet de choisir la photo du film qu'on souhaite ajouter
    */
    private void PathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PathActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Afficher() {
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
            java.util.logging.Logger.getLogger(AjouterFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterFilm(D).setVisible(true);
            }
        });
    }
    /*
        Méthode qui permet d'ouvrir la fenêtre et d'afficher le contenu de celle ci
    */ 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChoixPhoto;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Duree;
    private javax.swing.JTextField Path;
    private javax.swing.JButton Quitter;
    private javax.swing.JTextArea Synopsys;
    private javax.swing.JTextField Titre;
    private javax.swing.JButton Valider;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
