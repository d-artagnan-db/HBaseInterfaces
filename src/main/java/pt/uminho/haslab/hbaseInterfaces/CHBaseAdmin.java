package pt.uminho.haslab.hbaseInterfaces;

import org.apache.hadoop.hbase.ClusterStatus;
import org.apache.hadoop.hbase.HRegionInfo;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;

import java.io.IOException;
import java.util.List;

public interface CHBaseAdmin {


    void createTable(final HTableDescriptor descriptor) throws IOException, InterruptedException;
    void createTable(final HTableDescriptor descriptor, byte[][] splitkeys) throws IOException, InterruptedException;
    void deleteTable(String tableName) throws IOException ;
    void disableTable(String tableName) throws IOException;
    boolean tableExists(String tableName) throws IOException ;
    boolean isTableAvailable(String tableName) throws IOException;
    void createTableAsync(HTableDescriptor descriptor, byte[][] splitKeys) throws IOException;
    ClusterStatus getClusterStatus() throws IOException;
    TableName[] listTableNames() throws IOException;
    List<HRegionInfo>  getTableRegions(TableName tableName) throws IOException;
    void close() throws IOException ;
}
