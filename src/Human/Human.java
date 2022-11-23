package Human;

public class Human {
    private int yearOfBitrh;
    String name;
    private String town;
    String jobTitle;

    public Human(int yearOfBitrh, String name, String town, String jobTitle) {
        if (yearOfBitrh >= 0) {
            this.yearOfBitrh = yearOfBitrh;
        } else {
            this.yearOfBitrh = Math.abs(yearOfBitrh);
        }
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBitrh() {
        return yearOfBitrh;
    }

    public void setYearOfBitrh(int yearOfBitrh) {
        if (yearOfBitrh != 0) {
            this.yearOfBitrh = Math.abs(yearOfBitrh);
        } else {
            this.yearOfBitrh = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBitrh + " году. Я работаю на должности: " + jobTitle + ". Будем знакомы!";
    }
}
