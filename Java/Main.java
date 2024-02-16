/*
    Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/
//library
import java.util.Scanner;
import java.util.ArrayList;
//deklarasi class
public class Main 
{
    public static void main(String[] args) 
    {
        //deklarasi array
        ArrayList<Shirt> list = new ArrayList<>();
        //instansiasi n inisialisasi
        int menu = 0;
        String id = "", name = "", brand = "", price = "", size = "", material = "", gender = "", color = "", types = "";
        Scanner scanner = new Scanner(System.in);
        //looping
        do {
            //output pilihan menu
            System.out.println("+-------------------------------+");
            System.out.println("| Latihan Praktikum DPBO 2 2024 |");
            System.out.println("+-------------------------------+");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Menambahkan Data");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Keluar Dari Program");
            //input user
            System.out.print("\nMasukkan menu pilihan : ");
            try 
            {
                menu = scanner.nextInt();    
            }
            catch (Exception e) 
            {
                System.out.println("Input tidak sesuai!");
            }
            //switch case
            switch (menu) 
            {
                //case 1 untuk menambahkan data
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    //input user
                    System.out.println("+------------------+");
                    System.out.println("| Menambahkan Data |");
                    System.out.println("+------------------+");

                    System.out.print("ID : ");
                    try 
                    {
                        id = scanner.next();    
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Name : ");
                    try 
                    {
                       name = scanner.next();    
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Brand : ");
                    try 
                    {
                       brand = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Price : ");
                    try 
                    {
                        price = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Size : ");
                    try 
                    {
                        size = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Material : ");
                    try 
                    {
                        material = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Gender : ");
                    try 
                    {
                        gender = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Color : ");
                    try 
                    {
                        color = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("Sleeve type : ");
                    try 
                    {
                        types = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }
                    //instansiasi
                    Shirt temp = new Shirt();
                    //input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
                    temp.setId(id);
                    temp.setName(name);
                    temp.setBrand(brand);
                    temp.setPrice(price);
                    temp.setSize(size);
                    temp.setMaterial(material);
                    temp.setGender(gender);
                    temp.setColor(color);
                    temp.setTypes(types);
                    //objek dimasukkan ke list
                    list.add(temp);

                    System.out.println("\n Data Berhasil Ditambahkan!");
                    break;
                    //case 2 untuk menampilkan data
                    case 2:
                    //untuk check apakah data kosonng atau tidak
                    boolean isEmpty = list.isEmpty();
                    if (isEmpty == true) 
                    {
                        System.out.println("Data Masih Kosong!");
                    }
                    else
                    {
                        //penanda kata terpanjang
                        int longestId = 2, longestName = 4, longestBrand = 5, longestPrice = 5;
                        int longestSize = 4, longestMaterial = 8, longestGender = 6;
                        int longestColor = 5, longestTypes = 6;
                        //mencari kata terpanjang
                        for (int i = 0; i < list.size(); i++) 
                        {
                            if (list.get(i).getId().length() > longestId) 
                            {
                                longestId = list.get(i).getId().length();
                            }
                            if (list.get(i).getName().length() > longestName) 
                            {
                                longestName = list.get(i).getName().length();
                            }
                            if (list.get(i).getBrand().length() > longestBrand) 
                            {
                                longestBrand = list.get(i).getBrand().length();
                            }
                            if (list.get(i).getPrice().length() > longestPrice) 
                            {
                                longestPrice = list.get(i).getPrice().length();
                            }
                            if (list.get(i).getSize().length() > longestSize) 
                            {
                                longestSize = list.get(i).getSize().length();
                            }
                            if (list.get(i).getMaterial().length() > longestMaterial) 
                            {
                                longestMaterial = list.get(i).getMaterial().length();
                            }
                            if (list.get(i).getGender().length() > longestGender) 
                            {
                                longestGender = list.get(i).getGender().length();
                            }
                            if (list.get(i).getColor().length() > longestColor) 
                            {
                                longestColor = list.get(i).getColor().length();
                            }
                            if (list.get(i).getTypes().length() > longestTypes) 
                            {
                                longestTypes = list.get(i).getTypes().length();
                            }
                        }
                        //garis tabel
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestName; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestBrand; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestPrice; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestSize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestMaterial; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestGender; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestColor; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestTypes; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");
                    
                        //kolom
                        // ================================//
                        System.out.print("| ID");
                        for (int i = 0; i < longestId - 1; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print("| Name");
                        for (int i = 0; i < longestName - 4; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Brand");
                        for (int i = 0; i < longestBrand - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Price");
                        for (int i = 0; i < longestPrice - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Size");
                        for (int i = 0; i < longestSize - 4; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Material");
                        for (int i = 0; i < longestMaterial - 8; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Gender");
                        for (int i = 0; i < longestGender - 6; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Color");
                        for (int i = 0; i < longestColor - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Types");
                        for (int i = 0; i < longestTypes - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.println(" |");

                        //garis lagi
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestName; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestBrand; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestPrice; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestSize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestMaterial; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestGender; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestColor; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestTypes; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");

                        //print isi tabel
                        // ================================//
                        for (int i = 0; i < list.size(); i++) 
                        {
                            System.out.print("| " + list.get(i).getId());
                            for (int j = 0; j < longestId - list.get(i).getId().length(); j++) 
                            {
                                System.out.print(" ");    
                            }

                            System.out.print(" | " + list.get(i).getName());
                            for (int j = 0; j < longestName - list.get(i).getName().length(); j++)  
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getBrand());
                            for (int j = 0; j < longestBrand - list.get(i).getBrand().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getPrice());
                            for (int j = 0; j < longestPrice - list.get(i).getPrice().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getSize());
                            for (int j = 0; j < longestSize - list.get(i).getSize().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getMaterial());
                            for (int j = 0; j < longestMaterial - list.get(i).getMaterial().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getGender());
                            for (int j = 0; j < longestGender - list.get(i).getGender().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getColor());
                            for (int j = 0; j < longestColor - list.get(i).getColor().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getTypes());
                            for (int j = 0; j < longestTypes - list.get(i).getTypes().length(); j++) 
                            {
                                System.out.print(" "); 
                            }
                            System.out.println(" |");
                        }
                        //garis
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestName; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestBrand; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestPrice; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestSize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestMaterial; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestGender; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestColor; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestTypes; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");
                    }
                default:
                    break;
            }
            //keluar program jika pilihan 3
        } while (menu != 3);
        scanner.close();
    }
}

