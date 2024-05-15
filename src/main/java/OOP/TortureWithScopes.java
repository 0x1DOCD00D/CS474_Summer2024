package OOP;

public class TortureWithScopes {
    int prop1 = 1;
    TortureWithScopes getThisDamnThing(){
        return this;
    }
    {
        class OuterOfTheInner {
            int prop1 = 7;
            class InnerC {
                int prop1 = 10;

                void f() {
                    System.out.println("inside of f: " + String.valueOf(OuterOfTheInner.this.prop1));
                }
            }
        }
        prop1 = 2;
        {
            int prop1 = 3;
            {
                System.out.println("inside s3: "+String.valueOf(prop1));
            }
        }
        new OuterOfTheInner().new InnerC().f();
    }


    public static void main(String[] args) {
//        System.out.println(new TortureWithScopes().prop1);
        new TortureWithScopes();
    }
}
