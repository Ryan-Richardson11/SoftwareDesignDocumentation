def bubbleSort(a):
    for i in range(len(a)):
        for j in range(0, len(a)-i-1):
            if a[j] > a[j+1]:
                a[j+1], a[j] = a[j], a[j+1]
        for k in range(len(a)-1,len(a)-(i+2),-1):
            if (k == 0):
                break
            if (a[k] < a[k-1]):
                print("Error at i =", i)
                break

# Testcase
a = [3, 5, 2, 65, 3, 6, 3, 8, 1, 5]
bubbleSort(a)
print(a)
