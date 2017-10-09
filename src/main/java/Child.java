import java.time.LocalDate;
import java.time.Period;

public class Child {
    private String name;
    private LocalDate birthDate;

    public Child(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(Child child){
        return  Period.between(birthDate,LocalDate.now()).getYears();
    }
}

