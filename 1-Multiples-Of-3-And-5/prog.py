# 10
# 3 6 9
# 6 * 3 = 18

# 5 10
#

# 6
# 1 * 6 = 6

# Final result = 30 + 18 - 6 = 42

def s(n): return n * (n+1) / 2

T = int(input().strip())
for _ in range(T):
    N = int(input().strip())
    N -= 1
    res = int(s(int(N/3)) * 3 + s(int(N/5)) * 5 - s(int(N/15)) * 15)
    print(res)


# There are issues when using python for this problem.
# There is a loss of precision. So java solution is provided
