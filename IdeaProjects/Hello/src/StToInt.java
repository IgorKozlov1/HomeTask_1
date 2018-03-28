import java.util.Scanner;

public class StToInt {

  private int j;
  private double u;
    public void setStToInt(){
        String p;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите вещественное число (используйте запятую) ");
        u=scanner.nextDouble();

        j=(int)Math.round(u);
    }

    public int getStToInt(){
        return(j);
    }

}
