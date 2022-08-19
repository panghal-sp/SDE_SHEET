import java.util.Arrays;

public class ZigZagConversion {
StringBuffer ans=new StringBuffer("");
    public static void main(String [] args){
        System.out.println("Started");
        new ZigZagConversion().convert("PAYPALISHIRING",4);
    }


        public String convert(String s, int numRows) {

        if(numRows==1){
            ans.append(s);
        } else if (numRows==2) {
            StringBuffer one =new StringBuffer();
            StringBuffer two =new StringBuffer();
            for(int i=0;i<s.length();i++){
                if(i==0 || i%2==0)
                    one.append(s.charAt(i));
                else if (i==1 || i%2 !=0)
                    two.append(s.charAt(i));

            }
            ans.append(one).append(two);
        } else if (numRows>2) {

            char str []=s.toCharArray();
            String arr [] = new String[numRows];
            Arrays.fill(arr,"");
            int row=0;
            boolean down=true;
            for(int i=0; i<s.length();i++){
                arr[row] += (str[i]);

                if(row==0){
                   down=true;
                }else if(row==numRows-1)
                    down=false;

                if(down)
                    row++;
                else row--;

            }
           ans.append(Arrays.stream(arr).reduce((j,k)->j+k).get());
        }

            System.out.println(ans);
            return ans.toString();
        }

}
