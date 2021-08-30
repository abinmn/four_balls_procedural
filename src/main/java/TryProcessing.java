import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    private int xAxis = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for (int i = 1; i <= 4; i++) {
            drawBall(i, 0.2*i);
        }
        changeHorizontalPositionOfBall();
    }

    private void changeHorizontalPositionOfBall() {
        xAxis++;
    }

    private void drawBall(int speedOfBall, double relativeHeight) {
        ellipse(getXAxis(speedOfBall), getYAxis(relativeHeight), RADIUS, RADIUS);
    }

    private float getYAxis(double relativeHeight) {
        return (float) (HEIGHT * relativeHeight);
    }

    private float getXAxis(int speedOfBall) {
        return xAxis * speedOfBall;
    }

}
