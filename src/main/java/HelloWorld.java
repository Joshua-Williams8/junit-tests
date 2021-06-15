public class HelloWorld {
  public static String hello(){
    return "Hello World";
  }
  public static String hello(String name) throws IllegalArgumentException{
    if (name == null){
      throw new IllegalArgumentException("Name needs to be given.");
    }
//    System.out.println("Hello " + name);
    //Souts can be printed and seen, incase you want to check values and certain points?
    return "Hello " + name;
  }

}
