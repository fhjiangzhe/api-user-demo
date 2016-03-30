package olymtech.api.user.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by JiangZhe on 16/3/30.
 */
@Data
@Entity
@Table(name = "olymtech_user")
public class User implements Serializable {
    private static final long serialVersionUID = 157154495720169252L;
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户名
     */
    private String username;
}
