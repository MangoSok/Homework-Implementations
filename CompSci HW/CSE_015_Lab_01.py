{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 name = input("Enter your name: ")\
print("Hello " + name)\
\
num = int(input("Enter an integer: "))\
if num % 2 == 1:\
    print("ODD")\
else:\
    print("EVEN")\
    \
i = 0\
array = []\
while i < 10:\
    num = int(input("Enter an integer #" + str((i+1)) + ": "))\
    array.append(num)\
    i += 1\
    \
largest = -1\
for x in array:\
    if x % 2 == 1 and x > largest:\
        largest = x\
if largest == -1:\
    print("No odd numbers were added")\
else:\
    print("Largest odd number in array is " + str(largest))}