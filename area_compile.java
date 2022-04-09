//hardcoded values i.e compile time
class Shape
{ 
  void area(int a)
  {
   System.out.println(a*a);//println(a*a +'\n') wrong it adds ASCII value of '\n' with (a*a)
  }

  void area(int l,int b)
  {
  System.out.print(l*b);
  }

   public static void main(String[] args)
   {
    Shape s=new Shape();
    s.area(2);
    s.area(2,23);
   }
}
