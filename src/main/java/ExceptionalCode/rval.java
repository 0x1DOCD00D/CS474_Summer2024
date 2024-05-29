package ExceptionalCode;

public class rval {
       boolean rv(){
              try{
                     return false;//R
              }
              catch(Exception e){
                     return true;
              }
              finally {
                     int x = 3;//S
              }
       }
       public static void main(String[] args) {
              GamesWithAbNormal r = new GamesWithAbNormal();
              System.out.println(r.rv());
       }
 
}

