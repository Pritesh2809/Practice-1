number = 371
num = number
out =0
length = len(str(num))
def checkArmstrong(num,length,sum):
  if num==0:
    return sum
  sum+=pow(int(num%10),length)
  return checkArmstrong(num/10,length,sum)

if checkArmstrong(num, length, out)==number:
  print('Armstrong')
else:
  print("Not Armstrong")