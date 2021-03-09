n = int(input())
su = []

for i in range(0, n+1):
    if i<=1:
        su.append(i)
    else:
        su.append(su[i-2]+su[i-1])

print(su[n])
