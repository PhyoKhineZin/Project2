public class ConstructorDemo
{
    public static void main(String[] args) {
        Hello hello;

        //hello = new Hello(); //Error : Hello() so there is no argument passing in main and default constructor Hello() is not created

        hello = new Hello(3); //invoke Hello(int count) argument constructor to display Hello Java 3 times

        hello.greet();
    }
}
class Hello
{
    int count; //global variable

    Hello(int count) //local variable
    {
        this.count = count; //same name for both variable names "count" so this is used for local variable
    }
    void greet()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("Hello Java");
        }

    }
}
