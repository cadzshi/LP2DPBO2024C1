"""""
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
"""""
# library
from Clothing import Clothing

# deklarasi class
class Shirt(Clothing):
    # atribut private
    __color = ""
    __types = ""

    # constructor
    def __init__(self, color = "", types = ""):
        self.__color = color
        self.__types = types
    
    # setter
    def setColor(self, color):
        self.__color = color
    def setTypes(self, types):
        self.__types = types
    
    # getter
    def getColor(self):
        return self.__color
    def getTypes(self):
        return self.__types

