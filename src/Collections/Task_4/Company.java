package Collections.Task_4;

import java.util.ArrayList;
import java.util.Objects;

public class Company {


    private String companyTitle;
    private int year;
    private ArrayList<Films> companyFilm;

    public Company(String companyTitle, int year, ArrayList<Films> companyFilm) {
        this.companyTitle = companyTitle;
        this.year = year;
        this.companyFilm = companyFilm;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Films> getCompanyFilm() {
        return companyFilm;
    }

    public void setCompanyFilm(ArrayList<Films> companyFilm) {
        this.companyFilm = companyFilm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Company company = (Company) o;
        return year == company.year && Objects.equals(companyTitle, company.companyTitle)
            && Objects.equals(companyFilm, company.companyFilm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyTitle, year, companyFilm);
    }

    @Override
    public String toString() {
        return "Company{" +
            "companyTitle='" + companyTitle + '\'' +
            ", year=" + year +
            ", companyFilm=" + companyFilm +
            '}';
    }
}
