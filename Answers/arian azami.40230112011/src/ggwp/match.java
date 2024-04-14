package ggwp;

public class match {
        team team_1=new team();
        team team_2=new team();
    public String starting_game() {
            double luck = Math.floor(Math.random() * 10);
            if (luck < 5)
            {
               if ( team_1.hitting_hard()){
                   team_1.show_score();
                   team_2.show_score();
                   return "team1 wins the game";
               }
               else if ( team_1.play())
               {
                   team_1.show_score();
                   team_2.show_score();
                   return "team1 scores a goal";
               }
               if (team_2.hitting_hard()){
                   team_1.show_score();
                   team_2.show_score();
                   return "team2 wins the game";
               } else if (team_2.play())
               {
                   team_1.show_score();
                   team_2.show_score();
                   return "team2 scores a goal";
               }

            }
                else if (luck >= 5) {
                if (team_2.hitting_hard()){
                    team_1.show_score();
                    team_2.show_score();
                    return "team2 wins the game";
                } else if (team_2.play())
                {
                    team_1.show_score();
                    team_2.show_score();
                    return "team2 scores a goal";
                }
                if ( team_1.hitting_hard()){
                    team_1.show_score();
                    team_2.show_score();
                    return "team1 wins the game";
                }
                else if ( team_1.play())
                {
                    team_1.show_score();
                    team_2.show_score();
                    return "team1 scores a goal";
                }
            }

        return "match ended with no goals";
    }
}
