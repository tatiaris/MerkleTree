/***************************************************************************
** File:    Node.java
** Project: CSCE 314 Project 1, Fall 2020
** Author:  Rishabh Tatia, Sunhee Kim
** Date:    11/07/20
** Section: 501
** E-mail:  tatiaris@tamu.edu, sunheek@tamu.edu
**
** This file contains the class Node, which defines all of the merkle
** tree Node's functions and operations, implementing all Node 
** functionalities along with hashing capabilities to generate the secure structure.
**
****************************************************************************/

public class Node
{
    //declare necessary variables used throughout Node functions
    private int index;
    private String key;
    private String value;
    private boolean isHashed;

    //default constructor
    //for instantiation of Node variables
    public Node(int i, String keyP, String val)
    {
        index = i;
        key = keyP;
        value = val;
        isHashed = false;
    }

    //overload constructor
    //for instantiation of Node variables
    public Node(int i, String keyP, String val, boolean hashed)
    {
        index = i;
        key = keyP;
        value = val;
        isHashed = hashed;

    }

    //overload constructor
    //for instantiation of Node variables
    public Node(String k, String v)
    {
        key = k;
        value = v;
    }

    //returns boolean value that states if the Node is a leaf
    public boolean isLeaf()
    {
        return index > 7;
    }

    // --------Left and Right Functions for set and get----
    //return left node value
    public int getLeft()
    {
        return index*2 + 1;
    }

    //return right node value
    public int getRight()
    {
        return index*2 + 2;
    }

    // returns position of the parent within list
    public int getParent()
    {
        return (index-1)/2;
    }

    // --------key and value Functions for set and get----
    //returns key node value
    public String getKey()
    {
        return key;
    }

    //returns value node variable
    public String getValue()
    {
        return value;
    }

    //set the key of the node to specified value
    public void setKey(String x)
    {
        key = x;
    }

    //set the value of the Node to specified value
    public void setValue(String x)
    {
        value = x;
    }

    //returns index of the node
    public int getIndex()
    {
        return index;
    }

    //returns whether or not the node is hashed as a boolean
    public boolean isHashed()
    {
        return isHashed;
    }

    //sets the isHashed boolean to parameter
    public void setHashed(boolean h)
    {
        isHashed = h;
    }

    public String toString()
    {
        return "(" + key + ", " + value + ")";
    }
}
