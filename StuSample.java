class StuSample {
  public static void main(String[] args) {
    Student stu1 = new Student();

    stu1.name = "数井";
    stu1.setScore(80,90);

    stu1.display();
    System.out.println("平均" + stu1.getAvg() +"点");
  }
}
