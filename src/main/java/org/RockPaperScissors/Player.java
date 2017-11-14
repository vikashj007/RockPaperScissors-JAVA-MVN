package org.RockPaperScissors;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author johnbox
 */
public class Player {

    private String name;
    private int wins= 0;
    private int lose = 0;
    private int draws = 0;
    private String hand;

    Scanner input = new Scanner(System.in);

    public Player() {

     Random rand = new Random();
     String chars = "0123456789abcdefg";
     int length = 8;
     String str = new Random().ints(length, 0, chars.length())
                         .mapToObj(i -> "" + chars.charAt(i))
                         .collect(Collectors.joining());
       this.name = str;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public void toPlay() {
        int opt;
        System.out.println("Move:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +
                this.name + ConsoleColors.YELLOW_BOLD_BRIGHT + " played ROCK" + 
                ConsoleColors.RESET);
                setHand("ROCK");
                break;
            case 2:
                System.out.println(this.name + " played PAPER");
                setHand("PAPER");
                break;
            case 3:
                System.out.println(this.name + " played SCISSORS");
                setHand("SCISSORS");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
    public void toLose(){
        System.out.println(ConsoleColors.RED +
            this.name + " Lose" + 
            ConsoleColors.RESET);
        setLose(lose += 1);
    }
    public void toWin(){
    System.out.println(ConsoleColors.BLUE_BOLD + 
        this.name +" Won!"
        + ConsoleColors.RESET);
        setWins(wins+= 1);
    }
    public void toDraw(){
        setDraws(draws+=1);
    }
}

