
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Opposite
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine.trim());
        while(t-->0)
        {
            String st[]=br.readLine.trim().split(" ");
            int n=Integer.parseInt(st[0]);
            int m=Integer.parseInt(st[1]);
            int grid[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                String s[]=br.readLine.trim.split(" ");
                for(int j=0;j<m;j++)
                {
                    grid[i][j]=Integer.parseInt(s[j]);
                }
            }
            Solution obj=new Solution();
            int ans=obj.findMaxArea(grid);
            System.out.println(ans);
        }

    }
    
}
class Solution
{
    public int findMaxArea(int grid[][])
    {
        
    }
}