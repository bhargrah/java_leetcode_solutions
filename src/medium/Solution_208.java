package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * @author rahulbhargava
 * @category 208. Implement Trie (Prefix Tree)
 * @see https://leetcode.com/problems/implement-trie-prefix-tree/
 */

class Trie {

	class Node {
		char alphabet;
		boolean isWord;
		Node[] children;
		String word;

		public Node(char c) {
			alphabet = c;
			children = new Node[26];
		}
	}

	Node root;

	/** Initialize your data structure here. */
	public Trie() {
		root = new Node('\0');
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		Node curr = root;

		for (char element : word.toCharArray()) {
			if (curr.children[element - 'a'] == null)
				curr.children[element - 'a'] = new Node(element);

			curr = curr.children[element - 'a'];
		}
		curr.isWord = true;
		curr.word = word;
	}

	public Node getNode(String word) {
		Node curr = root;

		for (char element : word.toCharArray()) {

			if (curr.children[element - 'a'] == null)
				return null;

			curr = curr.children[element - 'a'];
		}

		return curr;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		Node curr = getNode(word);
		return curr != null && curr.isWord == true;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		return getNode(prefix) != null;
	}

	/** Returns all word starts with in the trie. */
	public List<String> searchAllValidWordsWithPrefix(String word) {

		// 1. Reach to the node
		// 2. Start iterating the children
		// 3. Put each node onto stack and inspect
		// 4. Print node value where isWord is true

		Node curr = getNode(word);
		Stack<Node> stack = new Stack<>();
		List<String> possibleWords = new ArrayList<>();

		while (curr != null) {

			for (Node node : curr.children) {
				if (node != null) {
					if (node.isWord == true)
						possibleWords.add(node.word);
					stack.add(node);
				}
			}

			if (stack.isEmpty())
				break;

			curr = stack.pop();
		}

		System.out.println(possibleWords);

		return null;
	}

}

public class Solution_208 {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("cats");
		words.add("caps");
		words.add("cat");

		Trie obj = new Trie();

		for (String word : words)
			obj.insert(word);

		boolean param_2 = obj.search("cat");
		System.out.println(param_2);

		boolean param_3 = obj.startsWith("ca");
		System.out.println(param_3);

		obj.searchAllValidWordsWithPrefix("ca");

	}

}
