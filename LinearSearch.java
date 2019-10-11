public class LinearSearch {
   public static void main(String args[]){
      int array[] = {1,2,3,4,6};
      int size = array.length;
      int value = 3;

      for (int i=0 ;i< size-1; i++){
         if(array[i]==value){
            System.out.println("Element found index is :"+ i);
         }else{
            System.out.println("Element not found");
         }
      }
   }
}
