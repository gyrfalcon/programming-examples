package net.justinshepard.treevalidator;

import net.justinshepard.treevalidator.model.Department;

import java.util.List;

/**
 * Created by justinshepard on 2/14/17.
 */
public class TreeValidator {
    public boolean validate(List<Department> departments) {
        return false;
    }

    private class Tree {
        TreeNode root;
    }

    private class TreeNode {
        Department department;
        List<TreeNode> children;
    }
}
