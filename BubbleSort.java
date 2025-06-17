public class BubbleSort{
	public static void bubbleSort(int[] arr){
        int n=arr.length;
		boolean swapped;
        for(int i=0; i<arr.length- 1;i++){
			swapped=false;
            for(int j =0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j + 1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
			if(!swapped)break;
        }
	}
	public static void main(String[] args){
		int[]arr={1,2,3,4,5};
		bubbleSort(arr);
		for(int num:arr)
			System.out.print(num+ " ");
	}
}
			
