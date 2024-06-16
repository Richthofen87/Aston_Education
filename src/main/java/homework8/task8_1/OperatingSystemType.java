package homework8.task8_1;

import lombok.Getter;

@Getter
public enum OperatingSystemType {
    WINDOWS("Windows"),
    LINUX("Linux");

    private final String name;

    OperatingSystemType(String name) {
        this.name = name;
    }
}
