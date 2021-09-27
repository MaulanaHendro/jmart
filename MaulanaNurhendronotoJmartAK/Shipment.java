package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3 Post test
 *
 * @Maulana Nurhendronoto (2006577542)
 */
public class Shipment implements FileParser
{
    String address;
    int shipmentCost;
    Duration duration;
    String receipt;
    
    public Shipment(String address, int shipmentCost, Duration duration, String receipt)
    {
        this.address = address;
        this.shipmentCost = shipmentCost;
        this.duration = duration;
        this.receipt = receipt;
        
    }
    
    public boolean read(String content)
    {
        return false;
    }
    
    public static class Duration
    {
        public static final Duration INSTANT = new Duration((byte)(1 << 0));
        public static final Duration SAME_DAY = new Duration((byte)(1 << 1));
        public static final Duration NEXT_DAY = new Duration((byte)(1 << 2));
        public static final Duration REGULER = new Duration((byte)(1 << 3));
        public static final Duration KARGO = new Duration((byte)(1 << 4));
        public byte bit;
        
        private Duration(byte bit)
        {
            this.bit = bit;
        }
    
    }
    
    public class MultiDuration
    {
        byte bit;
        /*
        public MultiDuration(Duration...args)
        {
            
        }*/
        
        public boolean isDuration(Duration reference)
        {
            return true;
        }
    }
    
    
    
    
    
        
    
}
