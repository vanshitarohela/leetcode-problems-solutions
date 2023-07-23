class Solution {
    public String interpret(String command) {
        int i = 0;
        String s = "";
        if (command == "") {
            return "";
        } 
        while (i < command.length()) {
            if (command.substring(i, i+1).equals("G")){
                s = s + "G";
                i++;
            }
            else if (command.substring(i, i+2).equals("()")) {
                s = s + "o";
                i+=2;
            }
            else if (command.substring(i, i+4).equals("(al)")) {
                s = s + "al";
                 i+=4;
            }
            // i = command.length()
        }
        return s;
    }
}