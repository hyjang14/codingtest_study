# 백준 10798번 세로읽기

s = [input() for i in range(5)]

word = ''
for i in range(15):
    for j in range(5):
        if i < len(s[j]):
            word += s[j][i]
            
print(word)