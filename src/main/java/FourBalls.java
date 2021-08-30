import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
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
        float xAxis = getXAxis(speedOfBall);
        float yAxis = getYAxis(relativeHeight);

        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
    }

    private float getYAxis(double relativeHeight) {
        return (float) (HEIGHT * relativeHeight);
    }

    private float getXAxis(int speedOfBall) {
        return xAxis * speedOfBall;
    }

}
