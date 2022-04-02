//string 
class Xyz{
public static void main(String[] args){
 String s1="ABC";//here s1 is a reference of "ABC"
 String s2="ABC";
 String s3=new String("abc");
System.out.println("s1 = "+s1);
System.out.println("s2 = "+s2);
System.out.println("s2 = "+s3+"\n");
System.out.println(s1.equalsIgnoreCase(s3));//"ABC" is equal to "abc" using "equalsIgnoreCase()" method 

s1="acd";//new object is created and now s1 is a reference of "acd" not of "ABC"

System.out.println("s1 = "+s1);
System.out.println("s2 = "+s2);
System.out.println("s2 = "+s3);

System.out.println(s1.length());
System.out.println(s1.charAt(0));
System.out.println(s1.equals(s2));

s1="Hello";//here s1 is working like a pointer we can say , and now s1 is a reference of "Hello"...
System.out.println(s1.concat("java"));
System.out.println(s1);//string are immutable

}
}
