public class SimpleCalculator {
    public int add(int...x){
        int sum=0;
        for (int i=0;i<x.length;i++){
            sum+=x[i];
        }
            return sum;
    }
    public int product(int...y){
        int product=1;
        for (int j=0;j<y.length;j++){
            product*=y[j];
        }
        return product;
    }
}
