package test.execute.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Organization extends Contact {
    private enum Fields {
        NAME,
        ADDRESS,
        NUMBER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    private String address;

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        this.address = address;
        return true;
    }


    @Override
    public List<String> possibleFields() {
        //return List.of("name", "address", "number");
        return Stream.of(Fields.values()).map(Fields::toString).collect(Collectors.toList());
    }

    @Override
    public boolean changeFieldValue(String fieldName, String value) {

        Fields fields = Fields.valueOf(fieldName.toUpperCase());


        return switch (fields) {
            case NAME -> setName(value);
            case NUMBER -> isNumberCorrectIfSoSetNumber(value);
            case ADDRESS -> setAddress(value);
            default -> false;
        };

    }

    @Override
    public boolean checkFieldName(String fieldName) {
        return possibleFields().contains(fieldName);
    }

    @Override
    public String getValueOfFieldName(String fieldName) {
        try {
            Fields fields = Fields.valueOf(fieldName.toUpperCase());
            return switch (fields) {
                case NAME -> getName();
                case ADDRESS -> getAddress();
                case NUMBER -> getPhoneNumber();
            };
        } catch (Exception e) {
            return "";
        }

    }

    @Override
    public String getShortInfo() {

        return "Name: " + getName() + " Address: " + getAddress();
    }


    @Override
    public String getDetailedInfo() {
        return "Organization name: " + getName() + "\r\n" +
                "Address: " + getAddress() + "\r\n" +
                "Number: " + getPhoneNumber() + "\r\n" +
                "Time created: " + getDateCreated() + "\r\n" +
                "Time last edit: " + getDateEdited() + "\r\n"
                ;
    }
}
