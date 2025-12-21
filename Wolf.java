package firstProject;

class Wolf implements Animal_I, Predator
{
private int length;
public void move()
{
    System.out.println("Wolf is moving!");
}
public void hunt()
{
    System.out.println("Wolf is hunting!");
}
}
