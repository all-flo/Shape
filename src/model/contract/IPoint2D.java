package model.contract;

public interface IPoint2D extends IPoint {
    void translate(double x, double y);
    double distance(IPoint2D other);
}
