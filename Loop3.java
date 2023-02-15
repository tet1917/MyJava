public class Loop3 {
  public static void main(String[] args){
    int[] score = new int[3];

    score[0] = 80;
    score[1] = 100;
    score[2] = 70;

    String[] name = {"菅原","村山","田原"};
    for(int i=0; i < score.length; i++) {
      System.out.println(name[i] + "さん" +score[i]+"点");

    }
    System.out.println("受験者数"+name.length+"名");
  }
}
