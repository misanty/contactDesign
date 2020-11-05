package test.execute.domain;

import java.time.LocalDate;
import java.util.List;

public class Person extends Contact {
    private String surname;
    private String gender;
    private LocalDate birthdate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String getInfo() {

        return "Name: "+getName()+ "Surname: "+getSurname();
    }

    @Override
    public List<String> possibleFields() {
        return List.of("name","surname","gender","birth date","number");
    }

    @Override
    public boolean checkFieldName(String fieldName) {
        return false;
    }

    @Override
    public String getValueOfFieldName(String fieldName) {
        return null;
    }

    @Override
    public boolean changeFieldValue(String fieldName, String value) {

        switch (fieldName) {
            case "surname" : setSurname(value);
        }
return false;
    }
}
