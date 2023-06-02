package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = sc.nextInt();
            String s = br.readLine();

            int out_ = Minimum_Operations(n, s);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int Minimum_Operations(int n, String s){
        // Write your code here
        int result = 0;

        for(int i=3; i<s.length(); i++){

            String s1=s.substring(0,3);
            String s2= s.substring(4,s.length()-1);
            char c=s.charAt(3);
            boolean flag1=false;
            boolean flag2=false;
            for(int j=0; j<s1.length(); j++){
                if(c==s1.charAt(j)){
                    s1=s1.substring(j+1);
                    flag1=true;
                }
                else if(i<=s2.length()){
                    if(s2.charAt(j)==c){
                        s2=s2.substring(j+1);
                        flag2=true;
                    }
                    if(flag1 && flag2){
                        result++;
                    }
                }
            }
        }

        return result;

    }

}