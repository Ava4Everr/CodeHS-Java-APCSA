public class Company {
    
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name){
        this.name = name;
        this.streetAddress = null;
        this.city = null;
        this.state = null;
    }
    

    public Company(String name, String streetAddress, String city, String state){
       this.name = name;
       this.streetAddress = streetAddress;
       this.city = city;
       this.state = state;
    }

    public String getName(){
        return this.name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address(){
       String address = this.streetAddress + "\n" + this.city + ", " + this.state;
       return address;
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString(){
       return this.getName() + "\n" + this.address();
    }
}
