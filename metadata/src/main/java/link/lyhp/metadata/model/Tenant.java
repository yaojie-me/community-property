package link.lyhp.metadata.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * 租户信息
 *
 * @author yaojie
 */
@Data
@Table
public class Tenant {

    @Id
    private long id;

    private String tenantName;

    private String databaseName;

    @ReadOnlyProperty
    private LocalDateTime createTime;

    @ReadOnlyProperty
    private LocalDateTime updateTime;


}
