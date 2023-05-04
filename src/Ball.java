import java.awt.*;

//enum color{
//    RED,
//    GREEN,
//    YEllOW
//        }

public class Ball {
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color + " ball";
    }
}