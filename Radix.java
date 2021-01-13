import java.util.*;
public class Radix{
  public static int nth(int n, int col){
    String nn=Integer.toString(n);
    return Integer.parseInt(nn.substring(col,col+1));
  }

public static void merge(MyLinkedList original, MyLinkedList[] buckets){
  for(int i=0;i<buckets.length;i++){
    original.extend(buckets[i]);
  }
}
  public static int length(int n){
    String nn=Integer.toString(n);
    return nn.length();
  }


  public static void main (String[] args){

    /*
    System.out.println(nth(123, 1));
    System.out.println(length(123));
    MyLinkedList original=new MyLinkedList();
    MyLinkedList[] buckets=new MyLinkedList[10];
    for(int i=0;i<10;i++){
      MyLinkedList inBucket=new MyLinkedList();
      for(int j=0;j<3;j++){
        inBucket.add(Integer.toString(i*10+j));
      }
      buckets[i]=inBucket;
    }

merge(original,buckets);
merge(original, buckets);
for(int i=0;i<10;i++){
  buckets[i].add(Integer.toString(i*10+5));
}
merge(original, buckets);
    System.out.println(original);
  */
  }
}
