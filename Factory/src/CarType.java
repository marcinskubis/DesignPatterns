import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CarType {
    SUV(SUV::new),
    SEDAN(Sedan::new);
    private final Supplier<Car> constructor;

    public Supplier<Car> getConstructor() {
        return constructor;
    }
}
