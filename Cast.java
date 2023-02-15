class Cast {
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double late = 0.08;//消費税率8%とする。
    //int amount;
    double amount;

    //amount = (int)(price*(1+late));
    amount = (price*(1+late));
    System.out.println("税込金額:" + amount +"円");
  }
}
