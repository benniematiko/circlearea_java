public class CircleArea{

  double radius;
  double area; 

  final double PI = 3.14159;

  CircleArea(double r){
    radius = r;
  }


  void calcArea(){
    area = PI * radius * radius;
    System.out.print("Area of cycle is: " + area);
  }


}