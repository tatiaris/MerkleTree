//gamemechanics file
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class GameMechanics{
    public static boolean BattleTester(ArrayList <? extends Character> x)
    {
        
        ListIterator<? extends Character> i = x.listIterator();
        while(i.hasNext())
        {
            if(!(i.next() instanceof Hero))
                return false;
        
        }
        return true;
    }
    public static void advancedWinChances(Character h, Character v)
    {
        double v1 = h.getHearts();
        double v2 = v.getHearts();
        boolean change1 = false;
        boolean change2 = false;
        System.out.println("ADVANCED WIN CHANCES : ");
        if((h instanceof Hero))
        {
            Hero temp = (Hero)h;
             if( temp.getArmour() == 100)
             {
                 //System.out.println("REACHED");
              v1 = h.getHearts()*1.5;
                change1 = true;
             }
           
        }
       
        if((v instanceof Hero))
        {
            Hero temp = (Hero)v;
             if( temp.getArmour() == 100)
             {
                 v2 = v.getHearts()*1.5;
                 change2 = true;
             }
           // 
        }
        while(v1 - Math.round(v1) != 0 || v2 - Math.round(v2) != 0)
        {
            v1*=10;
            v2*=10;
        }
        int val1 = (int )v1;
        int val2 = (int )v2;
        boolean smallFirst = (val1 < val2);
        System.out.println("Character "+ h.getName() + " ( " + val1+" hearts) " );
        System.out.println("Character "+ v.getName() + " ( " + val2+" hearts) " );
        int min = Math.min(val1, val2);
        int max = Math.max(val1, val2);
        if(max% min == 0)
        {
            if(smallFirst)
            System.out.println("The ratio is:  1 to " + max/min);
            else
            System.out.println("The ratio is: " + max/min + " to 1");
        }
         
        else
        {
            for(int i = 2; i <= min; i++)
            {
                while(min%i == 0 && max%i == 0)
                {
                    min/=i;
                    max/=i;
                }
            }
            if(!smallFirst)
            System.out.println("The ratio is:  "+ max + " to " + min);
            else
            System.out.println("The ratio is:  "+ min + " to " + max);
        }

            if(h.getHearts() > v.getHearts())
            {
                System.out.println("The character "+ h.getName() );
            }
            else if (h.getHearts() < v.getHearts())
            {
                System.out.println("The character "+ v.getName() );
            }
            else{
                System.out.println("The characters have equal number of hearts so they are tied");
            }



    }
    public static void sortedBattleFieldCharacters(ArrayList <? extends Character> characterList) {
        int i, j;
        for (i = 1; i < characterList.size(); i++) {
            Location l =  new Location(0, 0, 0);
            Hero key = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 100) ;
            key.setHearts(characterList.get(i).getHearts());
            key.setLocation(characterList.get(i).getLocation());
            key.setName(characterList.get(i).getName());
            j = i;
            while((j > 0) && (characterList.get(j - 1).getHearts() > key.getHearts())) {
                characterList.set(j, characterList.get(j - 1));
                j--;
            }
            characterList.set(j, key);
        }
    }

    public static void basicWinChances(Character h, Character v)
    {
        System.out.println("BASIC WIN CHANCES : ");

        if(((h instanceof Hero ) && (v instanceof Villain)) || ((v instanceof Hero ) && (h instanceof Villain)))
        {
            boolean smallFirst = (h.getHearts() < v.getHearts());
            System.out.println("Character "+ h.getName() + " ( " + h.getHearts()+" hearts) " );
            System.out.println("Character "+ v.getName() + " ( " + v.getHearts()+" hearts) " );
            int min = Math.min(h.getHearts(), v.getHearts());
            int max = Math.max(h.getHearts(), v.getHearts());
            if(max% min == 0)
            {
                if(smallFirst)
                System.out.println("The ratio is:  1 to " + max/min);
                else
                System.out.println("The ratio is: " + max/min + " to 1");
            }
             
            else
            {
                for(int i = 2; i <= min; i++)
                {
                    while(min%i == 0 && max%i == 0)
                    {
                        min/=i;
                        max/=i;
                    }
                }
                if(!smallFirst)
                System.out.println("The ratio is:  "+ max + " to " + min);
                else
                System.out.println("The ratio is:  "+ min + " to " + max);
            }
            
           // System.out.println("The ratio is:  " + (v.getHearts()) +" to " + (h.getHearts()));
            if(h.getHearts() > v.getHearts())
            {
                System.out.println("The character "+ h.getName() );
            }
            else if (h.getHearts() < v.getHearts())
            {
                System.out.println("The character "+ v.getName() );
            }
            else{
                System.out.println("The characters have equal number of hearts so they are tied");
            }
        }
        else 
         System.out.println("INCOMPATABLE TYPES CANNOT COMPARE");
    }
}