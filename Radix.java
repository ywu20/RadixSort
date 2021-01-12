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
    System.out.println(nth(123, 1));
    System.out.println(length(123));
    System.out.println();
  }
}
