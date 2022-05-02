package com.greatlearning.longestbranch.main;

import java.util.LinkedList;
import java.util.Queue;

public class LongestBranch {
	
	// Node Class for the tree
	static class Node {
		
		int data;
		Node right;
		Node left;
		
		Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	
	/**
	 * Function findLongestPath - Finds the longest path from given Node and returns queue with path nodes
	 * @param node
	 * @return Queue<Integer>
	 */
	static Queue<Integer> findLongestPath(Node node) {
		Queue<Integer> output = new LinkedList<>();
		
		if(node == null)
			return output;
		
		output.add(node.data);
		
		Queue<Integer> rightSubTree = findLongestPath(node.right);
		Queue<Integer> leftSubTree = findLongestPath(node.left);
		
		// Compare the size of the Queue
		if(rightSubTree.size() < leftSubTree.size()) {
			output.addAll(leftSubTree);
		} else {
			output.addAll(rightSubTree);
		}
		
		return output;
	}

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node(130);
		root.left.left = new Node(10);
		root.left.right = new Node(50);
		root.right.left = new Node(110);
		root.right.right = new Node(140);
		root.left.left.left = new Node(5);
		
		Queue<Integer> output = findLongestPath(root);

		while(!output.isEmpty()) {
			System.out.print(output.remove());
			
			if (output.peek() != null)
				System.out.print("->");
		}
		
		System.out.println();
	}

}

