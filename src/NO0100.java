public class NO0100 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int val){this.val = val;}
        }
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if((p == null && q != null) || (p != null && q == null)) return false;
            if(p == null && q == null) return true;
            if(p.val == q.val){
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
            return false;
        }

}
