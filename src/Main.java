public class Main {

    public static int binarySearch(int sortedArray[], int search, int min, int max)
    {


        while(min<=max)
        {
            int middle=(max+min)/2;

            if (sortedArray[middle]==search)
                return middle;
            else if (sortedArray[middle]<search) {
                min=middle+1;

            }else
                max=middle-1;

        }

        return -1;

    }

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6,7};

        System.out.println(Main.binarySearch(array,10,0,array.length-1));
        System.out.println(Main.runBinarySearchIteratively(array,10,0,array.length-1));
    }
}
