import java.util.regex.*;
import java.io.*;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length < 2)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {

                private Pattern pattern = Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches() && !(Collections
                            .disjoint(Arrays.asList(args).subList(1, args.length), new TextFile(name, "\\W+")));
                }

            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}