# LP2DPBO2024C1

## Janji

Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
Aamiin.

## Soal

Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance pada kelas - kelas tersebut:

- Product: idProduct, name, brand, price
- Clothing: size, material, gender
- Shirt: color, sleeve_type

## Desain Program

![image](https://cdn.discordapp.com/attachments/957671708058325032/1210253835378102292/image.png?ex=65e9e3b7&is=65d76eb7&hm=d2e69b5e3c687c97ee8ae2fe3405faf3c2960bb57515e7cdbbcb6bbc67277cb3&) <br>
Alasan desain program : <br>

a. Clothing is a Product, karena Clothing merupakan sebuah Product <br>
b. Shirt is a Clothing, Shirt merupakan bagian dari sebuah Clothing (Sebuah brand Clothing bisa menjual selain Shirt), dan pastinya Shirt adalah sebuah Product

A. Class Product:

- Atribut :

  - id : id dari product
  - name : nama dari product
  - brand : brand dari product
  - price : harga dari product

- Methods :
  - setId : menentukan value id
  - setName : menentukan value name
  - setBrand : menentukan value brand
  - setPrice : menentukan value price
  - getId : mendapatkan value id
  - getName : mendapatkan value name
  - getBrand : mendapatkan value brand
  - getPrice : mendapatkan value price

B. Class Clothing

- Atribut :
  - size : ukuran dari product
  - material : material dari product
  - gender : model baju tersebut (L/P)
- Methods :
  - setSize : menentukan value size
  - setMaterial : menentukan value material
  - setGender : menentukan value gender
  - getSize : mendapatkan value size
  - getMaterial : mendapatkan value material
  - getGender : mendapatkan value gender

C. Class Shirt

- Atribut :
  - color : warna dari product
  - types : jenis panjang lengan dari product
- Methods :
  - setColor : menentukan value color
  - setTypes : menentukan value types
  - getColor : mendapatkan value color
  - getTypes : mendapatkan value types

## Dokumentasi dan Alur Program

Untuk dokumentasi menggunakan screenshot yang sudah tersedia di masing-masing folder bahasa.

Lalu untuk alur program : <br>

1. Compile file sesuai bahasa
2. Run programnya
3. Ketika program berhasil dijalankan, maka akan keluar sebuah menu yang berisi 3 pilihan yaitu:
   - menambahkan data : untuk menambahkan data shirt
   - menampilkan data : untuk menampilkan keseluruhan isi data dengan table
   - keluar dari program
4. Semua bahasa sudah menggunakan alur yang ke-3 kecuali PHP karna di Hardcoded
