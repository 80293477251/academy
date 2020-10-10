package by.academy.classwork.lesson1;

public class Cat {
	
	int age=0;
	String nickname;
	
	public void grow(){
		age++;
	}

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }
    
    public void walk() {
        System.out.println("Кот гуляет");
    }
    
    public Cat(){
    }
    
    public Cat(String nickname) {
        this.nickname = nickname;
    }
        
}