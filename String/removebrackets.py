String = 'He is from India (Tamil Nadu)'
String1 = ''
for char in String:
    if char == '(':
        continue
    elif char == ')':
        continue
    else:
        String1 += char
print(String1)