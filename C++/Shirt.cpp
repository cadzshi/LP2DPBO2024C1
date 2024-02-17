/*
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/

// library
#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

// deklarasi class shirt yang menjadi anak dari class Clothing,
class Shirt : public Clothing
{
    // atribut private
private:
    string color;
    string types;

public:
    // constructor
    Shirt()
    {
        this->color = "";
        this->types = "";
    }
    Shirt(string color, string types)
    {
        this->color = color;
        this->types = types;
    }

    // setter
    void setColor(string color)
    {
        this->color = color;
    }
    void setTypes(string types)
    {
        this->types = types;
    }

    // getter
    string getColor()
    {
        return this->color;
    }
    string getTypes()
    {
        return this->types;
    }

    // destructor
    ~Shirt()
    {
    }
};
