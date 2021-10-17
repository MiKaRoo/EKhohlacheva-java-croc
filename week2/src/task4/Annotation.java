package task4;

public class Annotation {
    private Figure figure;
    private String information;

    public Annotation(Figure figure, String information) {
        this.figure = figure;
        this.information = information;
    }
    @Override
    public String toString() {
        return figure.toString()+information;
    }
    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}


