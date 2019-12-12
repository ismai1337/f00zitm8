package nullinary_research.fortify;
import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;

import javax.imageio.ImageIO;
import org.eclipse.jetty.util.Loader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class FuzzJettyLoader extends AbstractFuzzTarget {

	@Override
	public void fuzz(byte[] data) {
		 try {
			
			 String result = new String(data,"UTF-8");
			 //System.out.println(result);
	         Class<?> c = Loader.loadClass(result);
		 }catch(IOException | ClassNotFoundException e) {
			 
		 }
			
	}

}


