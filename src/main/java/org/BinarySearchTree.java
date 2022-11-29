package org;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarySearchTree {
    // balanced, 포화 등 개념 확인!

    public static class Node {
        private final int value;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public void add(int value) {
            Node cur = this;

            while (cur.value != value) {
                if (value > cur.value) {
                    if (cur.right == null) {
                        cur.right = new Node(value);
                    }
                    cur = cur.right;
                } else {
                    if (cur.left == null) {
                        cur.left = new Node(value);
                    }
                    cur = cur.left;
                }
            }
        }

        public void addRecursive(int value) {
            if (this.value == value) {
                return;
            }

            if (value > this.value) {
                if (right == null) {
                    right = new Node(value);
                }
                right.addRecursive(value);
            } else {
                if (left == null) {
                    left = new Node(value);
                }
                left.addRecursive(value);
            }
        }

        public static Node addStaticRecursive(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            if (value < node.value) {
                node.left = addStaticRecursive(node.left, value);
            } else if (value > node.value) {
                node.right = addStaticRecursive(node.right, value);
            }
            return node;
        }

        public boolean search(int value) {
            Node cur = this;

            while (cur != null && cur.value != value) {
                if (value > cur.value) {
                    cur = cur.right;
                } else {
                    cur = cur.left;
                }
            }
            return cur != null;
        }

        public boolean searchRecursive(int value) {
            if (this.value == value) {
                return true;
            }
            if (value > this.value) {
                if (right == null) {
                    return false;
                }
                return right.searchRecursive(value);
            } else {
                if (left == null) {
                    return false;
                }
                return left.searchRecursive(value);
            }
        }

        public static boolean searchStaticRecursive(Node node, int value) {
            if (node == null) {
                return false;
            }
            if (value < node.value) {
                return searchStaticRecursive(node.left, value);
            } else if (value > node.value) {
                return searchStaticRecursive(node.right, value);
            }
            return true;
        }

        public static boolean isValidBST(Node node) {
            if (node == null) {
                return false;
            }

            if (node.left != null) {
                if (node.left.value < node.value) {
                    return isValidBST(node.left);
                }
                return false;
            }
            if (node.right != null) {
                if (node.right.value > node.value) {
                    return isValidBST(node.right);
                }
                return false;
            }
            return true;
        }

        public static Node findNode(Node node, int value) {
            if (node == null) {
                return null;
            }
            if (value < node.value) {
                return findNode(node.left, value);
            } else if (value > node.value) {
                return findNode(node.right, value);
            }
            return node;
        }

        public static void deleteStaticRecursive(Node node, int value) {
            // 추후 구현!
        }

        public static void inOrderTraversal(Node node) {
            if (node == null) {
                return;
            }

            inOrderTraversal(node.left);
            System.out.println(node.value);
            inOrderTraversal(node.right);
        }

        public static void preOrderTraversal(Node node) {
            if (node == null) {
                return;
            }

            System.out.println(node.value);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

        public static void postOrderTraversal(Node node) {
            if (node == null) {
                return;
            }

            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.value);
        }

        public static Node deepCopy(Node node) {
            if (node == null) {
                return null;
            }
            Node copied = new Node(node.value);

            copied.left = Node.deepCopy(node.left);
            copied.right = Node.deepCopy(node.right);

            return copied;
        }

        public static Node arrayToBst(int[] nums) {
            if (nums.length == 0) {
                return null;
            }

            int mid = nums.length / 2;

            Node node = new Node(nums[mid]);

            node.left = arrayToBst(Arrays.copyOfRange(nums, 0, mid));
            node.right = arrayToBst(Arrays.copyOfRange(nums, mid + 1, nums.length));

            return node;
        }
    }
}
