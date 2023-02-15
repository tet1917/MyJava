public class Cicle {
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    //double area;
    double area;

    area = radius * radius * pi;
    System.out.println("半径:" + radius);
    System.out.println("面積:" + area);
  }
}
