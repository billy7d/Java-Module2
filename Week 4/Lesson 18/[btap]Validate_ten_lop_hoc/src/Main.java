public class Main {
    private static ValidateClassName validateClassName;

    public static final String[] validName = {"C0318G"};
    public static final String[] invalidName = {"M0318G", "P0323A"};

    public static void main(String[] args) {
       validateClassName = new ValidateClassName();

        for (String name: validName){
            boolean isValid = validateClassName.isValidate(name);
            System.out.println("Class name "+ name +" is valid: "+ isValid);
        }

        for (String name: invalidName){
            boolean isValid = validateClassName.isValidate(name);
            System.out.println("Class name "+name+" is valid: "+isValid);
        }
    }

}
