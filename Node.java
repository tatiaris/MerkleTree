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
    private float value;
    private boolean isHashed;

    //default constructor
    //for instantiation of Node variables
    public Node(int i, String keyP, float val)
    {
        index = i;
        key = keyP;
        value = val;
        isHashed = false;
    }

    public Node(int i, String keyP, float val, boolean hashed)
    {
        index = i;
        key = keyP;
        value = val;
        isHashed = hashed;
    }

    //overload constructor
    //for instantiation of Node variables
    public Node(String k, float v, int l, int r)
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
        return index*2;
    }

    //return right node value
    public int getRight()
    {
        return index*2 + 1;
    }

    // --------key and value Functions for set and get----
    //returns key node value
    public String getKey()
    {
        return key;
    }

    //returns value node variable
    public Float getValue()
    {
        return value;
    }
    
    //return the parent index
    public int getParent()
    {
        return (index-1)/2;
    }
    
    //set the key of the node to specified value
    public void setKey(String x)
    {
        key = x;
    }

    //set the value of the Node to specified value
    public void setValue(float x)
    {
        value = x;
    }

    public boolean isHashed() {
        return isHashed;
    }

    public void setHashed(boolean h) {
        isHashed = h;
    }
}
