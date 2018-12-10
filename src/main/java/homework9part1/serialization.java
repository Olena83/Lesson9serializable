package homework9part1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {
    public static void main(String args[]) throws IOException {

        FileOutputStream fout = new FileOutputStream("person.out");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        Person ps = new Person();
        oout.writeObject(ps);
        oout.flush();
        oout.close();
    }
}


