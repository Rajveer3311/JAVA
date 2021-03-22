class matrix
{
final static int row=10;
final static int column=20;
public static void main(String[] args)
{
   int product[][]=new int [row][column];

   System.out.println("matrix");
System.out.println(" ");
   
int i,j;
   for(i=0;i<row;i++)
   {
       for(j=0;j<column;j++)
       {
          product[i][j]=i*j;
          System.out.print(" "+product[i][j]);
       }
System.out.println(" ");
    }
}
}


