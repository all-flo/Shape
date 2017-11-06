package model.contract;

public interface IPoint3D extends IPoint {
    void translate(double x, double y, double z);
    double distance(IPoint3D other);
}
