name = input("Enter your name: ")
print("Hello " + name)

num = int(input("Enter an integer: "))
if num % 2 == 1:
    print("ODD")
else:
    print("EVEN")
    
i = 0
array = []
while i < 10:
    num = int(input("Enter an integer #" + str((i+1)) + ": "))
    array.append(num)
    i += 1
    
largest = -1
for x in array:
    if x % 2 == 1 and x > largest:
        largest = x
if largest == -1:
    print("No odd numbers were added")
else:
    print("Largest odd number in array is " + str(largest))
