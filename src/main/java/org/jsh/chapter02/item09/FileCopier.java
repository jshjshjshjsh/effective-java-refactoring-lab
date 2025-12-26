package org.jsh.chapter02.item09;

import java.io.*;

public class FileCopier {
    private static final int BUFFER_SIZE = 8 * 1024;

    // Bad Code: 자원이 2개일 때 try-finally 방식
    public void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close(); // 여기서 예외 터지면 in.close()는 실행도 못할 수도 있음 (구조에 따라 다름)
            }
        } finally {
            in.close();
        }
    }
}