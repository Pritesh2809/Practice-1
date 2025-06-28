def getHCF(a, b):
    return b == 0 and a or getHCF(b, a % b)


num1 = 36
num2 = 60

print("Hcf of", num1, "and", num2, "is", getHCF(num1, num2))

