public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("cac phan tu trong mang la ");
        int max,min;
        int num[] = new int[5];
        num[0]= -9;
        num[1] = 3;
        num[2] = 7;
        num[3] = -5;
        num[4] = 8;
        min = max = num[0];
        for( int i = 1; i <5; i++ ) {
            if (num[i] > max) {
                max = num[i] ;
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Min va Max : " + min + " " + max);
        System.out.printf("Min and mix : %s %s", min, max);
    }
}
