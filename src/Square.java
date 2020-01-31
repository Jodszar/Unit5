public class Square {
    private double side;
    public Square(double s){
        side = s;
    }
    public double calculateArea(){
        double area = side*side;
        return area;
    }
    public String toString(){
        return "Square with side " + side;
    }
}
