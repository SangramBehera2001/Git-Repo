public class SelectionSort {
  public static void main(String[] args) {
    int arr[] = {7,8,3,1,2};

    for(int i =0; i< arr.length-1; i++){
      
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] > arr[j]){
          int temp= arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
  }
  
 } 
 for(int k=0; k<arr.length; k++){
  System.out.print(arr[k] + " "); 
  }
}
}
