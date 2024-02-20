package com.secExe.secu.SecEntity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Builder
@Entity
@Table(name = "SecTable")
public class SecEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public SecEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
