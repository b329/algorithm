//
/*
 This code is a practice Java interview question from testdome.com
 https://www.testdome.com/questions/java/user-input/11995?visibility=1&skillId=4

 Problem statement: User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits.
	-Implement the class TextInput that contains:
		i) Public method void add(char c) - adds the given character to the current value
		ii) Public method String getValue() - returns the current value
	-Implement the class NumericInput that:
		i) Inherits from TextInput
		ii) Overrides the add method so that each non-numeric character is ignored
+ Passes 4/4 tests
 */

/** Question **/
/*
public class UserInputTestDome {

    public static class TextInput {}

    public static class NumericInput {}

    public static void main(String[] args) {
        //TextInput input = new NumericInput();
        //input.add('1');
        //input.add('a');
        //input.add('0');
        //System.out.println(input.getValue());
    }
}
*/

/** Answer **/
/** solution 1
public class UserInputTestDome {

    private static String value;	//current value

    public static class TextInput {

        public TextInput() {
            value = new String();
        }
        public void add (char c) {
            if(value.length()==0){
                value=Character.toString(c);
            }else{
                value+=c;
            }
        }

        public String getValue() {
            return value;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c){
            if(Character.isDigit(c)){
                //if character is numeric
                if(value.length()==0){
                    value=Character.toString(c);
                }else{
                    value+=c;
                }
            }
        }
    }
 **/

//** solution 2 **//
public class UserInputTestDome {

    public static class TextInput {
        protected StringBuilder inputSB;

        public TextInput() {
            inputSB = new StringBuilder();
        }

        public void add(char c) {
            this.inputSB.append(c);
        }

        public String getValue() {
            return this.inputSB.toString();
        }
    }

    public static class NumericInput extends TextInput {

        public NumericInput() {
            super();
        }

        @Override
        public void add(char c) {
            if (Character.isDigit(c)) {
                this.inputSB.append(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
