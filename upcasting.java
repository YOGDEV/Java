//runtime polymorphism...
//jvm...
class Bank
{
  float getROI()
  {
  return 2.0f;
  }
 public static void main(String[] args)
 {
  Bank b=new Bank();
  System.out.println(b.getROI());
  b=new HDFC();
  System.out.println(b.getROI());
  b=new SBI();
  System.out.println(b.getROI());
  b=new PNB();
  System.out.println(b.getROI());
 }
}

class HDFC extends Bank
{ /*void show() //calling this metnod by refrence of parent class Bank will generate error...only same name method are alllowed...
   {
   System.out.println("hii...");
   }*/
   
  float getROI()
  {
  return 4.0f;
  }
}

class SBI extends Bank
{
  float getROI()
  {
  return 4.5f;
  }
}

class PNB extends Bank
{
  float getROI()
  {
  return 5.0f;
  }
}

/*class Xyz // this also runs...
{
 public static void main(String[] args)
 {
  Bank b=new Bank();
  System.out.println(b.getROI());
  b=new HDFC();
  System.out.println(b.getROI());
  b=new SBI();
  System.out.println(b.getROI());
  b=new PNB();
  System.out.println(b.getROI());
 }
}

*/
