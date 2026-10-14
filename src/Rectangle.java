public class Rectangle {
    float width;
    float height;

    Rectangle(float width,float height)
    {
        this.width = width;
        this.height = height;
    }

    void Area(){
        float area = width * height;
        System.out.println("The area of the rectangle is: "+ area);
    }
    void Perimeter(){
        float perimeter = 2 * (width + height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
