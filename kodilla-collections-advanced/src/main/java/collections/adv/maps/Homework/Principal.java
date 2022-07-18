package collections.adv.maps.Homework;

import java.util.Objects;

public class Principal {

    private String directorName;
    private String schoolName;

    public Principal(String directorName, String schoolName) {
        this.directorName = directorName;
        this.schoolName = schoolName;
    }

    public String getDirectorName() { return directorName; }
    public String getSchoolName() { return schoolName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(directorName, principal.directorName) && Objects.equals(schoolName, principal.schoolName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(directorName, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "directorName='" + directorName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
