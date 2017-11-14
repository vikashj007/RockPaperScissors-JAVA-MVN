package org.RockPaperScissors;
public class MainApp {
  public static void main(String[] args) {
    while(true){
      Game g1 = new Game();

      Player p1 =
        new Player();
      Player p2 =
        new Player();

      g1.match(p1,p2);  
    }
  }
}
