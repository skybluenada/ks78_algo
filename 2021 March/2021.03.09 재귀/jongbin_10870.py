n = int(input())

def fac(x):
    if x==0:
        return 1
    else:
        return x*fac(x-1)

print(fac(n))
    
