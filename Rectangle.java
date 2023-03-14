class Rectangle
{
 double length=10;
 double breadth=30;

double calculateArea()
{
return length*breadth;
}
}

class Rectangle_main {
 
public static void main(String[] args) {
 double area;

Rectangle myrec = new Rectangle();
area = myrec.calculateArea();
System.out.println("the area of rectangle: " + area);
}
}