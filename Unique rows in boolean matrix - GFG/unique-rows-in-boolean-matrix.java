//{ Driver Code Starts
import java.lang.Math;
import java.io.*;
import java.util.*;
class UniqueRows{
public static void main(String[] args)throws IOException
 {  
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    String s[]=in.readLine().trim().split(" ");
			int r=Integer.parseInt(s[0]);
			int c=Integer.parseInt(s[1]);
			s=in.readLine().trim().split(" ");
			int ind=0;
			int[][] a=new int [r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					a[i][j]=Integer.parseInt(s[ind++]);
			GfG g=new GfG();
			ArrayList<ArrayList<Integer>> arr = g.uniqueRow(a,r,c);
			for(int i = 0;i<arr.size();i++){
			    ArrayList<Integer> demo = arr.get(i);
			    for(int j = 0;j<demo.size();j++){
			        out.print(demo.get(j)+" ");
			    }
			    out.print("$");
			}
			out.println();
		}
		out.close();
 }
}
// } Driver Code Ends


/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        Set<ArrayList<Integer>> uniqueRows = new LinkedHashSet<>(); // Use LinkedHashSet to maintain insertion order
        
        // Traverse the matrix row by row
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> k= new ArrayList<Integer>();
            
            // Construct a string representation of the row
            for (int j = 0; j < c; j++) {
                k.add(a[i][j]);
            }
            
            // Add the row to the set if it's not already present
            if (!uniqueRows.contains(k)) {
                uniqueRows.add(k);
            }
        }
        ArrayList<ArrayList<Integer>> q = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> z:uniqueRows){
            q.add(z);
        }
        return q;
    }
}