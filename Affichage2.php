<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <style media="screen">
      body{
        background: linear-gradient(#141e30, #243b55);
        font-size: 14px;
        line-height: 22px;
        font-family: sans-serif;
      }
      .tab h2,table{
        color: #fff;
        text-align: center;
        margin-top: 10px;
      }
    </style>
  </head>

  <body>
    <?php
      function Ecrire($conn){

        if (isset($_POST['nom'])) {
          $nom=$_POST['nom'];
        }
        else $nom="";

        if (isset($_POST['prenom'])) {
          $prenom=$_POST['prenom'];
        }
        else $prenom="";

        if (isset($_POST['nom'])) {
          $nom=$_POST['nom'];
        }
        else $nom="";

        if (isset($_POST['tel']) && is_numeric($_POST['tel'])) {
          $tel=$_POST['tel'];
        }
        else $tel="";

        if (isset($_POST['mail'])) {
          $mail=$_POST['mail'];
        }
        else $mail="";

        /* Vérifie si les champs saisies par l'utlisateur sont différents de null donc si les champs on était rempli */

        if (empty($nom) || empty($prenom) || empty($tel) || empty($mail)) {
          echo "<h2>Vous n'avez pas correctement rempli les informations</h2>" . "<br>";
          return false;
        }

        /* Si un des champs n'est pas rempli on retourne faux et on arrête le programme */

        else {
          $query = "INSERT INTO individu(Nom, Prenom, Telephone, Email) VALUES('$nom', '$prenom', '$tel', '$mail')";
          try {
            $result = $conn->query($query);
            echo '<center><h2> Vos infos on été ajoutées.</h2></center>';
            $result = null;
            return true;
          } catch (PDOException $e) {
              /*
                problème détecté : quand une erreur survient lors de l'exécution de la requête, on remarque
                que malgré que la requête n'abouti pas l'ID s'incrémente tout de même de 1 ce qui provoque un décallage dans
                les ID des individus suivants.
              */
              echo '<center><h2> Une erreur est intervenue lors de l introduction dans la base.</h2></center>';
              /*
                solution : on récupère l'ID du dernier individu de la table, on l'incrémente de 1 et on affecte cet ID
                à l'AUTO_INCREMENT, ce qui permet de lui redonner sa valeur exact et ce qui empêchera un décallage d'identifiant
                lors de l'ajout de prochains individus
              */
              $IDvalue = $conn -> query("SELECT * FROM individu ORDER BY `ID` DESC LIMIT 1"); // on récupère la dernière ligne de la table (celle avec l'ID le plus grand)
              $resultat = $IDvalue -> fetch();
              $ID_modifier =  (int)$resultat['ID'] + 1; // on établi la bonne valeur de l'auto-incrémentation
              $Modification =  $conn->query("ALTER TABLE individu AUTO_INCREMENT=$ID_modifier");

              $IDvalue = null;
              $Modification = null;
              echo "<h2>" . $e->getMessage() . "</h2>";
              die();
              return false;
          }
        }
      }

      /*Sinon on crée la requête d'insertion avec les données saisies on l'exécute et on retourne true si tout s'est bien passé et false sinon et on stoppe la connexion*/


      function Afficher($conn)
      {
        $requete = "SELECT * FROM individu";
        $resultat = $conn -> query($requete);
        echo "<h2>Voici le contenu de la base à cet instant : </h2>";
        echo "<table border=6 align=center cellspacing=5 cellpadding=20 width=60% color:#fff>";
        echo "<tr> <td> ID </td>" . "<td> Nom </td>" . "<td> Prenom </td>" . "<td> Telephone </td>" . "<td> Email </td> </tr> <br>";
        while ($ligne = $resultat -> fetch()) {
          echo "<tr> <td>" . $ligne['ID'] . "</td>";
          echo " <td>" . $ligne['Nom'] . "</td>";
          echo " <td>" . $ligne['Prenom'] . "</td>";
          echo " <td>" . $ligne['Telephone'] . "</td>";
          echo " <td>" . $ligne['Email'] . "</td> </tr>";
        }
        echo "</table>";

        $resultat = null;
      }

      /*Fontion qui permet l'affichage de la table avec les nouvelles donéées rentrées*/

    ?>


    <div class="tab">
      <?php
        $host="localhost:3308";
        $username="root";
        $pass="";
        $dbname="db_web";
        try {
          $conn = new PDO("mysql:host=$host;dbname=$dbname", $username, $pass);
          // set the PDO error mode to exception
          $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
          echo "<h2>Connected successfully</h2>";
          $connection=true;
        }
        catch(PDOException $e) {
          echo "<h2>Connection failed: </h2>" . $e->getMessage();
          $connection=false;
        }

        if(isset($_POST['Affichage'])){
          $click_Affichage = true;
        }
        else $click_Affichage = false;

        /*
          on vérifie si c'est bien sur le bouton Afficher que l'utilisateur a appuyé
          si c'est le cas on affecte true à notre variable et on Affiche seulement le contenu de la table
          sans entrer dans la méthode écriture.
        */

        echo "<br>";
        if ($connection) {
          if($click_Affichage){
            Afficher($conn);
          }
          else if(Ecrire($conn)){
            Afficher($conn);
          }
        }

        $conn = null;
      ?>
    </div>

  </body>
</html>
