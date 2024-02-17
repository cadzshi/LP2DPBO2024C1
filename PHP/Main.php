<?php
/* 
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan 
*/
//library 
require ('Shirt.php');

//instansiasi
$shirt1 = new Shirt();
$shirt2 = new Shirt();
$shirt3 = new Shirt();
$shirt4 = new Shirt();
$shirt5 = new Shirt();

//setiap indeks akan diisi atribut dengan setter
$shirt1->setId("1");
$shirt1->setName("T-Shirt");
$shirt1->setBrand("Nike");
$shirt1->setPrice("299000");
$shirt1->setSize("M");
$shirt1->setMaterial("Cotton");
$shirt1->setGender("Unisex");
$shirt1->setColor("Black");
$shirt1->setTypes("Short");

$shirt2->setId("2");
$shirt2->setName("Polo Shirt");
$shirt2->setBrand("Adidas");
$shirt2->setPrice("259000");
$shirt2->setSize("L");
$shirt2->setMaterial("Polyester");
$shirt2->setGender("Man");
$shirt2->setColor("Blue");
$shirt2->setTypes("Short");

$shirt3->setId("3");
$shirt3->setName("Hoodie");
$shirt3->setBrand("Uniqlo");
$shirt3->setPrice("450000");
$shirt3->setSize("L");
$shirt3->setMaterial("Fleece");
$shirt3->setGender("Unisex");
$shirt3->setColor("White");
$shirt3->setTypes("Long");

$shirt4->setId("4");
$shirt4->setName("Blouse");
$shirt4->setBrand("ZARA");
$shirt4->setPrice("999000");
$shirt4->setSize("XL");
$shirt4->setMaterial("Sifon");
$shirt4->setGender("Woman");
$shirt4->setColor("Purple");
$shirt4->setTypes("Long");

$shirt5->setId("5");
$shirt5->setName("Crewneck");
$shirt5->setBrand("A Bathing Ape");
$shirt5->setPrice("3500000");
$shirt5->setSize("XXL");
$shirt5->setMaterial("Cotton");
$shirt5->setGender("Man");
$shirt5->setColor("Grey");
$shirt5->setTypes("Long");

//masukkan objek ke array
$shirt = array($shirt1, $shirt2, $shirt3, $shirt4, $shirt5);

//output
echo "<br> Data Shirt <br>";
//buat table
echo "<table border = '2'>";
echo "<tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand </th>
        <th>Price</th>
        <th>Size</th>
        <th>Material</th>
        <th>Gender</th>
        <th>Color</th>
        <th>Sleeve Type</th>
    </tr>";
//nampilin isi table
for ($i = 0; $i < 5; $i++) 
{
    echo "<tr>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getId() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getName() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getBrand() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getPrice() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getSize() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getMaterial() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getGender() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getColor() . "</td>";
    echo "<td style='padding: 10px;'>" . $shirt[$i]->getTypes() . "</td>";
    
    echo "</tr>";
}
echo "</table>";
?>