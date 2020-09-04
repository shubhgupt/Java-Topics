
package qrGenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class qrCodeGenerator {
    public static void main(String[] args) throws Exception
    {
        String details = "https://placementseekers.in/";
        
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        
        File f = new File("E:\\java programming\\qrcode generator\\MyQRcode.JPG");
        
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }
}
