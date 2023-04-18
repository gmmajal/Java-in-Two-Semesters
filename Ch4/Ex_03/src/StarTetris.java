public class StarTetris {
    public static void main(String[] args) {
        System.out.println("Printing stars in a tetris shape formation");
        for (int i =0;i<6;++i){
            if(i==2 || i==3) {
                for (int j=0;j<9;++j) {
                        System.out.print("*");
                }
            } else{
                    for (int j=0;j<3;++j) {
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
    }
}