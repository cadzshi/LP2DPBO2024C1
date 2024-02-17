/*
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/
// library
#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

// deklarasi class yang menjadi anak dari Product
class Clothing : public Product
{
    // artribut private
private:
    string size;
    string material;
    string gender;

public:
    // constructor
    Clothing()
    {
        this->size = "";
        this->material = "";
        this->gender = "";
    }
    Clothing(string size, string material, string gender)
    {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    // setter
    void setSize(string size)
    {
        this->size = size;
    }
    void setMaterial(string material)
    {
        this->material = material;
    }
    void setGender(string gender)
    {
        this->gender = gender;
    }

    // getter
    string getSize()
    {
        return this->size;
    }
    string getMaterial()
    {
        return this->material;
    }
    string getGender()
    {
        return this->gender;
    }

    // destructor
    ~Clothing()
    {
    }
};
