package nullinary_research.fortify;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;

public class FuzzyItextFuzzer extends AbstractFuzzTarget {

	@Override
	public void fuzz(byte[] data) {
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfDocument document = new PdfDocument(new PdfWriter(baos));
        document.addNewPage();
		
		 ByteArrayInputStream bais = new ByteArrayInputStream(data);
	        try {
				document = new PdfDocument(new PdfReader(bais));
			} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}

	        PdfDictionary catalogDict = document.getCatalog().getPdfObject();
}
}
