// By: Prahlad Panthi

#include<iostream>

using namespace std;

void printDistinct(int& max){ // just making a reference to max without actually creating a new variable
	int arr[max+1];
	for(int i = 0; i <= max; i++)
		arr[i] = -1;
	int temp;
	cout << "Enter numbers (enter -1 after completition): ";
	for(int i = 0; ; i++){
		cin >> temp;
		if(temp == -1)
			break;
		else
			arr[temp] = temp;
	}
	int len = sizeof(arr) / sizeof(int);
	for(int i = 0; i < len; i++){
		if(arr[i] == -1)
			continue;
		cout << arr[i] << " ";
	}
	cout << endl;
}

int main(){
	int max;
	cout << "Enter maximum number: ";
	cin >> max;
	printDistinct(max);
	return 0;
}
