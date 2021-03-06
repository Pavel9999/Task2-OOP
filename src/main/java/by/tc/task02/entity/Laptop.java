package by.tc.task02.entity;

public class Laptop extends Appliance {

    private double batteryCapacity;
    private String os;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop() {

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryRom) {
        this.memoryROM = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cpu);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInchs);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(memoryROM);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        temp = Double.doubleToLongBits(systemMemory);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
            return false;
        if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
            return false;
        if (Double.doubleToLongBits(displayInchs) != Double.doubleToLongBits(other.displayInchs))
            return false;
        if (Double.doubleToLongBits(memoryROM) != Double.doubleToLongBits(other.memoryROM))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        return Double.doubleToLongBits(systemMemory) == Double.doubleToLongBits(other.systemMemory);
    }

    @Override
    public String getParameters() {

        return "Laptop : BATTERY_CAPACITY = " + batteryCapacity +
                ", OS = " + os +
                ", MEMORY_ROM = " + memoryROM+
                ", SYSTEM_MEMORY = " + systemMemory +
                ", CPU = " + cpu +
                ", DISPLAY_INCHES = " + displayInchs + ";";
    }

}
