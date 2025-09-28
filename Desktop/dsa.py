#Lists
new = ["Reeja", "Rithika","Riya",23,99.5,True]
print(new)
list1 = [1,2,1,9,5,8,6]
print(type(list1))

#apend
list1.append(23)
print(list1) #[1, 2, 1, 9, 5, 8, 6, 23]

#insert()
list1.insert(3,33)
print(list1) #[1, 2, 1, 33, 9, 5, 8, 6, 23]

#extend()
list1.extend([9,8,7])
print(list1) #[1, 2, 1, 33, 9, 5, 8, 6, 23, 9, 8, 7]

#len()
print(len(list1)) #12

#Negative indexing
print(list1[-2]) #8

#remove()
list1.remove(23) 
print(list1) #[1, 2, 1, 33, 9, 5, 8, 6, 9, 8, 7]

#pop()
list1.pop(3)
print(list1) #[1, 2, 1, 9, 5, 8, 6, 9, 8, 7]

#min()
print(min(list1)) #1

#max()
print(max(list1)) #9

#slicing
print(list1[2::-1]) #[1, 2, 1]

#count()
list1 = [1,2,1,9,5,8,6,1,9,8]
print(list1.count(1)) #2

#sort()
print(list1.sort()) #[1, 1, 2, 5, 6, 7, 8, 8, 9, 9]

#reverse()
print(list1.reverse()) #[9, 9, 8, 8, 7, 6, 5, 2, 1, 1]

#copy()
#deep copy
list2 = list1
list2.append(100)
print(list1)
print(list2)
print(id(list1))
print(id(list2))

#shallow copy
list3 = list1.copy()
list3.append(20)
print(list1)
print(list3)
print(id(list1))
print(id(list3))

#index()
print(list1.index(2)) #3








#clear()
list1.clear()
print(list1) #[]

#
