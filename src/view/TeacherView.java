package view;

import model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnconsole(List<Teacher> list) {
        for (Teacher i : list)
            System.out.println(i + " ");
    }
}