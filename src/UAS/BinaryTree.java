package UAS;

public class BinaryTree {

      treeNode root;
   
   public boolean isEmpty(){
       return (root==null); 
    } 
 
    //method insert data 
    public void insert(treeNode input) {
        if (isEmpty()) {
            root = input; 
        } else { 
            // cari parent yg sesuai dan (kiri/kanan) 
            treeNode current = root; 
            treeNode parent = null; 
            boolean diKiri = true;                 
            while (current != null) {
                parent = current; 
                    // kalau data yang akan diinputkan lebih besar, 
                    // bergerak ke kanan 
                    if (current.data < input.data) {
                        current = current.right;
                        diKiri = false; 
                    // else gerak ke kiri 
                    } else if(current.data > input.data){
                        current = current.left;
                        diKiri = true; 
                    }else{ 
                        System.out.println("data "+input.data+" sudah ada"); 
                        break; 
                    } 
            } 
            // hubungkan ke parent             
            if (diKiri) { 
                parent.left = input; 
            } else { 
                parent.right = input; 
            } 
        }     
    } 
    public void preOrder(){
        preOrder(root); 
    } 
    public void inOrder(){
        inOrder(root); 
    } 
    public void postOrder(){
        postOrder(root); 
    }      
    public void preOrder(treeNode akar){
        if(akar != null){ 
            System.out.print(akar.data+" ");
            preOrder(akar.left);
            preOrder(akar.right); 
 }     
    }    
    public void inOrder(treeNode akar){
        if(akar != null){ 
            inOrder(akar.left); 
            System.out.print(akar.data+" "); 
            inOrder(akar.right); 
 } 
    }  
    public void postOrder(treeNode akar){
        if(akar != null){ 
            postOrder(akar.left);
            postOrder(akar.right); 
            System.out.print(akar.data+" ");  } 
    } 
 
    //method mencari data 
    public treeNode search(int key) { 
        treeNode node = null; 
        treeNode current = root; 
        // lakukan pencarian selama current bukan null
        while (current != null) {
            if (current.data == key) {
                return node; 
            } else { 
                if (current.data < key) {
                    current = current.right; 
                } else { 
                    current = current.left;                 
                } 
            }        
        } 
        return node; 
    }   
}
