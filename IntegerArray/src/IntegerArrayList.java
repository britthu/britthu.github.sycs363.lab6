
public class IntegerArrayList {
	
	private int[] anArray;
	private int length = 0;
	
	/**
	 * class constructor; initialize array.
	 * @param amount
	 */
	public IntegerArrayList( int amount){
		anArray = new int [amount];
	};
	
	/**
	 * class constructor; initializes array.
	 */
	public IntegerArrayList(){
		anArray = new int[20];
	};
	
	/**
	 * Adds an integer value to the end of the list/array
	 */
	public void add(){
		int value = 10;
		if(!(isEmpty())){
			anArray[length] = value;
			length++;
		}
		else{
			anArray[0] = value;
			length++;
		}
	};
	
	/**
	 * Insert an integer value at the specified index
	 * @param index
	 * @param value
	 */
	public void add(int index, int value){
		anArray[index] = value;
		length++;
	};
	
	/**
	 * Return the integer value at the specified index
	 * @param index
	 * @return
	 */
	public int get(int index){
		return anArray[index];
	};
	
	/**
	 * Return the index of the specified value in the list/array.  Return -1 if not present.
	 * @param value
	 * @return
	 */
	public int indexOf(int value){
		for (int i=0; i < anArray.length ; i++){
			if (anArray[i] == value){
				return i;
			}
		}
			
		return -1;
	};
	
	/**
	 * Return true if the list/array is empty, else false
	 * @return
	 */
	public boolean isEmpty(){
		if(length == 0)
			return true;
		else
			return false;
	};
	
	/**
	 * Remove and return the value from the specified index in the list/array.
	 * @param index
	 * @return
	 */
	public int remove(int index){
		int value = anArray[index];
		for(int i = index; i < (anArray.length)-1 ; i++){
			anArray[i]= anArray[i+1];
		}
		length--;
		return value;
	};

}
