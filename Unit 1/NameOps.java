public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        int firstSpace = NameOps.indexOfFirstSpace(name);
        return name.indexOf(" ", firstSpace + 1);
    }

    public static String findFirstName(String name) {
        if (name.indexOf(" ") != -1) {
            return name.substring(0, name.indexOf(" "));
        }
        return name;
    }

    public static String findLastName(String name) {
        if (name.indexOf(" ") == -1) {
            return "";
        } else if (NameOps.indexOfSecondSpace(name) == -1) {
            return name.substring(NameOps.indexOfFirstSpace(name) + 1);
        } else {
            return name.substring(NameOps.indexOfSecondSpace(name) + 1);
        }
    }

    public static String findMiddleName(String name) {
        if (name.indexOf(" ") != -1 && NameOps.indexOfSecondSpace(name) != -1) {
            return name.substring(name.indexOf(" ") + 1, NameOps.indexOfSecondSpace(name));
        }
        return "";
    }

    public static String generateLastFirstMidInitial(String name) {
        if (name.indexOf(" ") == -1 && NameOps.indexOfSecondSpace(name) == -1) {
            return name;
        } else if (NameOps.indexOfSecondSpace(name) == -1) {
            String lastname = NameOps.findLastName(name);
            String firstname = NameOps.findFirstName(name);
            return lastname + ", " + firstname;
        } else {
            String lastname = NameOps.findLastName(name);
            String firstname = NameOps.findFirstName(name);
            char midinitial = NameOps.findMiddleName(name).charAt(0);
            return lastname + ", " + firstname + " " + midinitial + ".";
        }
    }


}
