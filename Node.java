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
    private String key;
    private float value;
    private boolean isHashed;
    private int left;
    private int right;

    //default constructor
    //for instantiation of Node variables
    public Node(String keyP, float val)
    {
        key = keyP;
        value = val;
        left = -1;
        right = -1;
        isHashed = false;
    }

    //overload constructor
    //for instantiation of Node variables
    public Node(String k, float v, int l, int r)
    {
        key = k;
        value = v;
        left = l;
        right = r;

    }

    //returns boolean value that states if the Node is a leaf
    public boolean isLeaf()
    {
        return (left == -1 && right == -1);
    }

    // --------Left and Right Functions for set and get----
    //return left node value
    public int getLeft()
    {
        return left;
    }

    //return right node value
    public int getRight()
    {
        return left;
    }

    //set the right of the Node to specified value
    public void setRight(int x)
    {
        right = x;
    }

    //set the left of the Node to specified value
    public void setLeft(int x)
    {
        left = x;
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
}
