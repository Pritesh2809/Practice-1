String = 'Seven'

for char in String:
    count = 0
    for char2 in String:
        if char == char2:
            count += 1
        if count > 1:
            break
    if count == 1:
        print(char, end = "")