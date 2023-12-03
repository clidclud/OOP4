package view;
import model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole (List<T> list);
}
