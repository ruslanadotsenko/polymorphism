package app;

import static app.Constants.coefficient;

class DeviceB implements Device {

    public double getResult(double x, double y) {
        return (x + y) * coefficient;
    }
}
