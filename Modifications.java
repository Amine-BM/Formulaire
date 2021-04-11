
package amine.bigpro;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
/**
 *
 * @author marwa
 */
public class Modifications extends javax.swing.JFrame {

    private DVDFORM D;
    private ArrayList<Film> Films;

    public Modifications(DVDFORM D) { 
        this.D=D;
        Films=D.GetFilms();
        initComponents();
        Windowlistenner();
        int position=D.index();// permet de récupérer le film qu'on souhaite modifier
        
        nom1.setText(Films.get(position).getNom());
        date1.setText(Films.get(position).getDate());
        duree1.setText(Films.get(position).getDuree());
        WriteSynopsysInTextArea(position); // on insère toutes les données du film pour que l'utilisateur choisisse précisemment celles qu'il souhaite changer
    }
    
    public void Windowlistenner(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent we){
                if(we.WINDOW_CLOSING == we.getID()){
                    System.out.println("coucou");
                    dispose();
                    D.setVisible(true);
                }
            }
        });
    }

    public boolean Isnumber(){
        try{
            int x = Integer.parseInt(date1.getText().strip());
            int y = Integer.parseInt(duree1.getText().strip());
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
        if(nom1.getText().isBlank() || date1.getText().isBlank() || duree1.getText().isBlank() || synopsys1.getText().isBlank()){
            return false;
        }else return true; 
    }
    
    /* 
        Méthode qui vérifie si l'ensemble des champs sont remplies, elle retourne true si c'est le cas et false dans le cas ou le champs seraient nulle ou juste rempli d'espace.
    */
    
    
    public void WriteSynopsysInTextArea(int position){
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        synopsys1.setLineWrap(true);
        synopsys1.append(Films.get(position).getSynopsys());
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

        nom1 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        duree1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        synopsys1 = new javax.swing.JTextArea();
        Quitter = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom1ActionPerformed(evt);
            }
        });

        date1.setText("jTextField2");
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });

        duree1.setText("jTextField3");
        duree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duree1ActionPerformed(evt);
            }
        });

        synopsys1.setColumns(20);
        synopsys1.setRows(5);
        jScrollPane1.setViewportView(synopsys1);

        Quitter.setText("EXIT");
        Quitter.setMaximumSize(new java.awt.Dimension(77, 23));
        Quitter.setMinimumSize(new java.awt.Dimension(77, 23));
        Quitter.setPreferredSize(new java.awt.Dimension(77, 23));
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });

        Valider.setText("VALIDER");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        jLabel1.setText("Titre");

        jLabel7.setText("Date");

        jLabel8.setText("Duree");

        jLabel10.setText("Synopsys");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setText("Modifier les informations que vous souhaitées.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duree1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valider))))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
      this.dispose(); 
      D.setVisible(true);
    }//GEN-LAST:event_QuitterActionPerformed
    /*
        Méthode qui permet de fermer cette fenêtre et de ré-afficher la fenêtre principale
    */ 
    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed

        if(IsNotEmpty() && Isnumber()){ 
            String nom = nom1.getText().strip();
            String date = date1.getText().strip();
            String duree = duree1.getText().strip();
            String synopsys = WriteSysnopsysInFile(synopsys1.getText().strip());
            
            int position=D.index();
            Films.get(position).ModifierFilm(nom, date, duree, synopsys); //on modifie le film dans la liste
            
            EcritureF f= new EcritureF();
            f.Modifier(Films); //on modifie le film dans le fichier
            
            this.dispose();//on ferme cette fenêtre
            D.setVisible(true);//on ré-affiche la fenêtre principale
        }
        else {
            JOptionPane erreur = new JOptionPane();
            erreur.showMessageDialog(null, "Vous n'avez pas ou mal rempli certaines cases !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_ValiderActionPerformed
    /*
        Méthode qui permet de valider les modifications (dans l'interface et dans le fichier) uniquement si les champs sont rempli et contiennent le bon format
    */ 
    private void nom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom1ActionPerformed

    }//GEN-LAST:event_nom1ActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

    private void duree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duree1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void afficher() {
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
            java.util.logging.Logger.getLogger(Modifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifications(D).setVisible(true);
            }
        });
    }
    /*
        Méthode qui permet d'ouvrir la fenêtre et d'afficher le contenu de celle ci
    */ 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quitter;
    private javax.swing.JButton Valider;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField duree1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom1;
    private javax.swing.JTextArea synopsys1;
    // End of variables declaration//GEN-END:variables
}
