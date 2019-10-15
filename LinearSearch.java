/*
    SAMPLE OUTPUT(of the following code):
    Element found at index 5
*/
public class LinearSearch {
    //linearSearch() returns index of array if element is found else "-1" if element can't be found in array

    static int linearSearch(int arr[],int ele){
       
        int numberOfElements = arr.length;
        
        for(int index=0;index<numberOfElements;index++){
            if(arr[index] == ele){
                return index;
            }
        }

        return -1;
    }
   public static void main(String args[]){
      int sampleArray[] = {11,-1,23,35,42,67,84,99,202};        //sample list of elements in array
      int element = 67;                                         //element to search in array (list of numbers)

      int searchResult = linearSearch(sampleArray, element);    //result of the linearSearch()
      
      if(searchResult == -1){
          System.out.println("Element not found in array");
      }else{
          System.out.println("Element found at index "+searchResult);
      }
   }
}
/*
IMPLEMENTATION OF LINEAR-SEARCH (USING CONCEPT OF FUNCTIONS)


EXPLANATION:
In this java-code ,linear search is implemented thorugh functions which takes element to search(int ele) and elements in array(int arr[]) as parameters and returns postion of element in an array if element is found otherwise returns "-1" as a flag for not able to find element.

NOTE: this code is implemented for integeral elements. 
*/