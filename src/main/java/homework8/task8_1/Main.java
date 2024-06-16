package homework8.task8_1;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(
                OperatingSystemType.LINUX,
                "Ubuntu 22.04"
        );
        VirtualPrivateServer server = new
                VirtualPrivateServer.Builder()
                .withOperatingSystem(operatingSystem)
                .withRamVolume(64_000_000_000L)
                .withSsdVolume(512_000_000_000L)
                .build();
        System.out.println(server);
    }
}
