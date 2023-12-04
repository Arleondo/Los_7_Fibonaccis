fn fibonacci_r(n: u32) -> u32 {
    match n {
        0 => 0,
        1 => 1,
        _ => fibonacci_r(n - 1) + fibonacci_r(n - 2),
    }
}
fn fibonacci_n(n: u32) -> u32 {
  let mut fib: u32=0;
  let mut aux: u32=1;
  for _j in 0..n{
    let tempo: u32=aux;
    aux=fib+aux;
    fib=tempo;
  }
   return fib;
}

fn main() {
    let n=5;
    println!("Quinto fibonacci");
    print!("{} ", fibonacci_r(n));
    print!("{} ", fibonacci_n(n));
}