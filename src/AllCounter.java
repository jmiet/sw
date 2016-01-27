package zad3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/**
 * Created by A on 2015-10-18.
 */
public class AllCounter
{
    int howmany = 0;
    int comment = 0;
    int irr = 0;

    int count(int x)
    {
        try
        {
            FileReader fileReader = new FileReader("test.java");
            BufferedReader bufferReader = new BufferedReader(fileReader);

            String linia;
            String leftbracket = "{";
            String rightbracket = "}";
            boolean comm = false;

            while((linia = bufferReader.readLine()) != null)
            {
                howmany++;

                if(linia.startsWith("//"))
                    comment++;

                if(linia.contains("/*"))
                    comm = true;

                if(linia.contains("*/"))
                    comm = false;

                if(linia.startsWith("/*") && linia.endsWith("*/"))
                    comment++;

                if(comm)
                    comment++;

                if(linia.isEmpty() || linia.equals(rightbracket) || linia.equals(leftbracket))
                    irr++;
            }

            fileReader.close();

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (x == 1)
            return(howmany-comment);

        else
            return(howmany-comment-irr);

    }
}
