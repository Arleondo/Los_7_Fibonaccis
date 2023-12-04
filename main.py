def fibonacci_n( a ):
    fib=0
    aux=1
    for i in range(a):
        temp=aux
        aux = aux+fib
        fib=temp
    return fib

def fibonacci_r( a ):
    if a==1:
        return 1
    elif a==0:
        return 0
    return fibonacci_r(a-1)+fibonacci_r(a-2)

print ("Este es el quinto fibonacci: ")
print (fibonacci_n (5))
print (fibonacci_r (5))