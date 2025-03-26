public class Array {
    private int arr[]; // creates array of whatever type
    private int count; // counter for size of array

    // Method to return length of array
    public Array(int size){
          arr = new int[size]; 
    }

    // Method to print array
    public void printArray(){ //ie. Array.printArray()

        for (int i = 0; i < count; i++) // sets a loop as big as array size
            System.out.println(arr[i]); //prints array items
    }

    // Method to insert element in array
    public void insert(int ele){ // i.e Array.insert("array item")

        if (arr.length == count) { // checks if array is max size

            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];

            for (int i = 0; i < count; i++) // tranfering array items
                newArr[i] = arr[i];

            // Assigning new array to original array
            arr = newArr;
        }

        arr[count++] = ele; // passes ele to arrays last place
    }
}
