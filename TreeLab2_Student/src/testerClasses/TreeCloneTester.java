package testerClasses;

import treeClasses.LinkedTree;

public class TreeCloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedTree<String> t = new LinkedTree<>();
		LinkedTree<String> t1 = t.clone();

	}

}
