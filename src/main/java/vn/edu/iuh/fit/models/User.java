package vn.edu.iuh.fit.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@RedisHash("User")
public class User {
    @Id
    private String id;
    private String name;
}
