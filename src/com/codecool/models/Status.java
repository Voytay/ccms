public enum Status {
    STAT_0(0),
    STAT_1(1),
    STAT_2(2),
    STAT_3(3);
    
    private int status;

    Rank(int status){
        this.status = status;
    }

    public int getStatus(){
        return status;
    }
}