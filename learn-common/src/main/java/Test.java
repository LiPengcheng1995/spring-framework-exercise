import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @author lipengcheng1995 Created date 2020-01-05 16:41
 **/
public class Test extends WeakReference<Object> {
    public Test(Object referent) {
        super(referent);
    }

    public Test(Object referent, ReferenceQueue<? super Object> q) {
        super(referent, q);
    }
}
