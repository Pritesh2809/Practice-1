low, high = 10, 10000

for n in range(low, high + 1):

    order = len(str(n))

    out = 0

    temp = n
    while temp > 0:
        digit = temp % 10
        out += digit ** order
        temp //= 10

    if n == out:
        print(n, end=", ")