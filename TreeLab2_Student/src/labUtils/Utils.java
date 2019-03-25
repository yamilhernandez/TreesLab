package labUtils;

import java.util.ArrayList;
import java.util.Iterator;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 

	}

	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		
		t.addRoot(4);
		t.addChild(t.root(), 9);
		t.addChild(t.root(), 20);
		ArrayList<Position<Integer>> rootIter = (ArrayList<Position<Integer>>) t.children(t.root());
		for (Position<Integer> p: rootIter) {
			if(p.getElement()==9) {
				t.addChild(p, 7);
				t.addChild(p, 10);
			}
			else {
				t.addChild(p, 15);
				t.addChild(p, 21);
				for(Position<Integer> two: t.children(p)) {
					if(two.getElement()==15) {
						t.addChild(two, 12);
						t.addChild(t.addChild(two, 17), 19);

					}
					else {
						t.addChild(two, 40);
						for(Position<Integer> four: t.children(two) ) {
							t.addChild(four, 30);
							t.addChild(four, 45);
						}
					}
				}
			}

		}

		return t; 
	}

	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		t.addLeft(t.root(), 9);
		t.addRight(t.root(), 20);
		ArrayList<Position<Integer>> rootIter = (ArrayList<Position<Integer>>) t.children(t.root());
		for(Position<Integer> p: rootIter) {
			if(p.getElement()==9) {
				t.addLeft(p, 7);
				t.addRight(p, 10);
			}
			else {
				t.addLeft(p, 15);
				t.addRight(p, 21);
				for(Position<Integer> n : t.children(p)) {
					if(n.getElement()==15) {
						t.addLeft(n, 12);
						t.addLeft(t.addRight(n, 17), 19);
					}
					else {
						t.addRight(n, 40);
						for(Position<Integer> four: t.children(n) ) {
							t.addLeft(four, 30);
							t.addRight(four, 45);
						}
					}
				}
			}
		}


		return t; 
	}


}
