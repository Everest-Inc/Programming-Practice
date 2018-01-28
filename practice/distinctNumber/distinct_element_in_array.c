/*By Pratik :) */
#include<stdio.h>
#define MAX 100
void main()
{
    int i,j,temp,n,a[MAX];
    printf("Enter the total size of the array:\n");
    scanf("%d",&n);
    printf("Enter the elements in the array:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("The array in ascending order with distinct elements is:\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            if(a[i]==a[j])
            {
                break;
            }
        }
        if(i==j)
        {
            printf("%d \t",a[i]);
        }
    }
}
