nums = [3, 4, 5, 6, 7]
runningSum = []
current_count = 0
for i in nums:
    current_count = current_count+i
    runningSum.append(current_count)
print(runningSum)