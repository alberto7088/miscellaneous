def insert_sort(unsorted):
    sorted = [] 
    while unsorted:
        x = unsorted.pop()
        len_sorted = len(sorted) 
        for i in range(len_sorted):
            if sorted[i] >= x:
                sorted.insert(i, x)
                break
        if len_sorted == len(sorted):
            sorted.append(x)
    return sorted
     

def merge_sort(unsorted):
    size = len(unsorted) 
    if size == 1:
        return unsorted
    split_idx = size // 2
    # split input and sort separately 
    s1 = merge_sort(unsorted[split_idx:]) 
    s2 = merge_sort(unsorted[:split_idx])  
    # merge/sort split inputs to return a single output 
    sorted = []
    while len(sorted) < size:
        if s1[0] <= s2[0]:
            sorted.append(s1.pop(0)) 
            if len(s1) == 0:
                sorted += s2
        else:
            sorted.append(s2.pop(0)) 
            if len(s2) == 0:
                sorted += s1
    return sorted 
    

if __name__=='__main__':
    x = [4,1,5,3,4,3] 
    print(x) 
    print(insert_sort(x.copy())) 
    print(merge_sort(x.copy())) 
    

