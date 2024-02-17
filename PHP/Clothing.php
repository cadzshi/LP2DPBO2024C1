<?php
/* 
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan 
*/
//library
require('Product.php');

//deklarasi class Clothing yang menjadi anak class Product
class Clothing extends Product
{
     //private atribut
     private $size;
     private $material;
     private $gender;
     
     //constructor
     public function __construct($size = '', $material = '', $gender = '')
     {
         $this->size = $size;
         $this->material = $material;
         $this->gender = $gender;
     }
 
     //setter
     public function setSize($size)
     {
         $this->size = $size;
     }
     public function setMaterial($material)
     {
         $this->material = $material;
     }
     public function setGender($gender)
     {
         $this->gender = $gender;
     }
     
     //getter
     public function getSize()
     {
         return $this->size;
     }
     public function getMaterial()
     {
         return $this->material;
     }
     public function getGender()
     {
         return $this->gender;
     }
     
}
?>