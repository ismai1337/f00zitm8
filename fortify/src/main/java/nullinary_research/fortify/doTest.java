package nullinary_research.fortify;
import org.eclipse.jetty.util.Loader;

public class doTest {

	public static void main(String[] args) {
	
		try {
			System.out.println("Running");
			Class<?> c = Loader.loadClass("d  ˇ ");
			System.out.println("Ran");
			Class<?> c2 = Class.forName("nullinary_research.fortify.nice");
			System.out.println("Ran");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
