# wap to manu driven code
import sys
def addition():
    a=int(input("enter a value:"))
    b=int(input("enter b value:"))
    print("Addition=",a+b)
def substraction():
    a=int(input("enter a value:"))
    b=int(input("enter b value:"))
    print("Substraction=",a-b)
def multiplication():
    a=int(input("enter a value:"))
    b=int(input("enter b value:"))
    print("Multiplication=",a*b)
def Division():
    a=int(input("enter a value:"))
    b=int(input("enter b value:"))
    print("Division=",a/b)
while True:
    print("1.Addition:")
    print("2.Substraction:")
    print("3.Multiplication:")
    print("4.Division:")
    print("5.exit")
    choice=int(input("enter your choice:"))
    if choice==1:
        addition()
    elif choice==2:
        substraction()
    elif choice==3:
        multiplication()
    elif choice==4:
        Division()
    elif choice==5:
        sys.exit()
