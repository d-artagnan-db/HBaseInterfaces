package pt.uminho.haslab.hbaseInterfaces;

import org.apache.hadoop.hbase.HRegionLocation;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.util.Pair;

import java.io.IOException;
import java.util.List;
import java.util.NavigableMap;

public interface ExtendedHTable extends HTableInterface {


    HRegionLocation getRegionLocation(byte[] row) throws IOException;

    byte[][] getStartKeys() throws IOException;

    Pair getStartEndKeys() throws IOException;

    List getRegionsInRange(byte[] start, byte[] end) throws IOException;

    NavigableMap getRegionLocations() throws IOException;


}
