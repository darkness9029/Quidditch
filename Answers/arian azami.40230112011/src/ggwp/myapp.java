package ggwp;

import java.util.Objects;

public class myapp {

    public static void main(String[] args){
      match game=new match();
       team team_1=new team();
       team team_2=new team();
    for (int i=0;i<100;i++) {
        String T=game.starting_game();
      if (Objects.equals(T, "team1 wins the game")){
          System.out.println(T);
          break;
      }
      if (Objects.equals(T, "team2 wins the game")){
          System.out.println(T);
          break;
      }
System.out.println(T);
        }
     }
}
