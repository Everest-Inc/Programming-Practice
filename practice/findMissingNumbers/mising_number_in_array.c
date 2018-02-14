// By Pratik Adhikari
#include<stdio.h>
#define max 1000
void main()
{
    int i,n,p,b=0,a[max];
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    printf("Enter the elements:\n");
    for(i=0;i<n-1;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nMissing number: ");
    for(i=0;i<n-2;i++)
    {
        b=a[i]+1;
        if(b!=a[i+1])
        {
            printf("%d\t",b);
        }
    }
}
