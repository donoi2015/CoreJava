package ocjp.ch1.nestedclasses;

/**
 * @author ts-tuluv.battulga
 */
public class Browsers {
    public static void main(String[] args) {
        Browser b = new Firefox();
        //        IE e = (IE) b;
        //        e.go();
        if (b.equals(4)) {
            System.out.println("good");
        } else {
            System.out.println("not good");
        }
    }

    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    static class IE extends Browser {
        @Override public void go() {
            System.out.println("Inside IE");
        }
    }
}
