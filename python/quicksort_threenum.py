# input = 3 numbers
# output = sorted 3 numbers
# input example = 3 8 7
# output example = 3 7 8 
arr = list(map(int, input().split()))

def quicksort(arr):
    if len(arr) <= 1:
        return arr
    
    pivot = arr[len(arr) // 2]
    less_arr, equal_arr, great_arr = [],[],[]
    
    for i in arr:
        if i < pivot:
            less_arr.append(i)
        elif i == pivot:
            equal_arr.append(i)
        else:
            great_arr.append(i)
    
    return quicksort(less_arr) + equal_arr + quicksort(great_arr)


for i in range(len(arr)):
    print(quicksort(arr)[i])
