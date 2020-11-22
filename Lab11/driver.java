//driver file
import java.util.*;




public class driver{
    

    public static void main(String [] args)
    {
        Comparator<BaseClass> sortByState =  new Comparator<BaseClass>() {
            public int compare(BaseClass o1, BaseClass o2) {
                return o1.getAddress().getState().compareTo(o2.getAddress().getState());
            }
        };
        ArrayList <Animal> listOfValues = new ArrayList <Animal> ();
        ArrayList <Vehicle> listOfValues2 = new ArrayList <Vehicle> ();
        ArrayList <BaseClass> finalListVals = new ArrayList <BaseClass> ();
        Address a = new Address("TX", "Street name etc", 78123, "small town");
        System.out.println("===============Address Test =============");
        System.out.println(a);
        Animal an = new Animal(0, "dog food", 4, 10, a);
        System.out.println("===============Animal Test =============");
        System.out.println(an);
        Vehicle v = new Vehicle(0, "ASVJDFJS123", 5, 3, a);
        System.out.println("===============Vehicle Test =============");
        System.out.println(v);

        Address a2 = new Address("A", "Street name etc 2", 78124, "small town2");
        Address a3 = new Address("B", "Street name etc 3", 78125, "small town3");
        Address a4 = new Address("C", "Street name etc 4", 78126, "small town4");

        Animal an2 = new Animal(0, "dog food", 3, 30, a2);
        Animal an3 = new Animal(1, "cat food", 3, 26, a3);
        Animal an4 = new Animal(3, "Squirrel food", 6, 23, a4);
        listOfValues.add(an);
        listOfValues.add(an2);
        listOfValues.add(an3);
        listOfValues.add(an4);

        System.out.println("ANIMAL LIST OF VALUES BEFORE SORT");
        for(int i = 0; i < listOfValues.size(); i++)
        {
            System.out.println(listOfValues.get(i));
        }
        Collections.sort(listOfValues);
        System.out.println("ANIMAL LIST OF VALUES AFTER SORT");
        for(int i = 0; i < listOfValues.size(); i++)
        {
        
            System.out.println(listOfValues.get(i));
        }

        Vehicle v2 = new Vehicle(1, "ASVJDFJS1234", 3, 20, a2);
        Vehicle v3 = new Vehicle(2, "ASVJDFJS12345", 3, 21, a3);
        Vehicle v4 = new Vehicle(3, "ASVJDFJS12346", 3, 10, a4);
        listOfValues2.add(v);
        listOfValues2.add(v2);
        listOfValues2.add(v3);
        listOfValues2.add(v4);
        System.out.println("VEHICLE LIST OF VALUES BEFORE SORT");
        for(int i = 0; i < listOfValues.size(); i++)
        {
            System.out.println(listOfValues2.get(i));
        }
        Collections.sort(listOfValues2);
        System.out.println("VEHICLE LIST OF VALUES AFTER SORT");
        for(int i = 0; i < listOfValues.size(); i++)
        {
        
            System.out.println(listOfValues2.get(i));
        }

        
        finalListVals.add(v);
        finalListVals.add(v2);
        finalListVals.add(v3);
        finalListVals.add(v4);

        finalListVals.add(an);
        finalListVals.add(an2);
        finalListVals.add(an3);
        finalListVals.add(an4);
        System.out.println("Final LIST OF VALUES BEFORE SORT");
        for(int i = 0; i < finalListVals.size(); i++)
        {
            System.out.println(finalListVals.get(i));
        }
        Collections.sort(finalListVals, sortByState);
        System.out.println("Final LIST OF VALUES AFTER SORT");
        for(int i = 0; i < finalListVals.size(); i++)
        {
        
            System.out.println(finalListVals.get(i));
        }


    }
    

}