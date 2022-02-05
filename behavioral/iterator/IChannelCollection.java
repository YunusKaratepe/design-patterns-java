package behavioral.iterator;

public interface IChannelCollection {
    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    public IChannelIterator iterator(ChannelType type);
}
