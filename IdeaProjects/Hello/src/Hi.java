import java.util.Scanner;

public class Hi {

    private String name;

    public void setName(){
        String name1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ВВедите имя того, кого вы хотите поприветствовать");
        name1=scanner.next();
        name=name1;
    }

    public String getName() {
        return (name);
    }

    }



