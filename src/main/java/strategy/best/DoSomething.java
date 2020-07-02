package strategy.best;

/**
 * 策略枚举
 */
public enum DoSomething {

     TARGET_1("target1") {
         @Override
         public void excute() {
             System.out.println(getStr());
         }
     },
    TARGET_2("target2") {
        @Override
        public void excute() {
            System.out.println(getStr());
        }
    };

    private String str;

    DoSomething(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public abstract void excute();

}
