package adapter;

class CircleToSquareAdapter extends Square {

    public CircleToSquareAdapter(Circle circle) {
        // Write your code here
        super(circle.getRadius() * 2);
    }

    @Override
    public double getSideLength() {
        // Write your code here
        return super.getSideLength();
    }
}
