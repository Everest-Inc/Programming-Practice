#include<stdio.h>

struct StudentRecord{
	char name[10];
	float physics, chemistry, math;
	float percentage;
	char division;
	int rank;
};

struct StudentRecord rec[3], temp;

void getInput(void){
	int i;
	for(i = 0; i < 3; i++){
		printf("Enter name: ");
		scanf("%s", rec[i].name);
		printf("Enter marks in physics: ");
		scanf("%f", &rec[i].physics);
		printf("Enter marks in chemistry: ");
		scanf("%f", &rec[i].chemistry);
		printf("Enter marks in maths: ");
		scanf("%f", &rec[i].math);
	}
}

void processInput(void){
	int i, j;
	float percentage;
	// calculate percentage and division of each student
	for(i = 0; i < 3; i++){
		// assuming that the total marks of each subject is 100
		percentage = (rec[i].physics + rec[i].chemistry + rec[i].math)/3;
		rec[i].percentage = percentage;
		if(percentage >= 80.0)
			rec[i].division = 'A';
		else if(percentage >= 70.0 && percentage < 80.0)
			rec[i].division = 'B';
		else if(percentage >= 60.0 && percentage < 70.0)
			rec[i].division = 'C';
		else if(percentage >= 50.0 && percentage < 60.0)
			rec[i].division = 'D';
		else
			rec[i].division = 'C';
	}
}

void sortStudents(void){
	int i, j, k;
	// sorting students as per their percentage
	for(i = 1; i < 3; i++){
		for(j = 0; j < 3-i; j++){
			if(rec[j].percentage < rec[j+1].percentage){
				temp = rec[j];
				rec[j] = rec[j+1];
				rec[j+1] = temp;
			}
		}
	}
	// giving rank to the sorted students
	for(k = 0; k < 3; k++)
		rec[k].rank = k+1; // rank starts from '1'
}

void printResult(void){
	int i;
	for(i = 0; i < 3; i++){
		printf("Name: %s\n", rec[i].name);
		printf("Percentage: %f\n", rec[i].percentage);
		printf("Division: %c\n", rec[i].division);
		printf("Rank: %d\n", rec[i].rank);
	}
}

int main(void){
	getInput();
	processInput();
	sortStudents(); // sort student record based on their percentage
	printResult();
	return 0;
}