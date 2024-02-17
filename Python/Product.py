"""""
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
"""""
#deklarasi class
class Product():
    #atribut private
    __id = ""
    __name = ""
    __brand = ""
    __price = ""

    # constructor
    def __init__(self, id = "", name = "", brand = "", price =""):
        self.id = id
        self.name = name
        self.brand = brand
        self.price = price

    # setter
    def setId(self, id):
        self.__id = id
    def setName(self, name):
        self.__name = name
    def setBrand(self, brand):
        self.__brand = brand
    def setPrice(self, price):
        self.__price = price

    # getter
    def getId(self):
        return self.__id
    def getName(self):
        return self.__name
    def getBrand(self):
        return self.__brand
    def getPrice(self):
        return self.__price
