public class LinearSearch {
   public static void main(String args[]){
      int a[] = {1,2,3,4,6};
      int value = 3,c=0;
      for (int i=0 ;i< a.length-1; i++){
         if(a[i]==value)
          System.out.println("Number found at"+(i+1));
        else 
           c++;         
      }
      if(c>0)
      System.out.println("Number not found");
}
}
