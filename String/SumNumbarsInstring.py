String2 = "He is top Ranker with 1198 marks"
sum = 0

for char in String2:
    if char.isdigit():
        sum += int(char)

print(sum)