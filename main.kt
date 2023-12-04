fun fibonacci_n(n: Int): Int {
    if (n == 0) {
        return 0
    }
    var fib = 0
    var aux = 1
    for (i in 1 until n) {
        val temp = aux
        aux = aux+fib
        fib = temp
    }
    return fib
}
fun fibonacci_r(n: Int): Int{
  if (n==0){
    return 0
  }
  if (n==1){
    return 1
  }
  return fibonacci_r(n-1)+fibonacci_r(n-2)
}

fun main() {
    val n = 5
    println("Quinto elemento fibonacci:")
    print("${fibonacci_n(n)}")
    print("${fibonacci_r(n)}")
}