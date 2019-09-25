package Lab06;

public class User {
    private String name;
    private String companyName;
    private int yearOfJoining;
    private String email;
    private String password;

    // getter methods
    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setYearOfJoining(int age) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // creating this method privately for getting email-id in required formate/form....

    private String createUserEmail(){
        return String.format("%s_%d@%s.com",getName().toLowerCase(),getYearOfJoining(),getCompanyName().toLowerCase());
    }

    // method to generate random number from given limit as per requirements

    public int generateRandomIntegerFromLimit(int limit){
        return  (int) (Math.random()*limit);
    }

    // method to generate special type of password

    private String createUdesPassword(){
        StringBuilder sb = new StringBuilder();
        sb.append(generateRandomCharacter());
        for (int i = 0; i < 4; i++) {
            sb.append(generateRandomIntegerFromLimit(10));
        }
        sb.append(getFirst5CharacterFromUserName());
        sb.append(generateRandomSpecialSymbol());
        return sb.toString();
    }






}