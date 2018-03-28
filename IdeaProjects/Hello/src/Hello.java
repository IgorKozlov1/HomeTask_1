import java.util.Scanner;

public class Hello {

    public static void main(String args[]) {

//Задача 1.4
        Formula formula1 = new Formula();
        formula1.setForm(45, 56);
        System.out.println("Результат вычисления " + formula1.getForm());

//Задача 1.1
        Hi hi = new Hi();
        hi.setName();
        System.out.println("Приивет " + hi.getName());

//Задача 2.2
        NumXXX numXXX = new NumXXX();
        numXXX.setNumXXX();
        System.out.println("Сумма чисел трехзначного числа " + numXXX.getNumXXX());

//Задача 2.1
        NumberXX numberXX = new NumberXX();
        numberXX.setNumberXX();
        System.out.println("Сумма чисел двузначного числа " + numberXX.getNumberXX());

//Задача 2.3
        StToInt stToInt = new StToInt();
        stToInt.setStToInt();
        System.out.println("Ближайшее целое число к введенному " + stToInt.getStToInt());

//Задача 2.4
        SOstatkom sOstatkom = new SOstatkom();
        sOstatkom.setSOstatkom();
        System.out.println(sOstatkom.getSOstatkomy() + " / " + sOstatkom.getSOstatkomm() + " = " + sOstatkom.getSOstatkome() + " остаток " + sOstatkom.getSOstatkomr());

        System.out.println(" ");
//Задача 3.1
        From1To10 from1To10 = new From1To10();
        from1To10.setFrom1To10();

        System.out.println(" ");
//Задача 3.2
        WhileNot300 whileNot300 = new WhileNot300();
        whileNot300.setWhileNot300();
        System.out.println(" ");

//Задача 3.3
        Factorial1 factorial1 = new Factorial1();
        factorial1.setFactorial1();

        /** for(int i=args.length-1;i>=0;--i) {
         System.out.println("Аргумент = " + args[i]);
         }*/
//gfhfg

    }
}