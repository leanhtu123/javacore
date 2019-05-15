package imic.Buoi18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRe {
    public static void matchWord()
    {
       int count = 0;
        String pattern = "\\b[mM][a-zA-Z]+";
        Pattern reg = Pattern.compile(pattern);
        String inPut = "To find out Mhow many m2 MM groups are present in the expression, call the groupCount method on a matcher object.";
        Matcher matcher =reg.matcher(inPut);
        while (matcher.find())
        {
            count++;
            System.out.println("kq = " + matcher.group(0));
        }
        System.out.println(count);
        boolean result = inPut.matches(".+"+pattern+".+");
        System.out.println(result);
    }
    public static void replaceString()
    {
        String line = "Line 24:    public static void main( String args[] ) {\n" +
                "\tLine 32:       // Now create matcher object.\n" +
                "\tLine 33:       Matcher m = r.matcher(line);\n" +
                "\tLine 39:          System.out.println(\"NO MATCH\");";
        String newT = line.replaceAll("Line (\\d+)", "Tu $1T");
        String newString = line.replaceAll("Line ", "Tu");
        String newString1 = newString.replaceAll(":", "T:");
        System.out.println(newT);
    }
    public static void fillTheform()
    {
        String form = "son tien dien\n" +
            "Name: LE anh Tu\n" +
            "Date: 10/05/2019\n" +
            "Money: 1 ty";
        Customner[] myCustomers = new Customner[3];
        myCustomers[0] = new Customner("Tu", "10/1", "10");
        myCustomers[1] = new Customner("Thao", "20/1", "100");
        myCustomers[2] = new Customner("Tuan", "30/1", "1000");
        for (Customner customer :myCustomers)
        {

            String newform = form.replaceAll("(Name:) (.+)", String.format("$1 %s", customer.name));
            String newform1 = newform.replaceAll("(Date:) (.+)", String.format("$1 %s", customer.date));
            String newform2 = newform1.replaceAll("(Money:) (.+)", String.format("$1 %s", customer.money));
            System.out.println(newform2+"\n");
        }


    }

}
