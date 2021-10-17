package task4;

public class Main{
    public static void main(String[] args) {
      Figure circle = new Circle(2,5,6,"circle");
      Figure rectangle = new Rectangle(5,4,9,5,"rectangle");
      Annotation annotation1 = new Annotation(circle,"annotation1");
      Annotation annotation2 = new Annotation(rectangle,"annotation2");
      Annotation[] annotations = new Annotation[]{annotation1,annotation2};

        for(Annotation annotation: annotations){
            System.out.println(annotation.toString());
        }

    }
}
