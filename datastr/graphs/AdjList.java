package datastr.graphs;

import java.util.ArrayList;

import datastr.ListNode;

public class AdjList {
	/* This is adjacency list representation of graphs
	 * Operations involved are 
	 * 1. adding an edge
	 * 2. removing an edge // this is in partivcular difficult 
	 * */
	ArrayList<String> vertices;
	ListNode[] edges ;
	int vertexCount=0;
	public AdjList(int vertexCount) {
		this.vertexCount = vertexCount;
		for(int i=0;i<vertexCount;i++){
			//vertices.add(i);
			edges [i] = new ListNode(i);
		}
	}
	
	public void addVertex (String input){
		System.out.println("Have i added");
		if (vertexCount > vertices.size()) vertices.add(input);
	}
	
	public void addEdge(String src, String dest) {
		int i = vertices.indexOf(src);
		int j = vertices.indexOf(dest);
		if(i!=-1 && j!=-1) {
			edges[i].setNext(new ListNode(j));
			edges[j].setNext(new ListNode(i));
		}
	}
	
	
	
}
