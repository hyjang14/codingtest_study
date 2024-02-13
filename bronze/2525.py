# 백준 2525번 오븐 시계

a, b = map(int, input().split()) #정수형으로 숫자 입력 받기
c = int(input())

n = b + c

if n >= 60:
    a = a + n // 60
    n = n % 60

if a >= 24:
    a = a % 24
   
print("%d %d" % (a, n))


