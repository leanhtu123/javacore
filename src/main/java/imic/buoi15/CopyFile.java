package imic.buoi15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class CopyFile {

        public static void main(String args[]) throws IOException {
            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                File inputfile = new File(CopyFile.class.getClassLoader().getResource("imic/inputok.txt").getFile()) ;
                in = new FileInputStream(inputfile);
            //    out = new FileOutputStream("imic/output.txt");
                File outputfile = new File(CopyFile.class.getClassLoader().getResource("imic/output.txt").getFile()) ;
                out = new FileOutputStream(outputfile);
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                     System.out.printf("%d %c \n", c, c);
                }
            }finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        }
    }