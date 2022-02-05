package behavioral.iterator;

public class Test {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        IChannelIterator baseIterator = channels.iterator(ChannelType.ALL);
        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel.toString());
        }
        System.out.println("*************");
        // channel type iterator
        IChannelIterator englishIterator = channels.iterator(ChannelType.ENGLISH);
        while(englishIterator.hasNext()) {
            Channel channel = englishIterator.next();
            System.out.println(channel.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        
        ChannelCollection channels = new ChannelCollection();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelType.TURKISH));
        channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.TURKISH));
        channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));

        return channels;
    }


}
