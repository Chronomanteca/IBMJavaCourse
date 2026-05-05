package chrono.ibmcourse.OOPs.Module4.ReadATextFile.model;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        if(name.isBlank())
            throw new InformationBlankException("Name cannot be blank ");
        if(phoneNumber.isBlank())
            throw new InformationBlankException("Phone number cannot be blank ");
        if(name.isEmpty())
            throw new InformationBlankException("Name cannot be empty ");
        if(phoneNumber.isEmpty())
            throw new InformationBlankException("Phone number cannot be empty ");
        if(name == null)
            throw new InformationBlankException("Name cannot be null ");
        if(phoneNumber == null)
            throw new InformationBlankException("Phone number cannot be null ");
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact Name: "+name+" Contact Number: "+phoneNumber;
    }
}
