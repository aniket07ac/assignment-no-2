public class lowest_Array {
    public static void main(String[] args) {

        int [] arr={10, 25, 5, 15, 20};

        int i=0;
        int small=arr[0];

        for( i=0; i<arr.length;i++){

            if (small>arr[i])
            {
                small = arr[i];
            }

        }
        System.out.println(+small);


    }
}
