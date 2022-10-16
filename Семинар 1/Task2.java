//Реализовать алгоритм пирамидальной сортировки (HeapSort)


public class Task2 
{
    
    public static void main(String[] args) 
    {
        int arr[] = {3,2,4,5,1,10,9,8};

        System.out.println("Исходный массив: ");
        printArray(arr);
        sort(arr);
        printArray(arr);
    }

    public static int[] sort(int arr[]){
        for (int i = arr.length/2-1; i >= 0; i--) {
            arr = createHeap(arr, arr.length, i);
            printArray(arr);
        }
        for (int i = arr.length - 1; i >= 0;i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            arr = createHeap(arr, i, 0);
        }
        return arr;
    }

    static int[] createHeap(int arr[], int n, int i){
        int[] result = arr;

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (n > l && arr[largest] < arr[l]){
            largest = l;
        }

        if (n > r && arr[largest] < arr[r]){
            largest = r;
        }

        int tmp = arr[i];
        result[i] = arr[largest];
        result[largest] = tmp;
        if(l >= n && r >= n){
            return result;
        }
        else if (largest != i){
            createHeap(result, n, largest);
        }
        return result;
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------");
    }
}
