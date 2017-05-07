public class BinaryTree {

   class Node {

       String value;

       int num;

       Node lefty;
       Node righty;

       public Node(String tree) {

           value = tree;

           num = 1;

           lefty = righty = null;

       }

   }


   Node root;

   void BinarySearchTree()
   {

       root = null;

   }
        
      
      void insert(String value)
      {
        root = insertAnother(root, value);
      }
      
      
      Node insertAnother(Node root, String value)
      {
        if(root == null)
        {
          root = new Node(value);
          
          return root;
        }
        
        
        if(root.value.compareTo(value) == 0)
        {
          root.num += 1;
          
          return root;
        }
        
        else if(value.compareTo(root.value) < 0)
        {
          root.lefty = insertAnother(root.lefty, value);
        }
        
        else
        {
          root.righty = insertAnother(root.righty, value);
          
        }
        
        return root;
      }
      
      void inorder()
      {
        order(root);
      }
      
      
      void order(Node root)
      {
        if(root != null)
        {
          order(root.lefty);
          
          System.out.println(root.value + " " + root.num);
          
          order(root.righty);
        }
      }
      
      public boolean search(String value)
      {
        return searchValue(root, value);
      }
      
      private boolean searchValue(Node root, String value)
      {
        
        if(root == null)
        {
          return false;
        }
        
        if(root.value == value)
        {
          return true;
        }
        
        if(root.value.compareTo(value) > 0)
        {
          return searchValue(root.lefty, value);
        }
        
        return searchValue(root.righty, value);
      }
      
      void delete(String value)
      {
        root = deleteValue(root, value);
      }
      
      Node deleteValue(Node root, String value)
      {
        
        if(root == null)
        {
          return root;
        }
        
        
        if(value.compareTo(root.value) < 0)
        {
          root.lefty = deleteValue(root.lefty, value);
        }
        
        else if(value.compareTo(root.value) > 0)
        {
          root.righty = deleteValue(root.righty, value);
        }
        
        else
        {
          
          if(root.lefty == null)
          {
            return root.righty;
          }
          
          else if(root.righty == null)
          {
            return root.lefty;
          }
          
          root.value = minimum(root.righty);
          
          root.righty = deleteValue(root.righty, root.value);
        }
        
        return root;
      }
      
      String minimum(Node root)
      {
        String min = root.value;
        
        while(root.lefty != null)
          
        {
          min = root.lefty.value;
          
          root = root.lefty;
        }
        return min;
      }
      
      
   public static void main(String[] args) {

       BinaryTree tree = new BinaryTree();

       tree.insert("this");

       tree.insert("sentence");

       tree.insert("repeats");

       tree.insert("words");

       tree.insert("because");

       tree.insert("good");

       tree.insert("sentence");

       tree.insert("makes");

       tree.insert("repeats");

       tree.insert("sentence");

       tree.insert("makes");

       tree.inorder();

   }

}

