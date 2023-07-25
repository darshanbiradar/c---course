#include<stdio.h>
#include<stdbool.h>
void dfs(int a[][10],int vertex,bool visited[],int n){
    printf("%d ",vertex+1);
    visited[vertex]=true;

    for(int i=0;i<n;i++){
        if(a[vertex][i]==1 && !visited[i]){
            dfs(a,i,visited,n);
        }
    }
}
void initialize(bool a[],int n){
    for(int i=0;i<n;i++){
        a[i]=false;
    }
}
int main(){
    int n;
    printf("Enter the Number of vertices :");
    scanf("%d",&n);
    int a[n][n];
    // m=n;
    for(int i=0;i<n;i++){
        for( int j=0;j<n;j++){
            printf("Enter the connection from %d to %d (1 if connection else 0):",i+1,j+1);
            scanf("%d",&a[i][j]);
        }
    }
    bool visited[n];
    initialize(visited,n);
    printf("DFS Traversal: ");
    for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(a,i,visited,n);
        }
    }
    printf("\n");
return 0;
}