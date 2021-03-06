package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;
    private Sensor sensor;
    private boolean alarmOn;

    public Alarm(Sensor sensor) {
        this.sensor = sensor;
    }

    public Alarm() {
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();
        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
