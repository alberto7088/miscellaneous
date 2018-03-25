class Sorting():
    
    def __init__(self, a):
        self.a = a
        self.b = a + [0]

    def sorting_alg(self):
        for i in range(len(self.a)-1):
            for num in range(i, len(self.a) -1):
                if a[num +1] < a[i]:
                    mem = self.a[i]
                    self.a[i] = self.a[num +1]
                    self.a[num +1] = mem
        return self.a

    def insertion_sort(self):
        final = []
        for idx in range(len(self.a)):
            final.append(self.a[idx])
            i = idx
            while i > 0 and final[i -1] > self.a[idx]:
                mem = final[i -1]
                final[i-1] = self.a[idx]
                final[i] = mem
                i -=1
        return final

    def insertion_sort_reversed(self):
        final = []
        for idx in range(len(self.a)):
            final.append(self.a[idx])
            i = idx
            while i > 0 and final[i -1] < self.a[idx]:
                mem = final[i -1]
                final[i-1] = self.a[idx]
                final[i] = mem
                i -=1
        return final