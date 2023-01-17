package by.zimin.autorepair.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "malfunction")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Malfunction {
    @Id
    private String id;
    private String description;
    private User user;
}
