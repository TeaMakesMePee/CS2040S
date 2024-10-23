import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class problems2 {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        PrintWriter pw = new PrintWriter(System.out);

        TreeMap<Long, Long> map = new TreeMap<>();
        Long probs = r.nextLong(), discards = r.nextLong();

        //String[] probStr = r.readLine().split(" ");
        for (int x = 0; x < probs; ++x) {
            Long v = r.nextLong();
            Long count = map.get(v);
            map.put(v, count != null ? ++count : 1);
        }

        Entry<Long, Long> e = null;
        for (long y = 0; y < discards; ++y) {
            Long l = r.nextLong();
            Long k = r.nextLong();
            e = l == 1 ? map.higherEntry(k) : map.floorEntry(k);
            pw.println(e != null ? e.getKey() : "-1");
            if (e != null) { 
                if (e.getValue() == 1) { map.remove(e.getKey()); } 
                else { map.put(e.getKey(), e.getValue() - 1); }
            }
        }
        pw.flush();
    }
}