/*
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/
// library
#include <iostream>
#include <string>

using namespace std;

// deklarasi class
class Product
{
    // atribut private
private:
    string id;
    string name;
    string brand;
    string price;

public:
    // constructor
    Product()
    {
        this->id = "";
        this->name = "";
        this->brand = "";
        this->price = "";
    }
    Product(string id, string name, string brand, string price)
    {
        this->id = id;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }

    // setter
    void setId(string id)
    {
        this->id = id;
    }
    void setName(string name)
    {
        this->name = name;
    }
    void setBrand(string brand)
    {
        this->brand = brand;
    }
    void setPrice(string price)
    {
        this->price = price;
    }

    // getter
    string getId()
    {
        return this->id;
    }
    string getName()
    {
        return this->name;
    }
    string getBrand()
    {
        return this->brand;
    }
    string getPrice()
    {
        return this->price;
    }

    // destructor
    ~Product()
    {
    }
};