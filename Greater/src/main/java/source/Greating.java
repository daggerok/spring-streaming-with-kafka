package source;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by mak on 8/1/16.
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Greating implements Serializable {
    String greating;
}
