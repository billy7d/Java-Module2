public class FizzBuzz {
    public  static String getFizzBuzz(int a){
        String result;
        if (a>0 && a<100 &&(a%3==0||isInputHas3(a))){
            result= "Fizz";
        } else if (a>0 &&a<100 &&(a%5==0||isInputHas5(a))){
            result= "Buzz";
        } else if (a>0 && a%3==0 && a%5==0){
            result= "FizzBuzz";
        }  else result=""+a;
        return result;
    }

    public static int getInputNumberUnit(int numb){
        if (numb>0&&numb<10) return numb;
        else return numb;

    }
    public static int getInputNumberDozen(int numb){
       int result = 0;
        if (numb>10&&numb<100) {
           result = (numb - getInputNumberUnit(numb)) / 10;
       }
        return  result;
    }

    public static boolean isInputHas3(int numb){
        boolean result = false;
        if (getInputNumberDozen(numb)==3||getInputNumberUnit(numb)==3) {
            result = true;
        }
        return result;
    }
    public static boolean isInputHas5(int numb){
        boolean result = false;
        if (getInputNumberDozen(numb)==5||getInputNumberUnit(numb)==5) {
            result = true;
        }
        return result;
    }
    public static String FizzBuzzTranslate(int numb) {
        String result = "";
        if (numb >= 100) {
            result = "Input a number < 100";
        } else {
            if (numb < 10) {
                result = translateUnit(numb);
            } else if (numb >= 10 && numb < 20) {
                result = translateDozen(numb);
            } else if (numb >= 20 && numb < 100) {
                result =translateDozensOver20Numb(numb)+" "+translateUnit(numb);
            }
        }
        return result;
    }

    private static String translateDozensOver20Numb(int numb) {
        String result =null;
        switch (getInputNumberDozen(numb)){
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "nighty";
                break;
        }
        return result;
    }


    private static String translateDozen(int numb) {
        String result = null;
        switch (getInputNumberUnit(numb)){
            case 0:
                result =  "ten";
                break;
            case 1:
                result =  "eleven";
                break;
            case 2:
                result =  "twelve";
                break;
            case 3:
                result =  "thirteen";
                break;
            case 4:
                result =  "fourteen";
                break;
            case 5:
                result =  "fifteen";
                break;
            case 6:
                result =  "sixteen";
                break;
            case 7:
                result =  "seventeen";
                break;
            case 8:
                result =  "eighteen";
                break;
            case 9:
                result =  "nineteen";
                break;
        }
        return result;

    }


    private static String translateUnit(int numb) {
        String result = null;
        switch (getInputNumberUnit(numb)) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;

        }
        return result;
    }

}
