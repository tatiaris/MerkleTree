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

public class MerkleTree extends BinaryTree
{
    private Map<String, Integer> keyValMap = new HashMap<String, Integer>();
    private String merkleRoot;

    // MerkleTree (Constructor)
    // Instantiate the merkle tree
    public MerkleTree ()
    {
        merkleRoot = "";
        for (int i = 0; i < 7; i++) {
            insert(i, "", "");
        }
    }

    // function to copy the previous version with the exception of one value 
    // for verification of single password
    public void copyWithException(String user, String pw, MerkleTree origTree)
    {
      Map<String, Integer> userMap = origTree.getKeyValMap();
      for (String key : userMap.keySet()) {
        Integer userIndex = userMap.get(key);
        if (key.equals(user)) {
          setUsernamePassword(key, pw);
        } else {
          insert(keyValMap.get(key), key, origTree.TreeList[userIndex].getValue());
          TreeList[keyValMap.get(key)].setHashed(true);
        }
      }
    }

    // getKeyValMap
    // returns the dictionary that contains usernames and their indexes
    public Map<String, Integer> getKeyValMap()
    {
        return keyValMap;
    }

    // setUsernamePassword
    // given username and password, inserts the info into the binary tree
    public void setUsernamePassword(String username, String password)
    {
        String hashedPassword = hash(password);
        insert(keyValMap.get(username), username, hashedPassword);
        TreeList[keyValMap.get(username)].setHashed(true);
    }

    // add
    // given username and index, adds a user to the database
    public void add(String username, int index)
    {
        keyValMap.put(username, index);
    }

    // getUserIndex
    // returns the position of username
    public int getUserIndex(String username)
    {
        return keyValMap.get(username);
    }

    // generateMerkleRooot
    // bootstrap function for generating the root hash
    public void generateMerkleRoot()
    {
        generateChildrenHash(0);
        merkleRoot = TreeList[0].getValue();
    }

    // generateChildrenHash
    // recursive function that fills in the merkle tree bottom up
    public void generateChildrenHash(int cur)
    {
        Node left = TreeList[cur*2+1];
        Node right = TreeList[cur*2+2];
        if (!left.isHashed() || !right.isHashed()) {
            generateChildrenHash(left.getIndex());
            generateChildrenHash(right.getIndex());
        }
        TreeList[cur].setKey(left.getKey() + right.getKey() + "Hashed");
        TreeList[cur].setValue(left.getValue() + right.getValue());
        TreeList[cur].setHashed(true);
    }

    // getMerkleRooot
    // returns the stored merkleRoot
    public String getMerkleRoot()
    {
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
}
