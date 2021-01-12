public class Radix{
  public static int nth(int n, int col){
    String nn=Integer.toString(n);
    return Integer.parseInt(nn.substring(col,col+1));
  }
  public static void main (String[] args){
    System.out.println(nth(123, 1));
  }
}
