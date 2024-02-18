# 백준 5086번 배수와 약수

N = []
M = []

while True:
    nums = input().split()

    if nums == ['0', '0']:
        break

    num1, num2 = map(int, nums)
    
    N.append(num1)
    M.append(num2)

i = 0

while i < len(N):
    if M[i] % N[i] == 0:
        print("factor")
    elif N[i] % M[i] == 0:
        print("multiple")
    else:
        print("neither")
    i = i + 1
