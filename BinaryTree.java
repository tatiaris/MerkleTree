import java.util.ArrayList;

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
    public ArrayList <Node> TreeList;
    public Node TreeRoot;
    // BinaryTree (Constructor)
    // Instantiate the merkle tree
    public BinaryTree ()
    {
        
    }

    // insert
    // Given a key and it's relevant data, create a node
    // and insert it in the tree
    void insert(String key, String hashedData)
    {

    }

    // delete
    // Given the key to a node, delete the node from the tree
    void delete(String key)
    {

    }

    // find
    // Given the key to a node, return the node
    Node find(String key)
    {
        Node x = new Node("", 0);
        return x;
    }

    // getSize
    // Returns the size of the tree
    int getSize()
    {
        return -990;
    }
}

// Master Copy
// rootHash
// ABSunheeCHash DEFRishabhHash
// ABHash SunheeCHash DEHash FRishabhHash
// A B C D E F: Rishabh:rtpw Sunhee:skpw

// Temp Copy
// rootHash
// ABSunheeCHash DEFRishabhHash
// ABHash SunheeCHash DEHash FRishabhHash
// A B Sunhee C D E  F:input Rishabh:input

// rishabh
// password123@#$23435

// 0: Node(key, val)
// 1: Node(key, val)
// ...
// 8: Node(A, APW)
// 9: Node(B, BPW)
// ...
// 14: Node(R, RPW)
// 15: Node(S, SPW)
