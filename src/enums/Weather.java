package enums;

public class Weather {
    int dayOfYear;
    int temperature;
    int humidity;
    int pressure;
    Season season;

    public Weather(int dayOfYear, int temperature, int humidity, int pressure, Season season) {
        this.dayOfYear = dayOfYear;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.season = season;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
