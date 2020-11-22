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
    private float key;
    private float value;
    private Node left;
    private Node right;

    //default constructor
    //for instantiation of Node variables
    public Node()
    {
        key = 0;
        value = 0;
        left = null;
        right = null;

    }

    //overload constructor
    //for instantiation of Node variables
    public Node(float k, float v, Node l, Node r)
    {
        key = k;
        value = v;
        left = l;
        right = r;

    }

    //returns boolean value that states if the Node is a leaf
    public boolean isLeaf()
    {
        return (left == null && right == null);
    }

    // --------Left and Right Functions for set and get----
    //return left node value
    public Node getLeft()
    {
        return left;
    }

    //return right node value
    public Node getRight()
    {
        return left;
    }

    //set the right of the Node to specified value
    public void setRight(Node x)
    {
        right = x;
    }

    //set the left of the Node to specified value
    public void setLeft(Node x)
    {
        left = x;
    }

    // --------key and value Functions for set and get----
    //returns key node value
    public float getKey()
    {
        return key;
    }

    //returns value node variable
    public Float getValue()
    {
        return value;
    }

    //set the key of the node to specified value
    public void setKey(float x)
    {
        key = x;
    }

    //set the value of the Node to specified value
    public void setValue(float x)
    {
        value = x;
    }

}
