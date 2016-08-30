import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.io.FileUtils;


public class Transfer {
	
	
	
	//public static void main(String[] args) throws IOException {

	//  File srcFolder = new File("C:\\sourceLocation\\");
	//String destFolder = new String("C:\\targetLocation\\");
	public static void main(String[] args) throws IOException {
		//EntityManager manager = EntityManager(); 
		
		
		String oldLocation1="C:\\PSI\\A\\";
		String newLocation1="C:\\PSI\\B\\";
		File srcDir = new File(oldLocation1);
		File desDir = new File(newLocation1);
		BufferedInputStream  reader = new BufferedInputStream( new FileInputStream(oldLocation1) );
		BufferedOutputStream  writer = new BufferedOutputStream( new FileOutputStream(newLocation1, false));
		
		FileUtils.copyDirectory(srcDir, desDir);
		//String oldLocation1="C:\\PSI\\A\\test";
		//String newLocation1="C:\\PSI\\B\\test";
		/*if ( !oldLocation1.isEmpty()) {
			BufferedInputStream  reader = new BufferedInputStream( new FileInputStream(oldLocation1) );
			BufferedOutputStream  writer = new BufferedOutputStream( new FileOutputStream(newLocation1, false));
			try {
				byte[]  buff = new byte[8192];
				int numChars;
				while ( (numChars = reader.read(  buff, 0, buff.length ) ) != -1) {
					writer.write( buff, 0, numChars );
				}
			} catch( IOException ex ) {
				//throw new IOException("IOException when transferring " + oldLocation.getPath() + " to " + newLocation.getPath());
			} finally {
				try {
					if ( reader != null ){                      
						writer.close();
						reader.close();
					}
				} catch( IOException ex ){

				}
			}
		} else {
			//throw new IOException("Old location does not exist when transferring " + oldLocation1.getPath() + " to " + newLocation1.getPath() );
		}*/
	} 


}
