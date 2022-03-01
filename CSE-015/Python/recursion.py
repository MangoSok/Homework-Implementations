import sys
sys.setrecursionlimit(100000)

def factorial(n):
    # Provide your code here
	if n==0:
		return 1
	return n*factorial(n-1)
        
print "factorial(5):", factorial(5)
# Expected 120

def fib(n):
    # Provide your code here
	if n==0 or n==1:
		return n
	return fib(n-1)+fib(n-2)
        
print "fib(7):", fib(7)
# Expected 13

def equal(A, B):
    # Provide your code here
	if not len(A) == len(B):
		return False
	if len(A) == 0:
		return True
	return (A[0] == B[0] and equal(A[1:],B[1:]))
    
print "equal('ALICE','BOB'):", equal('ALICE','BOB')
# Expected False
print "equal('ALICE', 'ALICE'):", equal('ALICE', 'ALICE')
# Expected True

def addup(list):
    # Provide your code here
	if len(list) == 0:
		return 0
	temp = list[0]
	list.pop(0)
	return (temp + addup(list))

print "addup([1,2,3,4,5]):", addup([1,2,3,4,5])
# Expected 15
print "addup(range(101)):", addup(range(101))
# Expected 5050

def reverse(A):
    # Provide your code here
	if len(A) == 0:
		return ""
	return reverse(A[1:]) + A[0]
        
print "reverse('hello'):", reverse('hello')
# Expected olleh