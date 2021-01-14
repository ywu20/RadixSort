import java.util.*;
public class Radix{
  public static int nth(int n, int col){
    if(col>=length(n)){
      return 0;
    }
    else{
    String nn=Integer.toString(n);
    return Integer.parseInt(nn.substring(nn.length()-col-1,nn.length()-col));
  }
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

public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
  for(int i=0;i<buckets.length;i++){
    original.extend(buckets[i]);
}
}

public static void radixSortSimple(SortableLinkedList data){
  int col=0;
  for(int i=0;i<data.size();i++){
    int l=length(data.get(i));
    if(l>col){
      col=l;
    }
  }
  SortableLinkedList[] buckets = new SortableLinkedList[10];
  for(int i=0;i<10;i++){
    buckets[i]=new SortableLinkedList();
  }
  for(int i=0;i<col;i++){
    while(data.size()>0){
      int d=data.remove(0);
    int colPut = nth(d,i);
    buckets[colPut].add(d);
  }
  merge(data,buckets);
}
}

public static void radixSort(SortableLinkedList data){
  SortableLinkedList negative=new SortableLinkedList();
  SortableLinkedList positive=new SortableLinkedList();
while(data.size()>0){
    int a=data.remove(0);
    if(Math.abs(a) !=a){
      negative.add(Math.abs(a));
    }else{
      positive.add(a);
    }
  }

  radixSortSimple(negative);
  radixSortSimple(positive);
  for(int i=negative.size()-1;i>=0;i--){
    data.add(negative.get(i) * -1);
  }
data.extend(positive);

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

  SortableLinkedList d=new SortableLinkedList();
  d.add(4);d.add(345);d.add(23);
  //radixSortSimple(d);
  d.add(-453);d.add(-23); d.add(-6);
  radixSort(d);
  System.out.println(d);
  }
}
