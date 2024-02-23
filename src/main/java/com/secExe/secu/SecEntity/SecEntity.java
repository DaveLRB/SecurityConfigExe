package com.secExe.secu.SecEntity;


import com.secExe.secu.SecRole.SecRole;
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

    @Enumerated(EnumType.STRING)
    private SecRole role;

    public SecEntity(String username, String password, SecRole role) {
        this.username = username;
        this.password = password;
        this.role =role;
    }
}
