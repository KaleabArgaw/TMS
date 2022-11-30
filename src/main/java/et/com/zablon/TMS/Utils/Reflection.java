package et.com.zablon.TMS.Utils;

public class Reflection {

    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch(ClassCastException e) {
            return null;
        }
    }

    public static<T> String  getClassName (T obj ){
        return obj.getClass().getSimpleName();
    }
}