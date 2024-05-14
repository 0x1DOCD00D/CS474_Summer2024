package OOP;

public class TortureWithScopes {
    int prop1 = 1;
    {
        class InnerC {
            int prop1 = 10;
            void f(){
                System.out.println(String.valueOf(prop1));
            }
        }
        prop1 = 2;
        {
            int prop1 = 3;
            {
            }
        }
        new InnerC().f();
    }


    public static void main(String[] args) {
//        System.out.println(new TortureWithScopes().prop1);
        new TortureWithScopes();
    }
}
