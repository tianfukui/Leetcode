import java.util.Scanner;
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//    Write the code that will take a string and make this conversion given a number of rows:

//    string convert(string s, int numRows);
//Example 1:
//    Input: s = "PAYPALISHIRING", numRows = 3
//    Output: "PAHNAPLSIIGYIR"
//Example 2:
//    Input: s = "PAYPALISHIRING", numRows = 4
//    Output: "PINALSIGYAHRPI"
//    Explanation:
//    P     I    N
//    A   L S  I G
//    Y A   H R
//    P     I
public class NO0006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int numRows = input.nextInt();
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        //时间复杂度O(n^2),空间复杂度O(n^2)
        char[][] arraynum = new char[numRows][1000];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<arraynum[i].length;j++){
                arraynum[i][j]=0;
            }
        }
        int length = s.length();
        int count = 0;
        int col = 0;
        int row = 0;
        while(count < length){
            char character = s.charAt(count);
            if(numRows == 1) return s;
            if(col % (numRows-1) == 0){
                arraynum[row][col] = character;
                row++;
                count++;
                if(row == numRows){
                    col++;
                    row = numRows - 2;
                }
            }
            else{
                arraynum[row][col] = character;
                count++;
                row--;
                col++;

            }
        }
        String result = "";
        for(int i = 0;i < numRows;i++){
            for(int j = 0;j <= col;j++){
                if(arraynum[i][j]!=0){
                    result=result+arraynum[i][j];
                }
                else{
                    continue;
                }
            }
        }
        return result;
    }
}
