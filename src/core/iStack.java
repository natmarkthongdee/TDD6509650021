package core;

public interface iStack {
	int getSize() ;
	boolean isEmpty() ;
	boolean isFull();
	void push(Object ele) throws Exception;
	Object pop();
	Object top();

}
