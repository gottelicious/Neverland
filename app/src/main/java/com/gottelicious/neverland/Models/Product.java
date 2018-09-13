package com.gottelicious.neverland.Models;

import java.util.Date;

public class Product extends ProductType {
    private Date expires;

    public Product(){}
    public Product(ProductType productType, Date expires)
    {
        id = productType.id;
        name = productType.name;
        this.expires = expires;
    }

    public Date getExpires() {
        return expires;
    }
}
