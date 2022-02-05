package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection implements IChannelCollection {

    private List<Channel> channelList;

    public ChannelCollection() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);   
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    @Override
    public IChannelIterator iterator(ChannelType type) {
        return new ChannelIterator(type, this.channelList);
    }

    private class ChannelIterator implements IChannelIterator {

        private ChannelType type;
        private List<Channel> channels;
        private int position;

        public ChannelIterator(ChannelType type, List<Channel> cList) {
            this.channels = cList;
            this.type = type;
        }

        @Override
        public boolean hasNext() {
            while(position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelType.ALL)) {
                    return true;
                }else position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }  
}
