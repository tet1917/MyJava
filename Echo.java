public class Echo {
  public static void main(String[] args) {
    int i;
    for(i = 0;i < args.length; i++){
      System.out.println(i+1+"個目の文字列:"+args[i]);
    }
    System.out.println("入力されてた文字列の数:"+i);
  }
}
