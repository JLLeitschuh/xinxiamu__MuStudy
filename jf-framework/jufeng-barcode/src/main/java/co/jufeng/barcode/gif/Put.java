package co.jufeng.barcode.gif;

import java.io.OutputStream;
import java.io.IOException;

final class Put {

	static void ascii(String s, OutputStream os) throws IOException {
		byte[] bytes = new byte[s.length()];
		for (int i = 0; i < bytes.length; ++i)
			bytes[i] = (byte) s.charAt(i); // discard the high byte
		os.write(bytes);
	}

	static void leShort(int i16, OutputStream os) throws IOException {
		os.write(i16 & 0xff);
		os.write(i16 >> 8 & 0xff);
	}
}