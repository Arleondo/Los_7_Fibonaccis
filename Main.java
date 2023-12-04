class FibonacciExample {
    static int fibonacci_r(int a) {
        if (a == 1)
            return 1;
        if (a == 0)
            return 0;
        return fibonacci_r(a - 1) + fibonacci_r(a - 2);
    }
    static int fibonacci_n(int n){
      int fib = 0, aux = 1, temp;
        for (int i = 1; i < n; ++i) {
          temp=aux;
          aux=aux+fib;
          fib=temp;
        }
      return fib;
    }
    
    public static void main(String[] args) {
        System.out.println("Este quinto fibonacci:");
        System.out.println(fibonacci_r(5));
        System.out.println(fibonacci_n(5));
    }
}