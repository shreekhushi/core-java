class HeadSetExecutor{
  public static void main(String[] args){
  System.out.println("main started");
  
  String brand = HeadSet.getBrand();
  System.out.println("the headset brand is : " + brand);
  
  double price = HeadSet.getPrice();
  System.out.println("the headset price is : " + price);
  
  String color  = HeadSet.getColor();
  System.out.println("the headset color is : " + color);
  
  System.out.println("main ended");
  }
}