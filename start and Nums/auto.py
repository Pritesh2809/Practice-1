number = 376
square = pow(number, 2)
mod = pow(10, len(str(number)))

if square % mod == number:
    print("It's an Automorphic Number")
else:
    print("It's not an Automorphic Number")
