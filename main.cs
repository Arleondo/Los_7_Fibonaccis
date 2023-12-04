using System;

class Program {
    static void Main() {
        Console.WriteLine("Este el es quinto elemento fibonacci:\n");
        Console.Write(Fibonacci_r(5));
        Console.Write(Fibonacci_n(5));
    }

    static int Fibonacci_r(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci_r(n - 1) + Fibonacci_r(n - 2);
        }
    }
    static int Fibonacci_n(int n){
      int fib=0,aux=1,temp;
      for (int i=0;i<n;i++){
        temp=aux;
        aux=fib+aux;
        fib=temp;
      }
      return fib;
    }
}