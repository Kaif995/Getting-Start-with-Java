package firstProject;

class Balance {
String name;
Double bal;
Balance(String n, double b) {
name = n;
bal = b;
}
void show() {
if(bal<0)System.out.print("--> ");
System.out.println(name + ": $" + bal);
} }


