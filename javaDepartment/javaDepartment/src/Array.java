public class Array {
    private Tarefa[] arr;
    private int count;

    public Array(int size){
          arr = new Tarefa[size]; 
    }

    public void printArray(){

        for (int i = 0; i < count; i++) {
            String nomeTarefa = (arr[i].getNomeTar());
            System.out.println(nomeTarefa);
        }
    }

    public void insert(Tarefa ele){

        if (arr.length == count) { 


            Tarefa newArr[] = new Tarefa[2 * count];

            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];

            arr = newArr;
        }

        arr[count++] = ele;
    }
}
