package exam01;

public enum Transportation {

    // 대체문구 및 값을 생성자로 넣어 사용할 수 있음.
    BUS("버스") {
                @Override
                public int getTotal(int person) {
                    return 1500 * person;
                }
            },
    SUBWAY("지하철") {
                @Override
                public int getTotal(int person) {
                    return 1400 * person;
                }
            },
    TAXI("택시") {
                @Override
                public int getTotal(int person) {
                    return 4500 * person;
                }
            };

    private final String title;

    Transportation(String title) // Private
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public abstract int getTotal(int person);
}
