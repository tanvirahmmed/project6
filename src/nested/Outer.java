package nested;

/**
 * Created by rrt on 7/31/2016.
 */
public class Outer {

    InnerA innerA = new InnerA();
    public void outerMethodDisplay(){
        System.out.println("I am on Outer class");
        innerA.innerAdisplay();
        System.out.println("End of the method");
    }
    private class InnerA{
        int innerANum = 10;
        private void innerAdisplay(){
            System.out.println("I am on Inner A class");
        }
    }
    private class InnerB extends InnerA{
        int innerBNum = 12;
        public void innerBdisplay(){
            System.out.println("I am on Inner B class");
        }
    }
    private class InnerC{
        int innerCNum = 14;
        public void innerCdisplay(){
            System.out.println("I am on Inner C class");
        }
    }
    public class InnerD{
        int innerCNum = 14;
        public void innerDdisplay(){
            System.out.println("I am on Inner D class");
        }
    }
}
