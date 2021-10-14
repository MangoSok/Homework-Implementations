# problem number 1

from logic import TruthTable

myTable_1 = TruthTable(['a'], ['- a'])

myTable_2 = TruthTable(['a', 'b'], ['a and b'])

myTable_3 = TruthTable(['a', 'b'], ['a or  b'])

myTable_4 = TruthTable(['a', 'b'], ['a -> b'])

myTable_5 = TruthTable(['a', 'b'], ['a <-> b'])


myTable_1.display()
print

myTable_2.display()
print

myTable_3.display()
print

myTable_4.display()
print

myTable_5.display()
print


# problem number 2

prop1 = input("Enter proposition 1: ")
prop2 = input("Enter proposition 2: ")

if len(prop1) > 3:
	table_1 = TruthTable([prop1[:1], prop1[len(prop1)-1:]], [prop1])
elif len(prop1) == 3:
	table_1 = TruthTable([prop1[len(prop1)-1:]], [prop1])
if len(prop2) > 3:
	table_2 = TruthTable([prop2[:1], prop2[len(prop2)-1:]], [prop2])
elif len(prop2) == 3:
        table_2 = TruthTable([prop2[len(prop2)-1:]], [prop2])

equivalent = True

# HERE I ENCOUNTERED AN INDEXING PROBLEM - TRUTHTABLE HAS NO ATTRIBUTE "getitem"
# I WAS UNABLE TO SOLVE THIS PROBLEM 

#for x in range(4):
#	arr1 = table_1[x]
#	arr2 = table_2[x]
#	arr1_1 = arr1[1]
#	arr2_2 = arr2[1]

#	if arr1_1[0] != arr2_2[0]:
#		equivalent = False
if equivalent:
	print "The propositions are equivalent"
else:
	print "The propositions are not equivalent"
