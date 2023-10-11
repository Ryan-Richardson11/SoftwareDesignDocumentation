import random
import cProfile

def guess():
    """
    guess(): Generates random number between 2 and 5,000.
    """
    return random.randint(2, 5000)

def isPrime(x):
    """
    isPrime(): Takes an integer input.
    Checks for a remainder in range(2, x), returns True if divisor is found.
    """
    if x <= 1:
        return False
    for i in range(2, x):
        if (x % i) == 0:
            return False
    return True

def findPrimes(num):
    """
    findPrimes(): Takes an integer input to act as a range.
    Generates a random guess for each index.
    Checks if the number is prime(), continues in a while loop until it is.
    Adds prime number to primes list.
    """
    primes = []
    for i in range(num):
        p = guess()
        while not isPrime(p):
            p = guess()
        primes += [p]
    return primes

# Profiles the code efficiency using cProfile module.
cProfile.run('print(findPrimes(100)[:10])')
print("Complete.")


# Old
def isPrime(x):
    for i in range(x):
        for j in range(x):
            if i * j == x:
                return False
    return True