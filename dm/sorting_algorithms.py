def insert_sort(unsorted):
    sorted = [] 
    while unsorted:
        x = unsorted.pop()
		len_sorted = len(sorted) 
		for i in range(len_sorted):
			if sorted[i] <= x:
				sorted.insert(i, x)
				break 
		if len_sorted == len(sorted):
			sorted.append(x)
	return sorted 
