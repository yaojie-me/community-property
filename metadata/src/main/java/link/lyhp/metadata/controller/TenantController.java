package link.lyhp.metadata.controller;

import link.lyhp.metadata.model.Tenant;
import link.lyhp.metadata.repository.TenantRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * 租户 controller
 *
 * @author yaojie
 */
@RestController
@RequestMapping("/meta/tenants")
public class TenantController {

    @Resource
    private TenantRepository tenantRepository;

    @GetMapping()
    Flux<Tenant> getTenants(){
        return tenantRepository.findAll();
    }

    @PostMapping()
    Mono<Tenant> addTenant(@RequestBody Tenant tenant){
        return tenantRepository.save(tenant);
    }
}
