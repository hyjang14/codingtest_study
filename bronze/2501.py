# 백준 2501번 약수 구하기

N, K = map(int, input().split())
arr = []

for i in range(1, N+1, 1):
    if N % i == 0:
        arr.append(i)

if K <= len(arr):
    print(arr[K-1])
elif K > len(arr):
    print("%d" % 0)