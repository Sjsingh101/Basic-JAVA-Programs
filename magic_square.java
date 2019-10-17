import java.io.*;
class magicsquare
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,k,t;
        System.out.println("Enter the order of the array");
        n=Integer.parseInt(br.readLine());
        i=0;
        j=n/2;
        k=1;
       int a[][]=new int[n][n];
        if(n%2!=0)
        {
            
         while(k<=n*n)
           {
            a[i][j]=k++;
            i--;
            j++;
            if(i<0&&j>n-1)
            {
            i=i+2;
            j--;
        }
            if(i<0)
            i=n-1;
            if(j>n-1)
            j=0;
            if(a[i][j]>0)
            {
                i=i+2;
                j--;
            }
        }
       
    }
        else
        {
            for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            a[i][j]=k++;
            j=n-1;
            for(i=0;i<n/2;i++)
            {
                t=a[i][i];
                a[i][i]=a[j][j];
                a[j][j]=t;
                t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
           
    }
     System.out.println("THE SQUARE MATRIX OF SIZE "+n+" x "+n+" is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
}
}
            
