package datastr.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjMatrix {
	/* Adjacency Matrix representation of a graph will have a n*n matrix representing edge availablity
	 * Operations allowed:
	 * 1. Adding an edge
	 * 2. Removng an edge and
	 * 3. check the availablity of an adge
	 * 
	 * This particular representation of graph is suited for dense graphss
	 * */
	
	Vertex[] vertexList;
	Stack<Integer> stack = new Stack<Integer>();
	Queue<Integer> queue = new LinkedList<Integer>();
	boolean adjmatrix[][] ;
	int vertexCount=0;
	int maxVertices;
	public AdjMatrix(int count) {
		maxVertices = count;
		adjmatrix = new boolean [count][count];
		vertexList = new Vertex[count];
	}
	
	public void addVertex(char c) {
		//System.out.println("vertexcoe " + vertexCount + " char to be added " + c);
		vertexList[vertexCount++]=new Vertex(c);
	}
	
	public void addEdge(char src, char dest) {
		int i = getIndex(vertexList,src);
		int j = getIndex(vertexList,dest);
		if(i>=0 && j>=0 && i<vertexCount && j <vertexCount){
		//	System.out.println("Edge eaaded between " + src + dest + " i = " + i + " j " + j);
			adjmatrix[i][j] = true;
			adjmatrix[j][i] = true;
		}
	}
	public void removeEdge(char src, char dest) {
		int i = getIndex(vertexList,src);
		int j = getIndex(vertexList,dest);
		
		if(i>=0 && j>=0 && i<vertexCount && j <vertexCount){
			adjmatrix[i][j]=false;
			adjmatrix[j][i]=false;
		}
	}
	public boolean isEdge(char src, char dest) {
		int i = getIndex(vertexList,src);
		int j = getIndex(vertexList,dest);
		if(i>=0 && j>=0 && i<vertexCount && j <vertexCount){
			return adjmatrix[i][j];
		}
		return false;
	}
	
	public void dfs() {
		int i = 0;
		vertexList[0].visitFlag=true;
		System.out.println(vertexList[0].label);
		stack.push(0);
		while(!stack.isEmpty()){
			//System.out.println("Inserted elem " + stack.size());
			int v= getUnVisitedVertex(stack.peek());
			//System.out.println("Unvisitd edge " + v);
			if (v!=-1) {
				vertexList[v].visitFlag= true;
				System.out.println(vertexList[v].label);
				stack.push(v);
			}
			else{
				stack.pop();
			}
		}
		for(int i1=0;i1<vertexCount;i1++) vertexList[i1].visitFlag=false;
		
	}
	public int getUnVisitedVertex(int v) {
		int cynosure=-1;
		
		for(int i=0;i<vertexCount;i++) {
			//ssSystem.out.println(" hmm adjmatrix[i][v] " + adjmatrix[i][v] + vertexList[i].visitFlag);
			if(adjmatrix[v][i] && !vertexList[i].visitFlag) return i;
		}
		return cynosure;
	}
	
	public void bfs(){
		int i=0;
		System.out.println(vertexList[i].label);
		queue.add(i);
		vertexList[i].visitFlag= true;
		while(!queue.isEmpty()) {
			int tracker = getUnVisitedVertex(queue.peek());
			if(tracker==-1) queue.poll();
			else{
				queue.add(tracker);
				vertexList[tracker].visitFlag= true;
				System.out.println(vertexList[tracker].label);
			}
		
		}
		for(int i1=0;i1<vertexCount;i1++) vertexList[i1].visitFlag=false;
	}
public int getIndex(Vertex[] list, char c){
	for(int i=0; i<list.length;i++) {
		if(list[i].label==c) {
			return i;
		}
	}
	
	return -1;
}
	
}
class Vertex{
	char label;
	boolean  visitFlag = false;
	public Vertex(char c){
		this.label = c;
		visitFlag= false;
	}
}
