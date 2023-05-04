import java.util.ArrayList;
import java.util.List;

public class Bag {
//    bag=12 capacity before inserting ball
//    balls serveral color
//1.green ball!>red ball in bag
//2.yellow!>40 % of total ball in bag

        private List<Ball> balls = new ArrayList<>();
        private final int MAX_BALLS = 12;

        public boolean addBall(Ball ball) {
            int greenBalls = 0;
            int redBalls = 0;
            int yellowBalls = 0;

            for (Ball b : balls) {
                String color = b.getColor();
                if (color.equals("green")) {
                    greenBalls++;
                } else if (color.equals("red")) {
                    redBalls++;
                } else if (color.equals("yellow")) {
                    yellowBalls++;
                }
            }

            if (greenBalls >= redBalls || ball.getColor().equals("red")) {
                if (ball.getColor().equals("yellow") && yellowBalls >= 0.4 * balls.size()) {
                    return false;
                }
                if (balls.size() >= MAX_BALLS) {
                    return false;
                }
                balls.add(ball);
                return true;
            }

            return false;
        }


    }