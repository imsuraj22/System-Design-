// Now, let's say you want to introduce a new requirement to add a Triangle shape without modifying the existing code. You can achieve this by adhering to the Open-Closed Principle 

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
