<?php
/* 
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan 
*/

//deklarasi class
class Product
{
    //private atribut
    private $id;
    private $name;
    private $brand;
    private $price;

    //constructor
    public function __construct($id = '', $name = '', $brand = '', $price = '')
    {
        $this->id = $id;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    //setter
    public function setId($id)
    {
        $this->id = $id;
    }
    public function setName($name)
    {
        $this->name = $name;
    }
    public function setBrand($brand)
    {
        $this->brand = $brand;
    }
    public function setPrice($price)
    {
        $this->price = $price;
    }

    //getter
    public function getId()
    {
        return $this->id;
    }
    public function getName()
    {
        return $this->name;
    }
    public function getBrand()
    {
        return $this->brand;
    }
    public function getPrice()
    {
        return $this->price;
    }
}
?>