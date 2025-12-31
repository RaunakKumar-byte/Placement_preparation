class Pen{
    String color;
    String type;


    public void write(){
        System.out.println("write something here....");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
      

      Student(){
        System.out.println("Constructor is called");
      }
}



public class data{

public static void main(String args[]){
Pen pen1=new Pen();
pen1.color="blue";
pen1.type="gel";


  Pen pen2=new Pen();
  pen2.color="red";
  pen2.type="ballpen";

  pen1.printcolor();
  pen2.printcolor();

}

}