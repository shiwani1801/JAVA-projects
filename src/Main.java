public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Ball[] balls = {
                new Ball("green"),
                new Ball("red"),
                new Ball("yellow"),
                new Ball("green"),
                new Ball("yellow"),
                new Ball("green"),
                new Ball("red"),
                new Ball("red"),
                new Ball("yellow"),
                new Ball("green"),
                new Ball("red"),
                new Ball("yellow"),
                new Ball("yellow"),
                new Ball("grren")

        };
        for (Ball ball : balls) {
            if (bag.addBall(ball)) {
                System.out.println("Added a " + ball + " to the bag.");
            } else {
                System.out.println("Could not add a " + ball + " to the bag.");
            }
        }

    }
}