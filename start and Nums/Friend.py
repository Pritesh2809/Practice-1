def printDivisors(n, factors) :
    i = 1
    while i <= n :
        if (n % i==0) :
            factors.append(i)
        i = i + 1
    return sum(factors) - n

if __name__ == "__main__":
  number1 = int(input("Enter a number: "))
  number2 = int(input("Enter a number: "))

  if int(printDivisors(number1, [])/number1) == int(printDivisors(number2, [])/number2):
    print(number1,number2,"is Friendly pair")
  else:
    print(number1,number2,"is Not a Friendly Pair")