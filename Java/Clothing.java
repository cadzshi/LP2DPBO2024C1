class Clothing extends Product
{
    //atribut private
    private String size;
    private String material;
    private String gender;

    //constructor
    public Clothing()
    {
        this.size = "";
        this.material = "";
        this.gender = "";
    }
    public Clothing(String size, String material, String gender)
    {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    //setter
    public void setSize(String size)
    {
        this.size = size;
    }
    public void setMaterial(String material)
    {
        this.material = material;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    //getter
    public String getSize()
    {
        return this.size;
    }
    public String getMaterial()
    {
        return this.material;
    }
    public String getGender()
    {
        return this.gender;
    }


}
