import random
import cProfile

def guess():
    return random.randint(2, 5000)

def isPrime(x):
    if x <= 1:
        return False
    for i in range(2, x):
        if (x % i) == 0:
            return False
    return True

def findPrimes(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrime(p):
            p = guess()
        primes += [p]
    return primes

cProfile.run('print(findPrimes(100)[:10])')
print("Complete.")