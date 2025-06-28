String = 'i am your friend'
String2 = ''
sum = 1

String = String.lower()

for char in String:
    if sum == 1:
        String2 += char.upper()
    elif sum == len(String):
        String2 += char.upper()
    else:
        String2 += char
    sum += 1

print(String2)