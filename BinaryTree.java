/***************************************************************************
** File:    BinaryTree.java
** Project: CSCE 314 Project 1, Fall 2020
** Author:  Rishabh Tatia, Sunhee Kim
** Date:    11/07/20
** Section: 501
** E-mail:  tatiaris@tamu.edu, sunheek@tamu.edu
**
** This file contains the class BinaryTree, which defines all of the binary
** tree's functions and operations.
**
****************************************************************************/
// all class imports
import java.util.*;

public abstract class BinaryTree
{
    //public ArrayList <Node> TreeList2;
    public Node [] TreeList;
    public Node TreeRoot;

    // Instantiate the merkle tree
    public BinaryTree ()
    {
        TreeRoot = new Node(0, "", "");
        TreeList = new Node[15];
        TreeList[0] =  TreeRoot;
    }

    // insert
    // Given a key and it's relevant data, create a node
    // and insert it in the tree
    void insert(int pos, String key, String hashedData)
    {
        Node n = new Node(pos, key, hashedData);
        TreeList[pos] = n;
    }

    // add
    // given username and index, adds a user to the database
    public abstract void add(String username, int index);

    //displays all values belonging to the TreeList variable
    public String toString()
    {
        String data = "";
        for (int i = 1; i < 5; i++) {
            for (int j = (int)(Math.pow(2, i-1) - 1); j < (int)(Math.pow(2, i) - 1); j++) {
                data += TreeList[j].toString() + " ";
            }
            data += "\n";
        }
        return data;
    }

}
