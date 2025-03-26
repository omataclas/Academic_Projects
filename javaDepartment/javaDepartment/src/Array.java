public class Array {
    private Tarefa[] arr; // creates array of Tarefa objects
    private int count; // counter for size of array

    // Constructor that recieves size param when instancing array object
    public Array(int size){
          arr = new Tarefa[size]; 
    }

    // Method to print array
    public void printArray(){ //ie. Array.printArray()

        for (int i = 0; i < count; i++) {// sets a loop as big as array size
            String nomeTarefa = (arr[i].getNomeTar());
            System.out.println(nomeTarefa); //prints array items
        }
    }

    // Method to insert element in array
    public void insert(Tarefa ele){ // i.e Array.insert("array item")

        if (arr.length == count) { // checks if array is max size

            // Creating a new array double the size
            // of array declared above
            Tarefa newArr[] = new Tarefa[2 * count];

            for (int i = 0; i < count; i++) // tranfering array items
                newArr[i] = arr[i];

            // Assigning new array to original array
            arr = newArr;
        }

        arr[count++] = ele; // passes ele to arrays last place
    }
}
