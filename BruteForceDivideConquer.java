class faktorial{

    public static int faktorial(int n){
        int fakto = 1;
        for (int i = 1; i <= n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }

    public static int faktorialDC(int n){
        int fakto = 1;
        int i = 1;
        while (i <= n){
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
}
