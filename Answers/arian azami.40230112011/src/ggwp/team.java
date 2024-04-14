package ggwp;

public class team {


    player wp=new player();
    private static int goals =0;
  private final seeker seeker_numb1 =new seeker();
    private final beater beater_numb1 =new beater();
    private final beater beater_numb2 =new beater();
    private final keeper keeper_numb1 =new keeper();
    private final chaser chaser_numb1 =new chaser();
    private final chaser chaser_numb2 =new chaser();
    private final chaser chaser_numb3 =new chaser();
   boolean play(){
            if                (wp.isSuccessful(keeper_numb1.x)
                            &&(((wp.isSuccessful(chaser_numb1.x))&&wp.isSuccessful(chaser_numb2.x))
                            ||((wp.isSuccessful(chaser_numb2.x)))&&wp.isSuccessful(chaser_numb3.x)
                            ||(wp.isSuccessful(chaser_numb3.x))&&wp.isSuccessful(chaser_numb1.x))
                            &&((wp.isSuccessful(beater_numb1.x))||wp.isSuccessful(beater_numb2.x)))
            {
               setgoals();
               return true;
            }
            else { return false; }
   }
   public boolean hitting_hard(){
if (wp.isSuccessful(seeker_numb1.x)){
    goals +=150;
    return true;
}
       return false;
   }
  private void setgoals(){
      goals++;
    }
    public void show_score(){
        System.out.println(team.goals);
    }
}
