import controler.TeacherControler;

public class Main {
    public static void main(String[] args) {

        TeacherControler controler = new TeacherControler();
        controler.create("Q", "W", "E");
        controler.create("A", "S", "D");
        controler.create("Z", "X", "C");
        controler.sendOnConsoleStudent();
    }
}