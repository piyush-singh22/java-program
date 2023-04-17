
class pr_4{
    public static void main(String args[]){
        int[][] a1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] a2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] a3 = new int [3][3];
        int i,j;
        
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                a3[i][j] = a1[i][j] + a2[i][j];
            }
        }
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                System.out.println("your array is:"+a3[i][j]);
            }
        }
    }
}