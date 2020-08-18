public class Main {
    public static void main(String[] args) {

        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        String[] validNumb = {"(84)-(0978489648)"};
        String[] invalidNumb = {"(a8)-(22222222)"};

        for (String i : validNumb){
            boolean isValid = validatePhoneNumber.isValid(i);
            System.out.println("Number " + i +" is valid: " + isValid);
        }

        for (String i: invalidNumb){
            boolean isValid = validatePhoneNumber.isValid(i);
            System.out.println("Number " + i +" is valid: "+ isValid);
        }


    }

}
