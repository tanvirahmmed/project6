package nested;
/**
 * Created by rrt on 7/31/2016.
 */
public class TestNested {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethodDisplay();
        Outer.InnerD outerInnerD = outer.new InnerD();
        outerInnerD.innerDdisplay();
    }
}
