#include <bits/stdc++.h>

using namespace std;

int n,m,tp,curp;
int p[111];
int w[111];
int c[111];
vector<int> y,cur;

void cek(int post, int cc){
	if (post == n){
		int x[111];
		int temp = 0;
		bool ok = 1;
		for (int i=0; i<=m; i++){
			x[i] = c[i];
		}
		for (int i=0; i<n; i++){
			if (cur[i] > 0){
				x[cur[i]-1] -= w[i];
				if (x[cur[i]-1] < 0){
					ok = 0;
					break;
				}
				temp += p[i];
			}
		}
		if (ok){
			if (temp > curp){
				curp = temp;
				y = cur;
			}
		}
	} else {
		cur[post] = cc;
		for (int i=0; i<=m; i++){
			cek(post+1,i);
		}
	}
}

int main(){
	scanf("%d%d",&n,&m);
	for (int i=0; i<n; i++){
		scanf("%d",&p[i]);
		cur.push_back(0);
	}
	for (int i=0; i<n; i++){
		scanf("%d",&w[i]);
	}
	for (int i=0; i<m; i++){
		scanf("%d",&c[i]);
	}
	curp = -1;
	for (int i=0; i<=m; i++){
		cek(0,i);
	}
	printf("%d",y[0]);
	for (int i=1; i<n; i++){
		printf(" %d",y[i]);
	}
	printf("\n%d\n",curp);
	return 0;
}
