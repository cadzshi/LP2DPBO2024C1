"""""
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
"""""

# library
from Product import Product

# deklarasi class yang menjadi anak dari product
class Clothing(Product):
    # atribut private
    __size = ""
    __material = ""
    __gender = ""
    
    # constructor
    def __init__(self, size = "", material = "", gender = ""):
        self.size = size
        self.material = material
        self.gender = gender
    
    # setter
    def setSize(self, size):
        self.__size = size
    def setMaterial(self, material):
        self.__material = material
    def setGender(self, gender):
        self.__gender = gender

    # getter
    def getSize(self):
        return self.__size
    def getMaterial(self):
        return self.__material
    def getGender(self):
        return self.__gender
    