package array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] a=new int[3];
        System.out.println(a);
        System.out.println(a[0]);
        a[0]=1;
        int l=a.length;
        System.out.println(a[0]+" , "+a[1]+" "+a.length);
        System.out.println(l);

        System.out.println();
        System.out.println();

        int[] b={1, 2, 3};

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println();

        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println();

        for (int item:a){
            System.out.println(item);
        }
        System.out.println();

        for (int item:b){
            System.out.println(item);
        }

        System.out.println();

        int[] ujTomb=new int[3];
        System.arraycopy(b,0,ujTomb,1,2);

        System.out.println(ujTomb.length);
        System.out.println(ujTomb[0]+" , "+ujTomb[1]+" , "+ujTomb[2]);






    }
}
