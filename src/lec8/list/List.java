package lec8.list;

public interface List<T> {

	int size();						// Returns the number of elements in the list.

	boolean isEmpty();				// Returns true if list is empty, false otherwise.

	void clear();					// Empties the list (i.e., removes all elements).

	boolean contains(T element);	// Returns true if this list contains the specified element.

	void add(T element);			// Adds element to end of list.

	void add(int index, T element);	// Inserts the specified element at the specified position in
									// this list (optional operation). Shifts the element currently
    								// at that position (if any) and any subsequent elements to the
									// right (adds one to their indices).

	boolean remove(T element);		// Removes the first occurrence of the specified element
	 								// from this list, if it is present. Returns true if element
									// to remove was found, false if not.

	T remove(int index);			// Removes the element at the specified position in this list.
									// Shifts any subsequent elements to the left
									// (subtracts one from their indices). Returns element removed.

	
	T get(int index);				// Returns the element at the specified position in this list.
		

	T set(int index, T element);	// Replaces the element at the specified position in this list
									// with the specified element.
}
