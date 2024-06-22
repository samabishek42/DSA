package avl_tree;

public class AVL_Node {
    private int height;
        int value;
        AVL_Node leftchild;
        AVL_Node rightchild;

        public AVL_Node(int value) {
            this.value = value;
        }

    public AVL_Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVL_Node insert(AVL_Node roott, int value) {
        var node = new AVL_Node(value);
        if (roott == null) {
            roott = node;
        }
        if (roott.value < value) {
            roott.leftchild = insert(roott.leftchild, value);
        } else {
            roott.rightchild = insert(roott.rightchild, value);
        }
        root.height = 1 + Math.max(height(roott.leftchild), height(roott.rightchild));

        if(isLeftheavy(roott)){
            System.out.println(roott.value+"Left Heavy");
        } else if (isRightheavy(roott)) {
            System.out.println(roott.value+"Right Heavy");
        }
        return roott;
    }

    public int height(AVL_Node roott) {
        return (roott == null) ? -1 : roott.height;
    }

    public int balancefactor(AVL_Node roott){
        return (roott==null)?0:height(roott.leftchild)-height(roott.rightchild);
    }
    public boolean isLeftheavy(AVL_Node roott){
        return balancefactor(roott)>1;
    }
    public boolean isRightheavy(AVL_Node roott) {
        return balancefactor(roott) < -1;
    }
    public AVL_Node leftrotate(AVL_Node roott){
        AVL_Node newnode=roott.rightchild;

        roott.rightchild=newnode.leftchild;
        newnode.leftchild=roott;

       setHeight(roott);
       setHeight(newnode);
       return newnode;
    }

    public AVL_Node rightrotate(AVL_Node roott){
        AVL_Node newnode=roott.leftchild;

        roott.leftchild=newnode.rightchild;
        newnode.rightchild=roott;

        setHeight(roott);
        setHeight(newnode);
        return newnode;
    }

    public void setHeight(AVL_Node node){
        node.height=1+ Math.max(height(node.leftchild), height(node.rightchild));
        
    }

    private void balance(AVL_Node roott){
        if (isLeftheavy(roott)){
            if(balancefactor(roott.leftchild)<0)
                leftrotate(roott);
            rightrotate(roott);
        } else if (isRightheavy(roott)) {
            if (balancefactor(roott.rightchild)>0)
                rightrotate(roott);
            leftrotate(roott);
        }
    }


}