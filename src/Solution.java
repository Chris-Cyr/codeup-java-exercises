
////  Definition for binary tree
//  public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(root==null) return result;
        Stack<ArrayList<Integer>> stack=new Stack<ArrayList<Integer>>();
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        list.add(root);
        while(!list.isEmpty())
        {
            ArrayList<TreeNode> Tplist=new ArrayList<TreeNode>();
            ArrayList<Integer> level=new ArrayList<Integer>();
            while(!list.isEmpty())
            {
                TreeNode node=list.remove(0);
                level.add(node.val);
                if(node.left!=null) Tplist.add(node.left);
                if(node.right!=null) Tplist.add(node.right);
            }
            stack.push(level);
            list=Tplist;
        }
        while(!stack.isEmpty())
        {
            result.add(stack.pop());
        }
        return result;
    }
}
