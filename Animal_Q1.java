package firstProject;

//Class Animal implementing both interfaces
class Animal_Q1 implements Crawlable, Moveable {

 @Override
 public void crawl() {
     System.out.println("Animal crawling");
 }

 @Override
 public void move() {
     System.out.println("Animal moving");
 }

 // Main method
 public static void main(String[] args) {
	 System.out.println("Made By Muhammad Kaif Shamim!");
     Animal_Q1 a = new Animal_Q1();
     a.crawl();
     a.move();
 }
}
