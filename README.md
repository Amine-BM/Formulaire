Description du projet : 

Cette application web vous permet de saisir via un formulaire
l'ensemble des données nécessaires (nom, prenom, N°téléphone, email)
pour inscrire un nouvel individu dans la base de données db_web (et plus
exactement dans la table individu).

Le formulaire est disponible via un fichier html (formulaire.html) qu'il suffira
d'ouvrir à l'aide du serveur Apache. Une fois le formulaire rempli il vous suffira
d'appuyer sur le bouton "Envoyer" qui fera lien avec la page d'affichage au format php
(Affichage2.php) sur laquelle on affichera une table avec l'ensemble des données de
la base. L'utilisateur peut aussi se contenter d'afficher la base (sans ajouter un 
nouvel individu) en appuyant sur le bouton "Afficher la Base", qui redirigera lui aussi 
sur la page Affichage2.php.

Description de l'implémentation des fichiers :

Le fichier formulaire.html est assez simple, il comprend un formulaire qui permet
de charger la page Affichage2.php et différentes sections qui contiennent des input
dans lequel l'utilisateur saisie des données et les envoies via le bouton submit.

Le fichier Affichage2.php contient plusieurs fonctionnalitées, il permet :
- se connecter à notre base de données (on gère l'exception en cas d'échec de connexion)
- vérifier sur quel bouton l'utilisateur a appuyé (Afficher ou envoyer)
- afficher la base de données (si l'utilisateur à appuyer sur Afficher)
- écrire dans notre base de données (si l'utilisateur a appuyer sur envoyer) si les champs ne sont pas vides 
	on insère l'ensemble des données saisies par l'utilisateur à l'aide d'une requête d'insertion (SQL)
	on gère l'exception quand les données comme l'email ou le téléphone sont identiques à des données déjà présente dans la base
		dans ce cas là on réaffecte une bonne valeur à l'auto_incrémentation (et donc à l'ID) qui s'est incrémenté de 1 alors que la requête n'a pas abouti
	on retourne vrai ou faux selon si l'insertion a été un succès ou non.
- on affiche un message d'erreur ou la table individu(grâce à une méthode affichage) selon si la méthode écriture revoie vrai ou faux.

(PS : en complément le code a été commenté) 

  
