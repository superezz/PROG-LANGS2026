# name = input("Enter your name: ")
# # print ("Good After noon "+name)
# print(f"Good Aftenoon {name}")

letter = '''Dear <|Name|>,
         You are Selected!
         <|Date|>'''
print(letter.replace("<|Name|>" , "Arya").replace("<|Date|>","20 September 2029"))

