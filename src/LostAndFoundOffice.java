import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object thingNew) {
    things.add(thingNew);
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        boolean flag = false;
        if (target == null) {
            flag = false;
        } else {
            for (Object object : things) { // логика проверки вещи в списке
                if (object.equals(target)) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}