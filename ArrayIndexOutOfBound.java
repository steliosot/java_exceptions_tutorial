class ArrayIndexOutOfBound
{
	public static void main(String args[]) {
		try{
			int a[] = new int[5];
			a[6] = 9; // Accessing 7th element of the array
		}
		    catch(ArrayIndexOutOfBoundsException e){
			System.out.println ("Array Index is Out Of Bounds");
		}
	}
}

