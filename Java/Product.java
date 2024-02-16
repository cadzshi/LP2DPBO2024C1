class Product 
{
    //atribut private
    private String id;         
    private String name;    
    private String brand;    
    private String price;

    //constructor
    public Product()
    {
        this.id = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }
    public Product(String id, String name, String brand, String price)
    {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //setter
    public void setId(String id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }

    //getter
    public String getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getPrice()
    {
        return this.price;
    }
}
