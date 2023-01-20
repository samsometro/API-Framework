package request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    @Builder.Default
    private String name = "Andrii";
    @Builder.Default
    private Integer age = 12;
}
