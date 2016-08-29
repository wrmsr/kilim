package kilim.tools;

import kilim.WeavingClassLoader;

import java.lang.reflect.Method;

/**
 * Invoke as java -Dkilim.class.path="classDir1:classDir2:jar1.jar:..." kilim.tools.Kilim  class args...
 * <p>
 * This class dynamically weaves kilim-related classes and runs "class". The classpath
 * specified must not be in the main classpath, otherwise the system class loader will
 * use the raw, unwoven classes.
 */
public class Kilim
{
    public static void main(String[] args)
            throws Exception
    {
        if (args.length == 0) {
            usage();
        }
        String className = args[0];
        args = processArgs(args);
        WeavingClassLoader wcl = new WeavingClassLoader(Thread.currentThread().getContextClassLoader());
        Class<?> mainClass = wcl.loadClass(className);
        Method mainMethod = mainClass.getMethod("main", new Class[] {String[].class});
        mainMethod.invoke(null, new Object[] {args});
    }

    private static void usage()
    {
        System.out.println("java -Dkilim.classpath kilim.tools.Kilim class [args ...]");
        System.exit(1);
    }

    private static String[] processArgs(String[] args)
    {
        String[] ret = new String[args.length - 1];
        if (ret.length > 0) {
            System.arraycopy(args, 1, ret, 0, ret.length);
        }
        return ret;
    }
}
