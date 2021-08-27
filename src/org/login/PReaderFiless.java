package org.login;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PReaderFiless {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\EmployeeInfo\\PdfReader\\Kishore Kumar Resume.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String text = pdfTextStripper.getText(document);
		for (int i = 0; i < text.length(); i++) {

			if (i == 10) {
				System.out.println(text);
			}

		}
		
		document.close();
	}

}
