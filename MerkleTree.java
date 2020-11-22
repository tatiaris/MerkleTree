/***************************************************************************
** File:    MerkleTree.java
** Project: CSCE 314 Project 1, Fall 2020
** Author:  Rishabh Tatia, Sunhee Kim
** Date:    11/07/20
** Section: 501
** E-mail:  tatiaris@tamu.edu, sunheek@tamu.edu
**
** This file contains the class MerkleTree, which defines all of the merkle
** tree's functions and operations, implementing all tree functionalities
** along with hashing capabilities to generate the secure structure.
** 
****************************************************************************/

// Import all dependencies for inputs and hashing here.
import java.util.*;

public class MerkleTree
{
    private Map<String, Integer> keyValMap = new HashMap<String, Integer>();
    private BinaryTree bt = new BinaryTree();
    private String merkleRoot;

    // MerkleTree (Constructor)
    // Instantiate the merkle tree
    public MerkleTree ()
    {
        merkleRoot = "";
        for (int i = 0; i < 7; i++) {
            bt.insert(i, "", "");
        }
    }

    public void setUsernamePassword(String username, String password) {
        String hashedPassword = hash(password);
        bt.insert(keyValMap.get(username), username, hashedPassword);
    }

    public void addUser(String username, int index) {
        keyValMap.put(username, index);
    }

    public int getUserIndex(String username) {
        return keyValMap.get(username);
    }

    public void generateMerkleRoot() {

    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    // hash
    // Given data, returns it's hashed string
    String hash(String data)
    {
        return "" + data.hashCode();
    }

    // combine
    // Given 2 hashes, combines them and returns a new hash
    String combine(String hash1, String hash2)
    {
        return "";
    }

    public int right_child(int i) {return 2*i + 2;}
    public int left_child(int i) {return 2*i + 1;}
    public int parent(int i) {return (i-1)/2;}
}
