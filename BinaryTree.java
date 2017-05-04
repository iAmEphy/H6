import java.util.*;
import java.io.*;


public class BinaryTree {
  
  static Node r;
  static int in = 0;
  
  class Node
  {
    String value;
    Node left;
    Node right;
    
    Node(String val)
    {
      value = val;
      left = null;
      right = null;
    }
    
    Node(String x, Node lefty, Node righty)
    {
      value = x;
      left = lefty;
      right = righty;
    }
    
    public String getValue()
    {
    return value;
    }
  }
  
  Node theTree(String array[], int string, int end)
  {
    if(string > end)
    {
      return null;
    }
    
    Node currentNode = new Node(array[in++]);
    
    if(string == end)
    {
      return currentNode;
    }
    
    int indexx = search(array, string, end, currentNode.value);
    
  }
 }