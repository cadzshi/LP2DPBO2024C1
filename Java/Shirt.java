class Shirt extends Clothing
{
    //atribut
    private String color;
    private String types;

    //constructor
    public Shirt()
    {
        this.color = "";
        this.types = "";
    }
    public Shirt(String color, String types)
    {
        this.color = color;
        this.types = types;
    }

    //setter
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setTypes (String types)
    {
        this.types = types;
    }

    //getter
    public String getColor()
    {
        return this.color;
    }
    public String getTypes()
    {
        return this.types;
    }

}
