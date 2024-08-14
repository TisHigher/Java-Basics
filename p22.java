import java.util.*;
abstract class Student {
    int roll;
    int reg;
    public abstract void getinput(int a, int b);
    public abstract void course();
}
class kiitian extends Student {
    public void getinput(int a, int b) {
        roll = a;
        reg = b;
    }
    public void course() {
        if (roll <= 2205475) {
            System.out.println("Course=B.Tech(IT)");
        } else if (roll > 2205475 && roll <= 22051900) {
            System.out.println("Course=B.Tech(CSE)");
        } else {
            System.out.println("Course=B.Tech(ETC)");
        }
    }
}
public class p22 {
    public static void main(String args[]) {
        kiitian S1 = new kiitian();
        S1.getinput(22051647, 23178905);
        S1.course();
    }
}
