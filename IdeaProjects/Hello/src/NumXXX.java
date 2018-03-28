import java.util.Scanner;

public class NumXXX {

private int e,w,y,t,r,u;
    public void setNumXXX(){
        String q;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        q=scanner.next();
        w=Integer.parseInt(q);


        y= w /100;
        e=(w %100)/10;
        r= w %10;
        t=e+r+y;}


    public int getNumXXX(){
        return(t);
    }
        }