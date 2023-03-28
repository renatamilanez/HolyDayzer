public class Holiday {
    private String name;
    private String date;

    public Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isHoliday(String date) {
        return this.date.equals(date);
    }
}
