#include<stdio.h>
void main()
{
int a,b,l;
printf("enter two lcm values");
scanf("%d%d",&a,&b);
for(l=a>b?a:b;l<=a*b;l++)

 if(l%a==0&&l%b==0)


    printf("lcm is%d",l);

getch();
}
