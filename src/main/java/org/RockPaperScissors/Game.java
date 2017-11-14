package org.RockPaperScissors;

  import java.util.Hashtable;

/**
 *
 * @author johnbox
 */
public class Game {

    /**
     *
     * @param p1
     * @param p2
     */

    public void match(Player p1, Player p2) {
        Hashtable<String, String> wins = new Hashtable<>();
        wins.put("ROCK", "SCISSORS");
        wins.put("PAPER", "ROCK");
        wins.put("SCISSORS", "PAPER");
        p1.toPlay();
        p2.toPlay();
        if (p1.getHand().equals(p2.getHand())) {
            System.out.println(ConsoleColors.YELLOW_BOLD + "Draw" + ConsoleColors.RESET);
            p1.toDraw();
            p2.toDraw();
        } else if (wins.get(p1.getHand()).equals(p2.getHand())) {
            p1.toWin();
            p2.toLose();

        } else {
            p2.toWin();
            p1.toLose();
        }

    }
}
