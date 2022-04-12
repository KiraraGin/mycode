class ThreadExecutor {
    public static void main(String[] args) {
        Thread th[] = new Thread[100]; 
        for(int i = 0; i < 100; i++){
            th[i] = new MyThread();
            th[i].start();
        }
    }
}