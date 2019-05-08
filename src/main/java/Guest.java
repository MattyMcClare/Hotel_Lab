public class Guest {
    private String name;
    private int age;
    private int room;

    public Guest(String name, int age, int room) {
        this.name = name;
        this.age = age;
        this.room = room;
    }

    public String getName() {
        return this.name;
    }

    public int checkAge() {
        return this.age;
    }

    public boolean isCheckedIn() {
        return this.room > 0;
    }


//    if (!checkedIn){
//        this.room = 0;
//    } else {
//        this.room = bedroom.get
//    }


}
