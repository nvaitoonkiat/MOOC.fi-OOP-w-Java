import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(4);

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Number of players: " + barcelona.size());
        System.out.println("Total goals: " + barcelona.goals());
    }
}

class Team{
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize;
    
    public Team(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(list.size() == maxSize){
            return;
        }
        else list.add(player);
    }
    
    public void printPlayers(){
        for (Player player: list){
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    public Integer size(){
        return list.size();
    }
    public Integer goals(){
        int temp = 0;
        for(Player player : list){
            if (player.goals() == null){
                continue;
            }
            else {temp += player.goals();}
        }
        return temp;
    }
    
}

class Player{
    private String name;
    private Integer goals;
    
    public Player(String name){
        this.name = name;
    }
    public Player(String name, Integer goals){
        this.name = name;
        this.goals = goals;
    }
    public String getName(){
        return this.name;
    }
    public Integer goals(){
        return this.goals;
    }
    
    public String toString(){
        return ("Player: " + this.name + " Goals:" + this.goals);
    }
}
