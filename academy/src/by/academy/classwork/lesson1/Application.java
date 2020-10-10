package by.academy.classwork.lesson1;

public class Application {

	public static void main(String ...args) {
		
		Cat undefined = new Cat();
    	
        Cat murza = new Cat("Мурзик");
      
        System.out.println("Кота зовут "+murza.nickname);
      
        murza.sleep();
      
        murza.eat();
      
        murza.walk();
        
        undefined.grow();
      
        undefined.grow();
      
        undefined.grow();
      
        System.out.println("Коту "+undefined.age+" года");
        
	    }
}
