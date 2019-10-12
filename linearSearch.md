# Lineau Search Documentation

Linear Search is an element searching algorithm. This searching algorithm finds element in a list/array(number of elements) in a linear fashion(i.e. linearly). This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n) where n is the number of items.Advantage of using this algorithm is that it can be applied to unordered list of elements(i.e. unsorted elements in an array)

## Pseudocode

Suppose A is an array of N values and ELE is an element we want to search in array.


```
For I = 0 to N - 2
    If (A(I) == ele)
            return found element's Location
     End-If
 End-For

return element not found in array

```

### Linear Search does roughly N comparisons in order to find location of element in a array(i.e. list).
