package prototype;

import org.w3c.dom.css.Rect;

import java.util.List;
import java.util.stream.Collectors;

public class TestPrototype {

    public List<Shape> cloneShapes(List<Shape> shapes) {
        // Write your code here
        return shapes.stream().map(Shape::clone).collect(Collectors.toList());
    }
}
