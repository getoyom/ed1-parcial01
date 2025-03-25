package ed.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null) {
            return ;
        }
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> current = root;
        if(root.right != null) {
            stack.push(root.right);

        }
        if(root.left != null) {
            stack.push(root.left);

        }
        while (!stack.isEmpty()) {
            TreeNode<Integer> curr = stack.pop();
            current.right = curr;

            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
            current.left = null;
            current = current.right;
        }
    }
}






















