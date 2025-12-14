package firstProject;

public class BoxWeight extends Box {
double weight;
// construct clone of an object
BoxWeight(BoxWeight ob) { // pass object to constructor
super(ob);
weight = ob.weight;
}
// constructor used when all dimensions specified
BoxWeight (double w, double h, double d,double m) 
{
super (w,h,d);
weight = m;
}
// constructor used when no dimensions specified
BoxWeight() {
super();
weight = -1; // use -1 to indicate an uninitialized box
}
// constructor used when cube is created
BoxWeight(double len,double m) {
super(len);
weight=m;
}
}

// Add shipping costs.
class Shipment extends BoxWeight {
double cost;
// construct clone of an object
Shipment(DemoShipment ob) { // pass object to constructor
super(ob);
cost = ob.cost;
}
// constructor when all parameters are specified
Shipment(double w, double h, double d, double m, double c) {
super(w, h, d, m); // call superclass constructor
cost = c;
}
// default constructor
Shipment() {
super();
cost = -1;
}
// constructor used when cube is created
Shipment(double len, double m, double c) {
super(len, m);
cost = c;
}
}

