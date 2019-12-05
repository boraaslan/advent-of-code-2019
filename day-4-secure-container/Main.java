import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //my input is between min and max
    static int min=271973, max=785961;

    static ArrayList<String> passwords = new ArrayList<String>();

    public static void main(String[] args) {
        GenerateAllPassword();
        savePasswordsFile("pass.txt",passwords);
        System.out.println("Part1:" + passwords.size());

        removeLargerGroups();
        savePasswordsFile("final.txt",passwords);
        System.out.println("Part2:" + passwords.size());

    }

    //this function is for password criteria of Part 2
    private static void removeLargerGroups (){
        for (String p: passwords) {
            char[] ch = p.toCharArray();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int count=1;
            for (int i=0;i<ch.length-1;i++) {
                if (ch[i] == ch[i + 1]) {
                    count++;
                }
                else {
                temp.add(count);
                count=1;
                }
            }
            temp.add(count);

            if(temp.contains(3) || temp.contains(4) || temp.contains(5)|| temp.contains(6))
                if(!temp.contains(2))
                    passwords.set(passwords.indexOf(p),"x");
        }

        passwords.removeIf(p->p.equals("x"));



    }

    //this function is for password criteria of two adjacent digits
    private static boolean isTwoAdjacentDigits(String pass){
        boolean result=false;
        char[] ch = pass.toCharArray();
        for (int i=0;i<ch.length-1;i++)
            if(ch[i]==ch[i+1]){
                result=true;
                break;
            }

        return result;
    }

    //this function is for password criteria of never decrease
    private static boolean isNeverDecrease(String pass){
        boolean result=false;
        char[] ch = pass.toCharArray();

        if ((int)ch[0] <=(int)ch[1] && (int)ch[1] <= (int)ch[2] && (int)ch[2] <= (int)ch[3] && (int)ch[3] <= (int)ch[4] && (int)ch[4] <= (int)ch[5])
            result =true;

        return result;
    }

    //this function is for generating passwords for part 1
    private static void GenerateAllPassword(){
        for (int i=min;i<max;i++){
            if(!isNeverDecrease(i+""))
                continue;

            if(!isTwoAdjacentDigits(i+""))
                continue;



            passwords.add(i+"");
        }

    }


    //this function is for write passwords to a file
    private static void savePasswordsFile(String fileName, List<String> passwords){
        try {
            FileWriter writer = new FileWriter(fileName);
            for(String str: passwords) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
