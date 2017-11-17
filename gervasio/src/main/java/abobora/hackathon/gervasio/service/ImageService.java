/**
 * 
 */
package abobora.hackathon.gervasio.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */

@Service
public class ImageService {

	public byte[] gerarQRCode(String text, int width, int height) throws WriterException, IOException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		BitMatrix matrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
		MatrixToImageWriter.writeToStream(matrix, MediaType.IMAGE_PNG.getSubtype(), baos, new MatrixToImageConfig());
		
		return baos.toByteArray();
	}
}
