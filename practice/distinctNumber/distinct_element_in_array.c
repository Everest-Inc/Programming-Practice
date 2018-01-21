#include<stdio.h>
void main()
{
    int i,j,n,x,c;
    printf("Enter total numbers:");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements:\n");
        for(i=0;i<n;i++)
        {
            scanf("\n %d",&a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                break;
            }
            if(i==j)
            {
                printf("%d\t",a[i]);
            }
        }
    }

