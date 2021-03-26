package io.quarkus.hibernate.orm.panache.kotlin.deployment.test.multiple_pu.second

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class SecondEntity : PanacheEntity() {
    var name: String? = null
}