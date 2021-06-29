
public class Tabular{
public static void main( String[] args){
int i; 
System.out.println("N\t10*N\t100*N\t1000*N");
System.out.println();
for(i=1;i<=5;i++){
System.out.printf("%d\t%d\t%d\t%d",i,i*10,i*100,i*1000);
System.out.println();
}
}
}