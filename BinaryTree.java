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
  }
}