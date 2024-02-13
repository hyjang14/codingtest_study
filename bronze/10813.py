# 백준 10813번 공 바꾸기

N, M = map(int, input().split())

bucket = [i for i in range(1, N+1)]

for i in range(N):
    print(bucket[[i]])