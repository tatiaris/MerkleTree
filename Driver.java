/***************************************************************************
** File:    Driver.java
** Project: CSCE 314 Project 1, Fall 2020
** Author:  Rishabh Tatia, Sunhee Kim
** Date:    11/07/20
** Section: 501
** E-mail:  tatiaris@tamu.edu, sunheek@tamu.edu
**
** This file contains the Driver for our implementation of the merkle tree. 
** In our implementation, we intend to make authentication at facilities
** more secure. Our implementation can be used when we want to verify 
** whether a certain individual is part of the authorized personel 
** at a facility.
** 
** For example: At the GenieBurger facility, to prevent tampering,
** the secret recipe can only be viewed by 'N' certain individuals when
** they're all together. The authentication process for all the individuals
** can be made efficient by implementing the merkle tree into the system.
** This implementation will generate the merkle root by collecting the
** data provided by the individuals (could be a password / a file / eye data)
** and comparing it to the corrext / secure merkle root.
**
** The merkle tree structure could further be used to authenticate a single
** person A, for entering the research room (for new ingredients) where
** we don't need all N individuals at the same time.
** 
****************************************************************************/
import java.util.Scanner;
import java.util.Map;
// Driver class
// Main function which will use the merkle tree to implement the security system
public class Driver {
    public static void main(String args[])
    {
        //generates a correct Version of the merkle tree for comparison in test cases
        MerkleTree correctVersion = new MerkleTree();
        correctVersion.addUser("A", 7);
        correctVersion.addUser("B", 8);
        correctVersion.addUser("C", 9);
        correctVersion.addUser("D", 10);
        correctVersion.addUser("E", 11);
        correctVersion.addUser("F", 12);
        correctVersion.addUser("G", 13);
        correctVersion.addUser("H", 14);

        correctVersion.setUsernamePassword("A", "passwordA");
        correctVersion.setUsernamePassword("B", "passwordB");
        correctVersion.setUsernamePassword("C", "passwordC");
        correctVersion.setUsernamePassword("D", "passwordD");
        correctVersion.setUsernamePassword("E", "passwordE");
        correctVersion.setUsernamePassword("F", "passwordF");
        correctVersion.setUsernamePassword("G", "passwordG");
        correctVersion.setUsernamePassword("H", "passwordH");

        // generates and sets the correct merkle root variable 
        correctVersion.generateMerkleRoot();
        String correctMerkleRoot = correctVersion.getMerkleRoot();
        
        
        

        // options
        // 1: Enter super secret lab
        //      requires all 8 passwords
        //      Enter key: A
        //      Enter password: Apassword!@#
        // 
        // 2: Enter research lab
        //      verifies one person's password

        //displays menu of options for verification of merkle tree and prompts user 
        Scanner scan = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter Option as Integer (1 or 2)");
        System.out.println("\tOption 1 (Requires All 8 Password for Verification)");
        System.out.println("\tOption 2 (Requires Single Password for Verification)");
        String val = scan.nextLine();

        //for the instance of invalid entry into menu
        while(!val.equals("1") && !val.equals("2"))
        {
            System.out.println("ERROR!! INVALID OPTION. Enter Option as Integer (1 or 2)");
            System.out.println("\tOption 1 (Requires All 8 Password for Verification)");
            System.out.println("\tOption 2 (Requires Single Password for Verification)");
            val = scan.nextLine();
        }

        //generates a temporary Merkle Tree for test cases to be edited and compared to with correct version
        MerkleTree tempVersion = new MerkleTree();
        tempVersion.addUser("A", 7);
        tempVersion.addUser("B", 8);
        tempVersion.addUser("C", 9);
        tempVersion.addUser("D", 10);
        tempVersion.addUser("E", 11);
        tempVersion.addUser("F", 12);
        tempVersion.addUser("G", 13);
        tempVersion.addUser("H", 14);

        //receives the key val map to prompt user for all usernames given the first option is required
        Map<String, Integer> x = tempVersion.getKeyValMap();

        // if option 1 selected proceed
        if(val.equals("1"))
        {

            for (String name : x.keySet())  
            {
                // prompts for password based on username using the keyval map and sets tempVersion Tree with password
                System.out.println("Enter the password for the Username "+ name + ": ");
                val = scan.nextLine();
                tempVersion.setUsernamePassword(name, val);
            }

            // calls generate Merkle Root to see if the verification
            tempVersion.generateMerkleRoot();
            
            //compares and displays if tree is equal based on merkle root of the temp and correct versions
            if(tempVersion.getMerkleRoot().equals(correctMerkleRoot))
                System.out.println("Passed all cases for verification");
            else{
                System.out.println("Did not pass all cases for verification");
            }
            System.out.println(correctVersion.toString());
            System.out.println(tempVersion.toString());
            // tempVersion.setUsername
        }
        else{ // if option 2 proceed

            // prompts user to enter password
            System.out.println("Enter the the Username to verify password for:");

            // receives the username and val
            String keyVal = scan.nextLine();
            val = scan.nextLine();

            //need to copy all values of the the previous corrected version with the exception of the single key specified
            tempVersion.copyWithException(keyVal, val, correctVersion);

            // calls generate Merkle Root to see if the verification
            tempVersion.generateMerkleRoot();
            
            //compares and displays if tree is equal based on merkle root of the temp and correct versions
            if(tempVersion.getMerkleRoot().equals(correctMerkleRoot))
                System.out.println("Passed all cases for verification");
            else{
                System.out.println("Did not pass all cases for verification");
            }
        }
        
        //closes the scanner
        scan.close();
    } 
}

