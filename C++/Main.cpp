/*
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/
// library
#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <list>
#include "Shirt.cpp"

int main()
{
    // list
    list<Shirt> llist;
    // instansiasi
    Shirt temp;
    int menu = 0;
    string id, name, brand, price, size, material, gender, color, types;

    do
    {
        // output awal
        cout << "+-------------------------------+" << endl;
        cout << "| Latihan Praktikum DPBO 2 2024 |" << endl;
        cout << "+-------------------------------+" << endl;
        cout << "| Pilihan Menu :                |" << endl;
        cout << "| 1. Menambahkan Data           |" << endl;
        cout << "| 2. Menampilkan Data           |" << endl;
        cout << "| 3. Keluar Dari Program        |" << endl;
        cout << "+-------------------------------+" << endl;
        cout << "\n";
        // input user untuk pilihan menu
        cout << "Masukkan menu pilihan : ";
        cin >> menu;

        switch (menu)
        {
        // case 1 untuk menambahkan data
        case 1:
            system("cls");
            cout << "+------------------+" << endl;
            cout << "| Menambahkan data |" << endl;
            cout << "+------------------+" << endl;
            // input user
            cout << "ID Product          : ";
            cin >> id;
            cout << "Name Product        : ";
            cin >> name;
            cout << "Brand Product       : ";
            cin >> brand;
            cout << "Price Product       : ";
            cin >> price;
            cout << "Size Product        : ";
            cin >> size;
            cout << "Material Product    : ";
            cin >> material;
            cout << "Gender              : ";
            cin >> gender;
            cout << "Color Product       : ";
            cin >> color;
            cout << "Sleeve Type Product : ";
            cin >> types;
            // input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
            temp.setId(id);
            temp.setName(name);
            temp.setBrand(brand);
            temp.setPrice(price);
            temp.setSize(size);
            temp.setMaterial(material);
            temp.setGender(gender);
            temp.setColor(color);
            temp.setTypes(types);
            // objek dimasukkan ke list
            llist.push_back(temp);

            cout << "\nData berhasil ditambahkan!" << endl;
            break;
        case 2:
            system("cls");
            // cek apakah list kosong apa ngga
            if (llist.empty())
            {
                cout << "\n Data Masih Kosong!" << endl;
            }
            // kalo ngga print tabel
            else
            {
                // penanda kata terpanjang
                int longestId = 2, longestName = 4, longestBrand = 5, longestPrice = 5;
                int longestSize = 4, longestMaterial = 8, longestGender = 6;
                int longestColor = 5, longestTypes = 11;
                // mencari kata terpanjang masing-masing kolom
                for (list<Shirt>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if (it->getId().length() > longestId)
                    {
                        longestId = it->getId().length();
                    }
                    if (it->getName().length() > longestName)
                    {
                        longestName = it->getName().length();
                    }
                    if (it->getBrand().length() > longestBrand)
                    {
                        longestBrand = it->getBrand().length();
                    }
                    if (it->getPrice().length() > longestPrice)
                    {
                        longestPrice = it->getPrice().length();
                    }
                    if (it->getSize().length() > longestSize)
                    {
                        longestSize = it->getSize().length();
                    }
                    if (it->getMaterial().length() > longestMaterial)
                    {
                        longestMaterial = it->getMaterial().length();
                    }
                    if (it->getGender().length() > longestGender)
                    {
                        longestGender = it->getGender().length();
                    }
                    if (it->getColor().length() > longestColor)
                    {
                        longestColor = it->getColor().length();
                    }
                    if (it->getTypes().length() > longestTypes)
                    {
                        longestTypes = it->getTypes().length();
                    }
                }
                cout << "+------------------+" << endl;
                cout << "| Menampilkan Data |" << endl;
                cout << "+------------------+" << endl;

                // garis tabel
                //  ================================//
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestName; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestBrand; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestPrice; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestSize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestMaterial; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestGender; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestColor; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestTypes; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;

                // kolom
                //  ================================//
                cout << "| ID";
                for (int i = 0; i < longestId - 1; i++)
                {
                    cout << " ";
                }
                cout << "| Name";
                for (int i = 0; i < longestName - 4; i++)
                {
                    cout << " ";
                }
                cout << " | Brand";
                for (int i = 0; i < longestBrand - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Price";
                for (int i = 0; i < longestPrice - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Size";
                for (int i = 0; i < longestSize - 4; i++)
                {
                    cout << " ";
                }
                cout << " | Material";
                for (int i = 0; i < longestMaterial - 8; i++)
                {
                    cout << " ";
                }
                cout << " | Gender";
                for (int i = 0; i < longestGender - 6; i++)
                {
                    cout << " ";
                }
                cout << " | Color";
                for (int i = 0; i < longestColor - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Sleeve Type";
                for (int i = 0; i < longestTypes - 11; i++)
                {
                    cout << " ";
                }
                cout << " |" << endl;

                // garis tabel
                //  ================================//
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestName; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestBrand; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestPrice; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestSize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestMaterial; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestGender; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestColor; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestTypes; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;

                // isi tabel
                for (list<Shirt>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    cout << "| " << it->getId();
                    for (int j = 0; j < longestId - it->getId().length(); j++)
                    {
                        cout << " ";
                    }

                    cout << " | " << it->getName();
                    for (int j = 0; j < longestName - it->getName().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getBrand();
                    for (int j = 0; j < longestBrand - it->getBrand().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getPrice();
                    for (int j = 0; j < longestPrice - it->getPrice().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getSize();
                    for (int j = 0; j < longestSize - it->getSize().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getMaterial();
                    for (int j = 0; j < longestMaterial - it->getMaterial().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getGender();
                    for (int j = 0; j < longestGender - it->getGender().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getColor();
                    for (int j = 0; j < longestColor - it->getColor().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getTypes();
                    for (int j = 0; j < longestTypes - it->getTypes().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " |" << endl;
                }

                // garis tabel
                //  ================================//
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestName; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestBrand; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestPrice; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestSize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestMaterial; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestGender; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestColor; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestTypes; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;
            }
        default:
            break;
        }
        // case 3 ya keluar looping dan program berhenti
    } while (menu != 3);

    return 0;
};