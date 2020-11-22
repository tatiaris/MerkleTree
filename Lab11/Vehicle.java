//vehicle class
public class Vehicle extends BaseClass{
    private int type;
    private String licensePlate;
    private int age;
    private float weight;
    private Address address;
    public Vehicle()
    {
        licensePlate = "";
        age = 0;
        weight = 0;
        type = -1;
       
    }
    
    public Vehicle(int type2, String licensePlate2, int age2, float weight2, Address address2)
    {
        type = type2;
        licensePlate = licensePlate2;
        age = age2;
        weight = weight2;
        address = address2;

    }

    // setters and getters for type variable
    public void setType(int type2)
    {
        type = type2;

    }
    public int getType()
    {
        return type;
    }


    public void setLicensePlate(String licensePlate2)
    {
        licensePlate = licensePlate2;
        
    }
    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setAge(int age2)
    {
        age = age2;
    }
    public int getAge()
    {
        return age;
    }

    public void setWeight(float weight2)
    {
        weight = weight2;
    }
    public float getWeight()
    {
        return weight;
    }

    public void setAddress(Address address2)
    {
        address = address2;
    }
    public Address getAddress()
    {
        return address;
    }
    

    public String toString() {
        return "Animal [type=" + type + ", licensePlate=" + 
        licensePlate + ", age=" + age + ", weight=" + weight + ", address= "+ address + "]";
	}
}