// By: Prahlad Panthi

#include<iostream>

using namespace std;

int main(){
	int n;
	cin >> n;
	int arr[n-1];
	int total = 0;
	for(int i = 0; i < n-1; i++){
		cin >> arr[i];
		total += arr[i];
	}
	int num = ((n*(n+1))/2) - total;
	cout << "Missing number: " << num << endl;
	return 0;
}
