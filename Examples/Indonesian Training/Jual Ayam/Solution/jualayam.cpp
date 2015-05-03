#include <bits/stdc++.h>

using namespace std;

int n,t,ans,temp;
int w[100100];
int d[100100];
int p[100100];
vector<int> x;
vector<int> o;

int cek(){
	int q = 0;
	for (int i=0; i<n; i++){
		q += (p[i]*w[x[i]-1]-w[x[i]-1]*d[i]*t);
	}
	return q;
}

int main(){
	scanf("%d%d",&n,&t);
	for (int i=0; i<n; i++){
		scanf("%d",&w[i]);
	}
	for (int i=0; i<n; i++){
		scanf("%d",&d[i]);
	}
	for (int i=0; i<n; i++){
		scanf("%d",&p[i]);
	}
	x.clear();
	for (int i=1; i<=n; i++){
		x.push_back(i);
	}
	ans = -1e8;
	do {
		temp = cek();
		if (temp > ans){
			o = x;
			ans = temp;
		}
	} while (next_permutation(x.begin(),x.end()));
	//printf("%d\n",ans);
	for (int i=0; i<n-1; i++){
		printf("%d ",o[i]);
	}
	printf("%d\n",o[n-1]);
	return 0;
}
