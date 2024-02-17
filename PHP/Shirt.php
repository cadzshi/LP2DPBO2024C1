<?php
/* 
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan 
*/
//library
require('Clothing.php');

//deklarasi class Shirt yang menjadi anak class Clothing
class Shirt extends Clothing
{
     //private atribut
     private $color;
     private $types;
     
     
     //constructor
     public function __construct($color = '', $types = '')
     {
         $this->color = $color;
         $this->types = $types;
     }
 
     //setter
     public function setColor($color)
     {
         $this->color = $color;
     }
     public function setTypes($types)
     {
         $this->types = $types;
     }
     
     
     //getter
     public function getColor()
     {
         return $this->color;
     }
     public function getTypes()
     {
         return $this->types;
     }
     
     
}
?>