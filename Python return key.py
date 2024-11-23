'''# print correct are wrong...

s_username="Praveen"
s_password="Stoner"

username=input("Enter username:")
password=input("Enter password:")

def validation():
    if(s_username==username and  s_password==password):
        return True
    else:
        return False
a=validation()
print(a)'''


# (a+b)*c...

'''def add(a,b):
    return a+b
a=int(input("Enter a:"))
b=int(input("Enter b:"))
c=int(input("Enter c:"))
add(a,b)

var=add(a,b)

out=var*c

print(out)'''

# Class and Object....


class croog:
    drink=" "
    def party(self):
        print("let's drink")
    def beach(self):
        print("Enjoy")

praveen = croog()
sanjay = croog()

praveen.party()
sanjay.beach()q
