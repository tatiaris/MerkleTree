import java.util.ArrayList;
import java.util.*;
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

public class BinaryTree
{
    // Declare class variables here
    //public ArrayList <Node> TreeList2;
    public Node [] TreeList;
   // public Node TreeList;
    public Node TreeRoot;
    // BinaryTree (Constructor)
    // Instantiate the merkle tree
    public BinaryTree ()
    {
        TreeRoot = new Node(0, "", "");
        TreeList = new Node[1];
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

    // delete
    // Given the key to a node, delete the node from the tree
   /* void delete(String key)
    {
        int i = java.util.Arrays.asList(TreeList).indexOf(key)
    }

    // find
    // Given the key to a node, return the node
    Node find(String key)
    {
        Node x = new Node();
        return x;
    }

    // getSize
    // Returns the size of the tree
    int getSize()
    {
        return -990;
    }*/
}
