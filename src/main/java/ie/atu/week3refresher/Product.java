package ie.atu.week3refresher;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message = "Id Cannot be blank")
    private String id;
    @NotBlank(message = "Name can't be blank")
    private String name;
    @PositiveOrZero(message = "Price can't be negative")
    public float price;

}
