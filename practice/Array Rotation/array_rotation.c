#include<stdio.h>
#define MAX 100
void main()
{
    int i,temp,n,j,rotation,a[MAX];
    printf("Enter the total size of the array:\n");
    scanf("%d",&n);
    printf("Enter the elements in the array:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nROTATION: ");
    scanf("%d",&rotation);
    for(j=0;j<rotation;j++)
    {
        temp=a[0];
        for(i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[i]=temp;
    }
    for(i=0;i<n;i++)
    {
        printf("%d \t",a[i]);
    }
}