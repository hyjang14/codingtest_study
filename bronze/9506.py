# 백준 9506번 약수들의 합

n = 0
num = []

while n != -1: # 배열에 입력받기
    n = int(input())
    num.append(n)

for j in range(len(num)):
    if(num[j] == -1):
        break

    sum = 0
    prime = []

    for i in range(1, num[j]-1): # 소수 배열 생성
        if num[j] % i == 0:
            prime.append(i)

    for i in range(len(prime)): # 소수 합 구하기
        sum += prime[i]

    if sum == num[j]: # 합이랑 num[i]가 같을 때
        print("%d = " % num[j], end='')

        for i in range(len(prime)):
            if(i == len(prime)-1):
                print("%d" % prime[i], end='')
            else:
                print("%d + " % prime[i], end='')
        print()
    elif sum != num[j]: # 그렇지 않을 때
        print("%d is NOT perfect." % num[j])
        

