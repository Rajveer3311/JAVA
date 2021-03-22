#include<stdio.h>
#include<conio.h>
void main()
{
int a=-1,c,b=1,i,no;
printf("enter fibannoici serries");
scanf("%d",&no);
for(i=0;i<=no;i++)
{
    c=a+b;
printf("%d",c);
 a=b;
 b=c;
}
getch();
}
