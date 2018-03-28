import java.util.Scanner;

public class SOstatkom {
private String a,b;
private int y,m,e,r;
    public void setSOstatkom(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое натуральное число ");
        a=scanner.next();
        y=Integer.parseInt(a);
        System.out.println("Введите второе натуральное число ");
        b=scanner.next();
        m=Integer.parseInt(b);

        e=y/m;
        r=y%m;
    }
    public int getSOstatkome(){
        return(e);
    }
    public int getSOstatkomr(){
        return(r);
    }
    public int getSOstatkomy(){
        return (y);
    }
    public int getSOstatkomm(){
        return(m);
    }
}