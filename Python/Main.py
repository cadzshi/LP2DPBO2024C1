#library
from Shirt import Shirt
import os

os.system('cls' if os.name == 'nt' else 'clear')

# deklarasi array
arr = []
menu = 0

# selama input bukan 3
while menu != 3:
    # output
    print("+-------------------------------+")
    print("| Latihan Praktikum DPBO 2 2024 |")
    print("+-------------------------------+")
    print("| Pilihan Menu :                |")
    print("| 1. Menambahkan Data           |")
    print("| 2. Menampilkan Data           |")
    print("| 3. Keluar Dari Program        |")
    print("+-------------------------------+")
    # input user
    menu = int(input("Masukkan menu pilihan : "))
    # menu 1 untuk menambahkan data
    if menu == 1:
        os.system('cls' if os.name == 'nt' else 'clear')
        print("+------------------+")
        print("| Menambahkan Data |")
        print("+------------------+")
        # input user
        id = input("ID Product          : ")
        name = input("Name Product        : ")
        brand = input("Brand Product       : ")
        price = input("Price Product       : ")
        size = input("Size Product        : ")
        material = input("Material Product    : ")
        gender = input("Gender              : ")
        color = input("Color Product       : ")
        types = input("Sleeve Type Product : ")
        # instansiasi
        temp = Shirt()
        #  input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
        temp.setId(id)
        temp.setName(name)
        temp.setBrand(brand)
        temp.setPrice(price)
        temp.setSize(size)
        temp.setMaterial(material)
        temp.setGender(gender)
        temp.setColor(color)
        temp.setTypes(types)
        # objek disatukan
        arr.append(temp)

        print("\nData berhasil ditambahkan!\n")
    # menu 2 untuk menampilkan data dengan tabel 
    elif menu == 2:
        os.system('cls' if os.name == 'nt' else 'clear')
        # cek apakah terdapat data, kalau ada
        if len(arr) != 0:
            print("+------------------+")
            print("| Menampilkan Data |")
            print("+------------------+")
            # penanda kata terpanjang
            longestId = 2 
            longestName = 4
            longestBrand = 5
            longestPrice = 5
            longestSize = 4
            longestMaterial = 8
            longestGender = 6
            longestColor = 5
            longestTypes = 11
            # mencari kata terpanjang 
            for i in arr:
                if len(i.getId()) > longestId:
                    longestId = len(i.getId())
                if len(i.getName()) > longestName:
                    longestName = len(i.getName())
                if len(i.getBrand()) > longestBrand:
                    longestBrand = len(i.getBrand())
                if len(i.getPrice()) > longestPrice:
                    longestPrice = len(i.getPrice())
                if len(i.getSize()) > longestSize:
                    longestSize = len(i.getSize())
                if len(i.getMaterial()) > longestMaterial:
                    longestMaterial = len(i.getMaterial())
                if len(i.getGender()) > longestGender:
                    longestGender = len(i.getGender())
                if len(i.getColor()) > longestColor:
                    longestColor = len(i.getColor())
                if len(i.getTypes()) > longestTypes:
                    longestTypes = len(i.getTypes())
            # print header table
            print(f"+-{'-' * (longestId + 1)}-+-{'-' * (longestName + 1)}-+-{'-' * (longestBrand + 1)}-+-{'-' * (longestPrice + 1)}-+-{'-' * (longestSize + 1)}-+-{'-' * (longestMaterial + 1)}-+-{'-' * (longestGender + 1)}-+-{'-' * (longestColor + 1)}-+-{'-' * (longestTypes+ 1)}-+")
            print("| ID ", "| Name", " " * (longestName - 4), "| Brand", " " * (longestBrand - 5), "| Price", " " * (longestPrice - 5), "| Size", " " * (longestSize - 4), "| Material", " " * (longestMaterial - 8), "| Gender", " " * (longestGender - 6), "| Color", " " * (longestColor - 5), "| Sleeve Type", " " * (longestTypes - 11), "|")
            print(f"+-{'-' * (longestId + 1)}-+-{'-' * (longestName + 1)}-+-{'-' * (longestBrand + 1)}-+-{'-' * (longestPrice + 1)}-+-{'-' * (longestSize + 1)}-+-{'-' * (longestMaterial + 1)}-+-{'-' * (longestGender + 1)}-+-{'-' * (longestColor + 1)}-+-{'-' * (longestTypes+ 1)}-+")
            
            # print isi tabel
            for i in arr:
                # kalau id kurang dari 10 (beda spasi aja)
                if int(i.getId()) < 10:
                    print(
                        f"| {i.getId()}", " " * (longestId - len(i.getId())),
                        f"| {i.getName()}", " " * (longestName - len(i.getName())),
                        f"| {i.getBrand()}", " " * (longestBrand - len(i.getBrand())), 
                        f"| {i.getPrice()}", " " * (longestPrice - len(i.getPrice())),
                        f"| {i.getSize()}", " " * (longestSize - len(i.getSize())), 
                        f"| {i.getMaterial()}", " " * (longestMaterial - len(i.getMaterial())), 
                        f"| {i.getGender()}", " " * (longestGender - len(i.getGender())), 
                        f"| {i.getColor()}", " " * (longestColor - len(i.getColor())), 
                        f"| {i.getTypes()}", " " * (longestTypes - len(i.getTypes())),
                        "|"
                    )
                # kalau id lebih dari 10 dan kurang dari 1000
                elif int(i.getId()) >= 10 and int(i.getId()) < 1000:
                    print(
                        f"| {i.getId()} ",
                        f"| {i.getName()}", " " * (longestName - len(i.getName())),
                        f"| {i.getBrand()}", " " * (longestBrand - len(i.getBrand())), 
                        f"| {i.getPrice()}", " " * (longestPrice - len(i.getPrice())),
                        f"| {i.getSize()}", " " * (longestSize - len(i.getSize())), 
                        f"| {i.getMaterial()}", " " * (longestMaterial - len(i.getMaterial())), 
                        f"| {i.getGender()}", " " * (longestGender - len(i.getGender())), 
                        f"| {i.getColor()}", " " * (longestColor - len(i.getColor())), 
                        f"| {i.getTypes()}", " " * (longestTypes - len(i.getTypes())),
                        "|"
                    )
            # garis paling bawah
            print(f"+-{'-' * (longestId + 1)}-+-{'-' * (longestName + 1)}-+-{'-' * (longestBrand + 1)}-+-{'-' * (longestPrice + 1)}-+-{'-' * (longestSize + 1)}-+-{'-' * (longestMaterial + 1)}-+-{'-' * (longestGender + 1)}-+-{'-' * (longestColor + 1)}-+-{'-' * (longestTypes+ 1)}-+") 
        # kalau datanya kosong   
        else:
            print("\nData Masih kosong!\n")
            



