import java.util.*;
public class Fib1
 {
  public int Fibo(int n)
  {
    if(n<=1)
    return n;
    return Fibo(n-1)+Fibo(n-2);
  }
  public static void main(String[] args) 
  {
    Fib1 m=new Fib1();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter Nth term of Fibbonacci series");
    n=o.nextInt();
    int a=m.Fibo(n);
    System.out.println("term is: "+a);
    
  }
}