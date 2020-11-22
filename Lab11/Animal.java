//animal class

public class Animal extends BaseClass{
    private int type;
    private String foodRequired;
    private int age;
    private float weight;
    private Address address;

    public Animal()
    {
        foodRequired = "";
        age = 0;
        weight = 0;
        type = -1;
       
    }

    public Animal(int type2, String foodRequired2, int age2, float weight2, Address address2)
    {
        type = type2;
        foodRequired = foodRequired2;
        age = age2;
        weight = weight2;
        address = address2;

    }
    public void setType(int type2) {
		type = type2;
	}
	public void setFoodRequired(String fr) {
		foodRequired = fr;
	}
	public void setAge(int age2) {
		age = age2;
	}
	public void setWeight(float weight2) {
		weight = weight2;
	}
	public void setAddress(Address address2) {
		address = address2;
	}
	public int getType() {
		return type;
	}
	public String getFoodRequired() {
		return foodRequired;
	}
	public int getAge() {
		return age;
	}
	public Address getAddress() {
		return address;
    }
    public float getWeight()
    {
        return weight;
    }

    public String toString() {
        return "Animal [type=" + type + ", foodRequired=" + 
        foodRequired + ", age=" + age + ", weight=" + weight + ", address= "+ address + "]";
	}
}