package ExceptionalCode;



public class GamesWithAbNormal {
    public int val = 0;
    int rv() {
        try {
            val = 1;
            throw new Exception("ouch!");
        }
        catch (Exception e){
            val = 2;
            throw new Exception("double ouch!");
        }
        finally {
            val = 3;
            return val;
        }
    }
    public static void main(String[] args) {
        System.out.println(new GamesWithAbNormal().rv());
    }
}

