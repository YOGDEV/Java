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
{
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

/*class Xyz
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
