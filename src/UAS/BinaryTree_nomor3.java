package UAS;

public class BinaryTree_nomor3 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        treeNode node;
        node = new treeNode('60');
        tree.insert(node);
        
        node = new treeNode('40');
        tree.insert(node);
        
        node = new treeNode('30');
        tree.insert(node);
        
        node = new treeNode('50');
        tree.insert(node);
        
        node = new treeNode('80');
        tree.insert(node);
        
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        
        
        System.out.println("Fajriya Hasna Putri");
    }    
}
