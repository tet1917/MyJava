class StuSample5 {
  public static void main(String[] args){
    Student5 stu1 = new Student5("菅原");
    stu1.setScore(80);
    stu1.display();

    Student5 stu2 = new Student5("村上");
    //stu2.engScore(-50);
    stu2.setScore(-50);
    stu2.display();
  }
}
