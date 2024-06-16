package homework8.task8_1;

import lombok.Data;

@Data
public class VirtualPrivateServer {
    private long ssdVolume;
    private long ramVolume;
    private OperatingSystem operatingSystem;

    public static class Builder {
        private final VirtualPrivateServer server = new VirtualPrivateServer();

        public Builder withSsdVolume(long volume) {
            server.ssdVolume = volume;
            return this;
        }

        public Builder withRamVolume(long volume) {
            server.ramVolume = volume;
            return this;
        }

        public Builder withOperatingSystem(OperatingSystem operatingSystem) {
            server.operatingSystem = operatingSystem;
            return this;
        }

        public VirtualPrivateServer build() {
            return server;
        }
    }
}
