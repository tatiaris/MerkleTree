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

// Driver class
// Main function which will use the merkle tree to implement the security system
public class Driver {
    public static void main(String args[])
    {
        MerkleTree t = new MerkleTree();
    }
}