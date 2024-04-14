package ggwp;

 public  class player implements success{
  public boolean isSuccessful(double x) {
   double chance = Math.floor(Math.random() * 100);
   if (chance <= x)
   {
    return true;
   }
   return false;
  }
 }