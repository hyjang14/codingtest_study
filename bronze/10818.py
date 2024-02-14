# 백준 10818번 최소, 최대

N = int(input())

# 정수를 띄어쓰기 간격으로 배열로 입력받기
arr = list(map(int, input().split()))

max = arr[0]
min = arr[0]

for i in range(N):
    if max <= arr[i]:
        max = arr[i]
for i in range(N):
    if min >= arr[i]:
        min = arr[i]

print("%d %d" % (min, max))

