import java.util.Scanner;
public class operator {
public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Masukan bilangan 1 : ");
       int a=input.nextInt();
       System.out.println("Masukan bilangan 2 : ");
       int b=input.nextInt(); 

boolean c = a == b;
System.out.println("hasil perbandingan nilai a==b adalah"+c);
c = a != b;
System.out.println("hasil perbandingan nilai a!=b adalah"+c);
c = a >= b;
System.out.println("hasil perbandingan nilai a>=b adalah"+c);
c = a <= b;
System.out.println("hasil perbandingan nilai a<=b adalah"+c);
c = a > b;
System.out.println("hasil perbandingan nilai a>b adalah"+c);
c = a < b;
System.out.println("hasil perbandingan nilai a<b adalah"+c);
c = (a==b && a!=b) || (a>=b || a<=b) && (a>b || a<b);
System.out.println("(a==b && a!=b) || (a>=b || a<=b) && (a>b && a<b)"+c);
} 
}
