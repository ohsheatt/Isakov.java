package homework_3;

public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
        if (gender.equals("M") || gender.equals("F") || gender.equals("U")) {
            System.out.println("Right");
        }
        else {
            System.out.println("Error");
        }

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getGender(){

        return gender;
    }




    @Override
    public String toString(){
        return "Author @ ("+this.name+", "+this.email+", "+this.gender+").";
    }

}
