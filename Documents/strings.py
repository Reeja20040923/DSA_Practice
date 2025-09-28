#Strings
str = "Reeja"
print(type(str))

#len()
print(len(str)) #5

#Negavtive Indexing
print(str[-1]) #a

#upper()
print(str.upper()) #REEJA

#lower()
print(str.lower()) #reeja

#capitalize()
print(str.capitalize()) #Reeja 

#replace()
print(str.replace("ee","i")) #Reeja

#strip()
n = "   Reeja   "
print(n.strip()) #Reeja

#split()
print(list(str)) #['R', 'e', 'e', 'j', 'a']
print(str.split(" ")) #['Reeja']
print(str.split("e")) #['R', '', 'ja']

#join
list1 = ['R','e','e','j','a']
print("".join(list1)) #Reeja
print("-".join(list1)) #R-e-e-j-a

#slicing
print(str[::2]) #Rja

#count()
print(str.count("e")) #2

#startswith()
print(str.startswith("R")) #True

#endswith()
print(str.endswith("z")) #False

#index()
print(str.index("a")) #4

#find()
print(str.find("r")) #-1