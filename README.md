# RockPaperScissors-JAVA-MVN

Simple Rock Paper and Scissors in Java using MAVEN folder structure

# To build: (MAVEN)
### Go to the root (where the *pom.xml* is) and use:
```
$mvn package
```

### The purpose of this project is to register some practices that I am starting to
use in Java development studies.

Although I like and use Netbeans, this project uses:

* VIM with:
 javacomplete2, 
 nerdtree and 
 ctags plugins;

* JBoss Forge to create the MVN structure;

* Maven to build the project
 As you can see in the *pom* file, I'll compile it to a JAR file.

### This project has 3 simple classes:

* MainApp
 Here's where the main loop will run presenting a MATCH for 2 Players;
* Game
 Class with the logic of the Rock-Paper-Scissors
* Player
 Defines the Player-object that will play the match. Has some scratch
implementations of methods tha will be used to build a score object (probably)
it will be stored in a JSON file.

