package link.lyhp.metadata.repository;

import link.lyhp.metadata.model.Tenant;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * 租户持久化
 *
 * @author yaojie
 */
public interface TenantRepository extends ReactiveCrudRepository<Tenant,Long> {


}
