package homework.homework_28;

import lists.MyArrayList;
import lists.MyList;

public class RectangleUtils {

    public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        for (int i = 0; i < rectangles.size(); i++) {
            if (rectangles.get(i).equals(rectangleToRemove)) {
                rectangles.remove(i);
                i--;
            }
        }
    }

    public static void removeDuplicates2(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        while (rectangles.contains(rectangleToRemove)) {
            rectangles.remove(rectangleToRemove);
        }
    }

    public static MyList<Rectangle> removeOnlyDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        MyList<Rectangle> result = new MyArrayList<>();
        for (int i = 0; i < rectangles.size(); i++) {
            if (!result.contains(rectangles.get(i))) {
                result.add(rectangles.get(i));
            }
        }
        return result;
    }
}
