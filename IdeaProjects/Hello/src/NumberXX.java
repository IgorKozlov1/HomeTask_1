import java.util.Scanner;

public class NumberXX {

    private int e, r, t, w;

    public void setNumberXX() {
        String q;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        q = scanner.next();
        w = Integer.parseInt(q);
        e = w / 10;
        r = w % 10;
        t = e + r;
    }

    public int getNumberXX() {
        return (t);
    }
}







