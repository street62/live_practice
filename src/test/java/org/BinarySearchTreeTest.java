package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void BSTTest() {
        BinarySearchTree.Node node = new BinarySearchTree.Node(3);
        node.add(3);
        node.add(5);
        node.add(13);
        node.add(-12314);
        node.add(Integer.MAX_VALUE);
        node.add(Integer.MIN_VALUE);

        Assertions.assertTrue(node.search(3));
        Assertions.assertTrue(node.search(5));
        Assertions.assertTrue(node.search(13));
        Assertions.assertTrue(node.search(-12314));
        Assertions.assertTrue(node.search(Integer.MAX_VALUE));
        Assertions.assertTrue(node.search(Integer.MIN_VALUE));

        Assertions.assertFalse(node.search(334));
        Assertions.assertFalse(node.search(9424892));

        Assertions.assertTrue(BinarySearchTree.Node.isValidBST(node));
        BinarySearchTree.Node.inOrderTraversal(node);
        System.out.println();
        BinarySearchTree.Node.preOrderTraversal(node);
        System.out.println();
        BinarySearchTree.Node.postOrderTraversal(node);
    }

    @Test
    public void BSTRecursiveTest() {
        BinarySearchTree.Node node = new BinarySearchTree.Node(3);
        node.addRecursive(3);
        node.addRecursive(5);
        node.addRecursive(13);
        node.addRecursive(-12314);
        node.addRecursive(Integer.MAX_VALUE);
        node.addRecursive(Integer.MIN_VALUE);

        Assertions.assertTrue(node.searchRecursive(3));
        Assertions.assertTrue(node.searchRecursive(5));
        Assertions.assertTrue(node.searchRecursive(13));
        Assertions.assertTrue(node.searchRecursive(-12314));
        Assertions.assertTrue(node.searchRecursive(Integer.MAX_VALUE));
        Assertions.assertTrue(node.searchRecursive(Integer.MIN_VALUE));

        Assertions.assertFalse(node.searchRecursive(334));
        Assertions.assertFalse(node.searchRecursive(9424892));

        Assertions.assertTrue(BinarySearchTree.Node.isValidBST(node));
    }

    @Test
    public void BSTStaticRecursiveTest() {
        BinarySearchTree.Node node = new BinarySearchTree.Node(3);
        BinarySearchTree.Node.addStaticRecursive(node, 3);
        BinarySearchTree.Node.addStaticRecursive(node, 5);
        BinarySearchTree.Node.addStaticRecursive(node, 13);
        BinarySearchTree.Node.addStaticRecursive(node, -12314);
        BinarySearchTree.Node.addStaticRecursive(node, Integer.MAX_VALUE);
        BinarySearchTree.Node.addStaticRecursive(node, Integer.MIN_VALUE);

        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, 3));
        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, 5));
        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, 13));
        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, -12314));
        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, Integer.MAX_VALUE));
        Assertions.assertTrue(BinarySearchTree.Node.searchStaticRecursive(node, Integer.MIN_VALUE));

        Assertions.assertFalse(BinarySearchTree.Node.searchStaticRecursive(node, 334));
        Assertions.assertFalse(BinarySearchTree.Node.searchStaticRecursive(node, 9424892));

        Assertions.assertTrue(BinarySearchTree.Node.isValidBST(node));
    }

    @Test
    public void deepCopyTest() {
        BinarySearchTree.Node node = new BinarySearchTree.Node(3);

        BinarySearchTree.Node.addStaticRecursive(node, 3);
        BinarySearchTree.Node.addStaticRecursive(node, 5);
        BinarySearchTree.Node.addStaticRecursive(node, 13);
        BinarySearchTree.Node.addStaticRecursive(node, -12314);
        BinarySearchTree.Node.addStaticRecursive(node, Integer.MAX_VALUE);
        BinarySearchTree.Node.addStaticRecursive(node, Integer.MIN_VALUE);

        BinarySearchTree.Node copied = BinarySearchTree.Node.deepCopy(node);

        BinarySearchTree.Node.inOrderTraversal(node);
        System.out.println();
        BinarySearchTree.Node.inOrderTraversal(copied);


    }

    @Test
    public void arrayToBstTest() {
        int[] nums = {1,2,3,4,5,6};
        BinarySearchTree.Node node = BinarySearchTree.Node.arrayToBst(nums);
        Assertions.assertTrue(BinarySearchTree.Node.isValidBST(node));
    }

}