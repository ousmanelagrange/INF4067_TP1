# INF4067_TP1 Design pattern : Patrons de conception
Introduction : 
Le design pattern est tout simplement un ensemble de solutions réutilisable à un problème récurent de conception 
logiciel dans un certain contexte.

I. Patron de construction
  1. Factory Method
     L'idée ici est de créer un objet dont le type dépend du contexte. L'objet fait partie d'un ensemble de sous classes.
     Ceci se fait en abstrayant le mécanisme de création d'objet et en l'organisant. Pour cela, l'on doit avoir une classe
     dédiée à la fabrication d'objets. Il est utilisé lorsqu’à l’exécution il est nécessaire de déterminer dynamiquement
     quel objet d’un ensemble de sous-classes doit être instancier.
     L'exemple du cours puis l'exercice donnés ont été implémentés dans le dossier "INFO4067_TP1/FactoryMethod/"

     Il existe deux manières différentes d'implémenter cette méthode
     - Utilisation d'une fabrique concrète
       Déclarer une fabrique avec une méthode de création de l’objet qui attend les données nécessaires pour déterminer le
       type de l’objet à créer.
       Comment lancer le programme :
           * ouvrir un terminal ou une invite de commande
           * s'assurer d'avoir le jdk installé
           * puis naviguer dans le dossier "INFO4067_TP1/FactoryMethod/firstMethod"
           * lancer la commande "javac *.java" pour compiler tous les fichiers .java et enfin lancer la commande "java Client"
     - Utilisation d'une fabrique Abstraite
       Déclarer la fabrique abstraite et laisser ses sous classe créer les objetsraite.
       Comment lancer le programme ?
                Meme procédé pour la deuxième méthode mais dans le répertoire "INFO4067_TP1/FactoryMethod/secondMethod"
      - Exécution de l'exemple
        Faire le même procédé que les précédents, mais dans le repertoire "INFO4067_TP1/FactoryMethod/ModèlExemple"
  
  2. Abstract Factory
     Le but ici, est de créer des objets regroupés en famille sans avoir à connaitre leur classes concrètes. Il permet
     de fournir une interface unique pour instancier des objets d'une même famille sans avoir à connaitre les classes à instancier.
     On l'utilise lorsque le système est indépendant des objets qu'il utilise et est capable de créer des objets d'une même famille.
      

  
  4. Builder
     Il s'agit de créer des objets complexes en combinant différentes parties ou objets sources. Ces parties doivent généralement être créées dans un ordre spécifique ou en suivant un algorithme défini. En pratique, cela implique l'assemblage de plusieurs objets pour les fusionner en un seul. L'objectif principal est de masquer la complexité de la construction d'objets complexes, de sorte qu'un utilisateur puisse créer ces objets sans avoir à se soucier des différentes étapes nécessaires. Chaque objet source contribue à la construction d'une partie de l'objet complexe, également appelé objet cible.
     Dans l'exercice implémenté dans le code contenu dans le répertoire Builer, il est dans un premier temps question
     de reproduire l'exemple du cours (code + model), ensuite faire un  
     
     
      
 
