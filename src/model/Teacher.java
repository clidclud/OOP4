package model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "model.Teacher{" +
                "studentId = " + teacherId +
                ", firstName = " + super.getFirstName() + '\'' +
                ", secondName = " + super.getSecondName() + '\'' +
                ", lastName = " + super.getLastName() + '\'' +
                '}';
    }
//        implements Comparable<Teacher>
//        @Override
//        public int compareTo(Teacher o) {
//            if (o.getTeacherId() > teacherId)
//                return  -1;
//            if (o.getTeacherId() < teacherId)
//                return 1;
//            return 0;
//        }
}
