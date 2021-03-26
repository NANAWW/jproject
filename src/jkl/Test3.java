package jkl;

import java.io.*;

/**
 * @author wnn
 * @date 2021/3/25-9:58
 * @descriptuion
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        BufferedWriter out = new BufferedWriter(new FileWriter("F:\\javaproject\\jproject\\src\\jkl\\jkl.txt",true));
        String line = "";
        while ((line = br.readLine())!=null){
            if(line.equals("over"))
                break;
            out.write(line);
        }

        out.flush();
        out.close();
        br.close();
        in.close();
    }
}
