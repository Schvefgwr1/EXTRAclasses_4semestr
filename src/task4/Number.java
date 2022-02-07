package task4;

public class Number {
    private String[] OurNumber;
    private char ch;
    public Number(char number, boolean flag) {
        if (flag == false) {
            ch = '*';
        }
        else {
            ch = number;
        }
        switch(number) {
            case '0':
                OurNumber = new String[]{
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + "" + ch + "" + " " + " " + "" + ch + "",
                        "" + "" + ch + "" + " " + " " + "" + ch + "",
                        "" + "" + ch + "" + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " "
                };
                break;
            case '1':
                OurNumber = new String[]{
                        "" + "" + ch + "" + "" + "" + ch + "" + " " + " ",
                        " " + "" + ch + "" + " " + " ",
                        " " + "" + ch + "" + " " + " ",
                        " " + "" + ch + "" + " " + " ",
                        "" + "" + ch + "" + "" + ch + "" + "" + ch + "" + " "
                };
                break;
            case '2':
                OurNumber = new String[]{
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " ",
                        " " + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + " ",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + "" + ch + "" + ""
                };
                break;
            case '3':
                OurNumber = new String[]{
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " ",
                        " " + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        " " + " " + " " + "" + ch + "",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + "" + ch + "" + ""
                };
                break;
            case '4':
                OurNumber = new String[]{
                        " " + "" + ch + "" + " " + " ",
                        " " + "" + ch + "" + " " + " ",
                        "" + ch + "" + " " + " " + " ",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + "" + ch + "" + "",
                        " " + " " + "" + ch + "" + " "
                };
                break;
            case '5':
                OurNumber = new String[]{
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + " ",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " ",
                        " " + " " + " " + "" + ch + "",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " "
                };
                break;
            case '6':
                OurNumber = new String[]{
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + " ",
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " "
                };
                break;
            case '7':
                OurNumber = new String[]{
                        "" + ch + "" + "" + ch + "" + "" + ch + "" + "" + ch + "" + "",
                        " " + " " + " " + "" + ch + "",
                        " " + " " + "" + ch + "" + " ",
                        " " + "" + ch + "" + " " + " ",
                        " " + "" + ch + "" + " " + " "
                };
                break;
            case '8':
                OurNumber = new String[]{
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " "
                };
                break;
            case '9':
                OurNumber = new String[]{
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        "" + ch + "" + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " ",
                        " " + " " + " " + "" + ch + "",
                        " " + "" + ch + "" + "" + ch + "" + " "
                };
                break;
        }
    }
    public String[] getOurNumber() {
        return OurNumber;
    }
}
