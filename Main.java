import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int count = 0;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maxNumber = br.readLine();
        number753(maxNumber, "0");

        System.out.println(count);
    }

    public static void number753(String maxNumber, String number) {
        if(Long.parseLong(maxNumber) < Long.parseLong(number))
            return;

        Set<String> setNumber = new HashSet<String>();
        for(int i=0 ; i<number.length() ; i++) {
            setNumber.add(number.charAt(i)+"");
        }
        
        if(setNumber.contains("3") && setNumber.contains("5") && setNumber.contains("7") && setNumber.size() == 3){
            count++;
        }

        if(number.equals("0"))
            number = "";
        
        number753(maxNumber, number+"3");
        number753(maxNumber, number+"5");
        number753(maxNumber, number+"7");
    }
}
